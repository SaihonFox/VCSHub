package com.polus_plus.vcshub.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.polus_plus.vcshub.R;

public class LoginByActivity extends AppCompatActivity {
	Bundle extras;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_by);
		
		extras = getIntent().getExtras();
		((TextView) findViewById(R.id.loginby)).setText(extras.getString("login-by"));
	}
}