package com.example.schedule.schedulerdemo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.schedule.schedulerdemo.models.Stats;

@Repository
public interface StatsRepositories extends JpaRepository<Stats, Long> {

	// @Query("select s from Stats s where s.heureDeb> and s.heureFin<")
	public List<Stats> findByHeureDebAfterAndHeureFinBefore(Date hDeb, Date hFin);

}
