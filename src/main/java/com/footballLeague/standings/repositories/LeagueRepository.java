package com.footballLeague.standings.repositories;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.footballLeague.standings.model.League;

@Repository
public class LeagueRepository {

	@Value("${api-host}")
	private String footballApiHost;
	
	@Value("${api-key}")
	private String apiKey;
	
	public League getLeagueByName(String name, Integer countryId) {
		RestTemplate restTemplate = new RestTemplate();
		String uri = footballApiHost+ "?action=get_leagues&country_id="+ countryId+"&APIkey="+apiKey;
	    League[] leagueList= restTemplate.getForObject(uri, League[].class);
	    return Arrays.stream(leagueList).filter(coutnry -> coutnry.getName().equalsIgnoreCase(name)).findFirst().get();
	}
}
