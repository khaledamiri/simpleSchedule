package com.example.schedule.schedulerdemo.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.schedule.schedulerdemo.models.Stats;
import com.example.schedule.schedulerdemo.repositories.StatsRepositories;

@Service
public class StatsServiceImpl implements StatsService {

	
	@Autowired
	StatsRepositories statsRepositories;
	
	@Override
	public List<Stats> findByHeureDebAfterAndHeureFinBefore(Date hDeb, Date hFin) {
		
		return statsRepositories.findByHeureDebAfterAndHeureFinBefore(hDeb, hFin);
	}

}
