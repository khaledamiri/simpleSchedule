package com.example.schedule.schedulerdemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.schedule.schedulerdemo.models.Stats;
import com.example.schedule.schedulerdemo.repositories.StatsRepositories;

@SpringBootApplication
@EnableScheduling
public class SchedulerDemoApplication implements CommandLineRunner {

	@Autowired
	StatsRepositories statsRepositories;

	public static void main(String[] args) {
		SpringApplication.run(SchedulerDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

//		Date d = new SimpleDateFormat("dd/MM/yyyy").parse("12/04/2018");
//		String dst = new SimpleDateFormat("dd/MM/yyyy").format(d);

		Date hDeb = new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2018");
		Date hFin = new SimpleDateFormat("dd/MM/yyyy").parse("11/06/2018");

		// Stats s = statsRepositories.save(new Stats("stats 1",
		// new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2018"),
		// new SimpleDateFormat("dd/MM/yyyy").parse("30/06/2018")));
		// System.out.println(s);

		List<Stats> lists = statsRepositories
				.findByHeureDebAfterAndHeureFinBefore(hDeb, hFin);
		
		System.out.println("*********************");
		lists.forEach(item -> System.out.println(item));
		System.out.println("*********************");

	}
}
