package com.example.schedule.schedulerdemo.schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.schedule.schedulerdemo.models.Stats;
import com.example.schedule.schedulerdemo.services.StatsService;

@Component
public class ScheduledTasks {
	private static final Logger logger = LoggerFactory
			.getLogger(ScheduledTasks.class);
	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter
			.ofPattern("HH:mm:ss");

	@Autowired
	StatsService statsService;

	/*
	 * All the scheduled methods should follow the following two criteria - -
	 * The method should have a void return type. - The method should not accept
	 * any arguments.
	 */

	@Scheduled(fixedRate = 9000)
	public void scheduleTaskWithFixedRate() throws ParseException {
		logger.info("Fixed Rate Task :: Execution Time - {}",
				dateTimeFormatter.format(LocalDateTime.now()));

		List<Stats> listStats = statsService
				.findByHeureDebAfterAndHeureFinBefore(new SimpleDateFormat(
						"dd/MM/yyyy").parse("01/04/2018"),
						new SimpleDateFormat("dd/MM/yyyy").parse("11/06/2018"));
		
		listStats.forEach(item->System.out.println(item));
	}

	public void scheduleTaskWithFixedDelay() {
	}

	public void scheduleTaskWithInitialDelay() {
	}

	public void scheduleTaskWithCronExpression() {
	}
}