package com.polus_plus.vcshub.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.polus_plus.vcshub.R;
import com.polus_plus.vcshub.REST_APIs.GitHub.GitHubRetrofitAPI;
import com.polus_plus.vcshub.REST_APIs.GitHub.GitHubUserData;
import com.polus_plus.vcshub.REST_APIs.GitHub.User.User;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GitHubActivity extends AppCompatActivity {
	Bundle extras;
	
	SharedPreferences prefs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_git_hub);
		
		prefs = getSharedPreferences("isLogined", Context.MODE_PRIVATE);
		SharedPreferences avatarPrefs = getSharedPreferences("avatarStyle", Context.MODE_PRIVATE);
		CardView avatarCardView = findViewById(R.id.avatar_cardview);
		avatarCardView.setRadius(avatarPrefs.getFloat("radius", 0));
		
		ImageView avatar = findViewById(R.id.avatar_imageview);
		
		extras = getIntent().getExtras();
		
		Call<User> userCall;
		if(extras != null)
			userCall = GitHubRetrofitAPI.api().getUser("Bearer " + extras.getString("token"));
		else
			userCall = GitHubRetrofitAPI.api().getUser("Bearer " + prefs.getString("token", ""));
		userCall.enqueue(new Callback<>() {
			@Override
			public void onResponse(Call<User> call, Response<User> response) {
				if(!response.isSuccessful()) {
					Toast.makeText(GitHubActivity.this, "Code: " + response.message() + "\nRaw: " + response.raw(), Toast.LENGTH_SHORT).show();
					return;
				}
				
				if(response.body() == null)
					return;
				
				User user = response.body();
				Picasso.get().load(user.getAvatar_url()).into(avatar);
				GitHubUserData.login = user.getLogin();
				GitHubUserData.bearerToken = "Bearer " + extras.getString("token");
			}
			
			@Override
			public void onFailure(Call<User> call, Throwable t) {
				Toast.makeText(GitHubActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
			}
		});
	}
}