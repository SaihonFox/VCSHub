package com.polus_plus.vcshub.REST_APIs.GitHub;

import com.polus_plus.vcshub.REST_APIs.GitHub.User.User;
import com.polus_plus.vcshub.REST_APIs.GitHub.Users.Following;
import com.polus_plus.vcshub.REST_APIs.GitHub.Users.Orgs;
import com.polus_plus.vcshub.REST_APIs.GitHub.Users.Repos;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Url;

public interface GitHubJSONPlaceHolder {
	@GET("user")
	Call<User> getUser(@Header("Authorization") String bearerToken);
	
	@GET("user/repos")
	Call<ArrayList<Repos>> getRepos(@Header("Authorization") String bearerToken);
	
	@GET("following")
	Call<ArrayList<Following>> getFollowing(@Header("Authorization") String bearerToken);
	
	@GET("orgs")
	Call<ArrayList<Orgs>> getOrgs(@Header("Authorization") String bearerToken);
	
	@GET
	Call<ArrayList<Repos>> getStarred(@Url String url, @Header("Authorization") String bearerToken);
}