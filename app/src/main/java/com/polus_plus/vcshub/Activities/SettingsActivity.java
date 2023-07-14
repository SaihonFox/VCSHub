package com.polus_plus.vcshub.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.polus_plus.vcshub.R;
import com.polus_plus.vcshub.Tools;

public class SettingsActivity extends AppCompatActivity {
	SharedPreferences prefs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		prefs = getSharedPreferences("avatarStyle", Context.MODE_PRIVATE);
		switch (prefs.getString("style", "")) {
			case "square" ->
					prefs.edit().putFloat("radius", Tools.convertDpToPixel(0, this)).apply();
			case "squircle" ->
					prefs.edit().putFloat("radius", Tools.convertDpToPixel(8, this)).apply();
			case "round" ->
					prefs.edit().putFloat("radius", Tools.convertDpToPixel(100, this)).apply();
		}
	}
}