package com.footballLeague.standings.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Standing {
	
	@JsonProperty("country_name")
	private String countryName;
	@JsonProperty("league_id")
	private Integer leagueId;
	@JsonProperty("league_name")
	private String leagueName;
	@JsonProperty("team_id")
	private Integer teamId;
	@JsonProperty("team_name")
	private String teamName;
	@JsonProperty("overall_league_position")
	private Integer overallLeaguePosition;

	private Integer countryId;
	
	
	/**
	 * @return the countryId
	 */
	public Integer getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Integer getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getOverallLeaguePosition() {
		return overallLeaguePosition;
	}
	public void setOverallLeaguePosition(Integer overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}

}
