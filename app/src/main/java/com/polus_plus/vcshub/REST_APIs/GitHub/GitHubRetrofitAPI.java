package com.polus_plus.vcshub.REST_APIs.GitHub;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GitHubRetrofitAPI {
	public static String url = "https://api.github.com/";
	public static Retrofit retrofit;
	
	public static Retrofit instance() {
		if(retrofit == null)
			retrofit = new Retrofit.Builder()
					.baseUrl(url)
					.addConverterFactory(GsonConverterFactory.create())
					.build();
		return retrofit;
	}
	
	public static GitHubJSONPlaceHolder api() {
		return instance().create(GitHubJSONPlaceHolder.class);
	}
}