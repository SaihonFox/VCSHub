package com.polus_plus.vcshub.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.polus_plus.vcshub.R;
public class MainActivity extends AppCompatActivity {
	CardView github;
	CardView gitlab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		github = findViewById(R.id.github_cardview);
		gitlab = findViewById(R.id.gitlab_cardview);
		
		BottomSheetDialog dialog = new BottomSheetDialog(this);
		
		dialog.create();
		dialog.show();
		
		github.setOnClickListener(view ->
				startActivity(new Intent(this, LoginByActivity.class).putExtra("login-by", "GitHub")));
		gitlab.setOnClickListener(view ->
				startActivity(new Intent(this, LoginByActivity.class).putExtra("login-by", "GitLab")));
	}
}