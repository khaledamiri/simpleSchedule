package com.example.schedule.schedulerdemo.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.schedule.schedulerdemo.models.Stats;


public interface StatsService {

	public List<Stats> findByHeureDebAfterAndHeureFinBefore(Date hDeb, Date hFin);

}
