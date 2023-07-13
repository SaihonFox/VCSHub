package com.polus_plus.vcshub.REST_APIs.GitHub.Users;

import com.google.gson.annotations.SerializedName;

public class Repos {
	long id;
	String node_id;
	String name;
	String full_name;
	@SerializedName("private")
	boolean _private;
	Owner owner;
	String html_url;
	String description;
	boolean fork;
	String url;
	String forks_url;
	String keys_url;
	String collaborators_url;
	String teams_url;
	String hooks_url;
	String issue_events_url;
	String events_url;
	String assignees_url;
	String branches_url;
	String tags_url;
	String blobs_url;
	String git_tags_url;
	String git_refs_url;
	String trees_url;
	String statuses_url;
	String languages_url;
	String stargazers_url;
	String contributors_url;
	String subscribers_url;
	String subscription_url;
	String commits_url;
	String git_commits_url;
	String comments_url;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNode_id() {
		return node_id;
	}
	
	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFull_name() {
		return full_name;
	}
	
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	
	public boolean is_private() {
		return _private;
	}
	
	public void set_private(boolean _private) {
		this._private = _private;
	}
	
	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public String getHtml_url() {
		return html_url;
	}
	
	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isFork() {
		return fork;
	}
	
	public void setFork(boolean fork) {
		this.fork = fork;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getForks_url() {
		return forks_url;
	}
	
	public void setForks_url(String forks_url) {
		this.forks_url = forks_url;
	}
	
	public String getKeys_url() {
		return keys_url;
	}
	
	public void setKeys_url(String keys_url) {
		this.keys_url = keys_url;
	}
	
	public String getCollaborators_url() {
		return collaborators_url;
	}
	
	public void setCollaborators_url(String collaborators_url) {
		this.collaborators_url = collaborators_url;
	}
	
	public String getTeams_url() {
		return teams_url;
	}
	
	public void setTeams_url(String teams_url) {
		this.teams_url = teams_url;
	}
	
	public String getHooks_url() {
		return hooks_url;
	}
	
	public void setHooks_url(String hooks_url) {
		this.hooks_url = hooks_url;
	}
	
	public String getIssue_events_url() {
		return issue_events_url;
	}
	
	public void setIssue_events_url(String issue_events_url) {
		this.issue_events_url = issue_events_url;
	}
	
	public String getEvents_url() {
		return events_url;
	}
	
	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}
	
	public String getAssignees_url() {
		return assignees_url;
	}
	
	public void setAssignees_url(String assignees_url) {
		this.assignees_url = assignees_url;
	}
	
	public String getBranches_url() {
		return branches_url;
	}
	
	public void setBranches_url(String branches_url) {
		this.branches_url = branches_url;
	}
	
	public String getTags_url() {
		return tags_url;
	}
	
	public void setTags_url(String tags_url) {
		this.tags_url = tags_url;
	}
	
	public String getBlobs_url() {
		return blobs_url;
	}
	
	public void setBlobs_url(String blobs_url) {
		this.blobs_url = blobs_url;
	}
	
	public String getGit_tags_url() {
		return git_tags_url;
	}
	
	public void setGit_tags_url(String git_tags_url) {
		this.git_tags_url = git_tags_url;
	}
	
	public String getGit_refs_url() {
		return git_refs_url;
	}
	
	public void setGit_refs_url(String git_refs_url) {
		this.git_refs_url = git_refs_url;
	}
	
	public String getTrees_url() {
		return trees_url;
	}
	
	public void setTrees_url(String trees_url) {
		this.trees_url = trees_url;
	}
	
	public String getStatuses_url() {
		return statuses_url;
	}
	
	public void setStatuses_url(String statuses_url) {
		this.statuses_url = statuses_url;
	}
	
	public String getLanguages_url() {
		return languages_url;
	}
	
	public void setLanguages_url(String languages_url) {
		this.languages_url = languages_url;
	}
	
	public String getStargazers_url() {
		return stargazers_url;
	}
	
	public void setStargazers_url(String stargazers_url) {
		this.stargazers_url = stargazers_url;
	}
	
	public String getContributors_url() {
		return contributors_url;
	}
	
	public void setContributors_url(String contributors_url) {
		this.contributors_url = contributors_url;
	}
	
	public String getSubscribers_url() {
		return subscribers_url;
	}
	
	public void setSubscribers_url(String subscribers_url) {
		this.subscribers_url = subscribers_url;
	}
	
	public String getSubscription_url() {
		return subscription_url;
	}
	
	public void setSubscription_url(String subscription_url) {
		this.subscription_url = subscription_url;
	}
	
	public String getCommits_url() {
		return commits_url;
	}
	
	public void setCommits_url(String commits_url) {
		this.commits_url = commits_url;
	}
	
	public String getGit_commits_url() {
		return git_commits_url;
	}
	
	public void setGit_commits_url(String git_commits_url) {
		this.git_commits_url = git_commits_url;
	}
	
	public String getComments_url() {
		return comments_url;
	}
	
	public void setComments_url(String comments_url) {
		this.comments_url = comments_url;
	}
}

class Owner {
	String login;
	long id;
	String node_id;
	String avatar_url;
	String gravatar_id;
	String url;
	String html_url;
	String followers_url;
	String following_url;
	String gists_url;
	String starred_url;
	String subscriptions_url;
	String organizations_url;
	String repos_url;
	String events_url;
	String received_events_url;
	String type;
	boolean site_admin;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNode_id() {
		return node_id;
	}
	
	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}
	
	public String getAvatar_url() {
		return avatar_url;
	}
	
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	
	public String getGravatar_id() {
		return gravatar_id;
	}
	
	public void setGravatar_id(String gravatar_id) {
		this.gravatar_id = gravatar_id;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getHtml_url() {
		return html_url;
	}
	
	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}
	
	public String getFollowers_url() {
		return followers_url;
	}
	
	public void setFollowers_url(String followers_url) {
		this.followers_url = followers_url;
	}
	
	public String getFollowing_url() {
		return following_url;
	}
	
	public void setFollowing_url(String following_url) {
		this.following_url = following_url;
	}
	
	public String getGists_url() {
		return gists_url;
	}
	
	public void setGists_url(String gists_url) {
		this.gists_url = gists_url;
	}
	
	public String getStarred_url() {
		return starred_url;
	}
	
	public void setStarred_url(String starred_url) {
		this.starred_url = starred_url;
	}
	
	public String getSubscriptions_url() {
		return subscriptions_url;
	}
	
	public void setSubscriptions_url(String subscriptions_url) {
		this.subscriptions_url = subscriptions_url;
	}
	
	public String getOrganizations_url() {
		return organizations_url;
	}
	
	public void setOrganizations_url(String organizations_url) {
		this.organizations_url = organizations_url;
	}
	
	public String getRepos_url() {
		return repos_url;
	}
	
	public void setRepos_url(String repos_url) {
		this.repos_url = repos_url;
	}
	
	public String getEvents_url() {
		return events_url;
	}
	
	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}
	
	public String getReceived_events_url() {
		return received_events_url;
	}
	
	public void setReceived_events_url(String received_events_url) {
		this.received_events_url = received_events_url;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean isSite_admin() {
		return site_admin;
	}
	
	public void setSite_admin(boolean site_admin) {
		this.site_admin = site_admin;
	}
}