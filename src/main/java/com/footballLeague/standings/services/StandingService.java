package com.footballLeague.standings.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballLeague.standings.model.Standing;
import com.footballLeague.standings.repositories.CountryRepository;
import com.footballLeague.standings.repositories.LeagueRepository;
import com.footballLeague.standings.repositories.StandingRepository;
import com.footballLeague.standings.repositories.TeamRepository;

@Service
public class StandingService {
    @Autowired
	private CountryRepository countryRepository;
    @Autowired
	private LeagueRepository leagueRepository;
    @Autowired
	private TeamRepository teamRepository;
	@Autowired
	private StandingRepository standingRepository;
	
	public Standing getStanding(String countryName, String leagueName, String teamName) {
		Integer countryId = countryRepository.getCountryByName(countryName).getId();
		System.out.println( countryId );
		//Integer leagueId = leagueRepository.getLeagueByName(leagueName, 41).getId();
		Integer teamId = teamRepository.getTeamByName(teamName, 148).getTeamId();
		Standing standing = standingRepository.getStanding(148, teamId);
		standing.setCountryId(countryId);
		return standing;
	}
}
