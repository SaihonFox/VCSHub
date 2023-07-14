package com.polus_plus.vcshub.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.polus_plus.vcshub.R;

public class MainActivity extends AppCompatActivity {
	CardView github;
	CardView gitlab;
	SharedPreferences prefs;
	
	MainActivity instance;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		prefs = getSharedPreferences("isLogined", Context.MODE_PRIVATE);
		instance = this;
		
		github = findViewById(R.id.github_cardview);
		gitlab = findViewById(R.id.gitlab_cardview);
		
		github.setOnClickListener(view -> {
			if (!prefs.getBoolean("GitHub", false)) {
				loginDialog("GitHub", GitHubActivity.class);
				return;
			}
			startActivity(new Intent(this, GitHubActivity.class).putExtra("token", prefs.getString("token", "")));
			finish();
		});
		gitlab.setOnClickListener(view -> {
			if(!prefs.getBoolean("GitLab", false)) {
				loginDialog("GitLab", GitLabActivity.class);
				return;
			}
			startActivity(new Intent(this, GitLabActivity.class).putExtra("token", prefs.getString("token", "")));
			finish();
		});
	}
	
	void loginDialog(String login, Class activityClass) {
		AlertDialog dialog = new AlertDialog.Builder(this).create();
		View dialogView = getLayoutInflater().inflate(R.layout.loginby_dialog, null);
		dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_bg);
		dialog.setView(dialogView);
		
		TextView loginbyText = dialogView.findViewById(R.id.loginby_textview);
		loginbyText.setText("Login by " + login);
		
		CheckBox remembertokenCheckBox = dialogView.findViewById(R.id.remembertoken_checkbox);
		
		EditText tokenEditText = dialogView.findViewById(R.id.token_edittext);
		
		dialogView.findViewById(R.id.login_button).setOnClickListener(view -> {
			if(tokenEditText.getText().toString().trim().length() == 0) {
				Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
				return;
			}
			
			if(remembertokenCheckBox.isChecked())
				prefs.edit().putString("token", tokenEditText.getText().toString()).apply();
			
			startActivity(new Intent(this, activityClass)
					.putExtra("token", tokenEditText.getText()));
		});
		
		dialog.show();
	}
}