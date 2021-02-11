package com.ctel.bpcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ctel.bpcl.entity.MonthlyProduction;
import com.ctel.bpcl.model.Response;
import com.ctel.bpcl.repo.MonthlyProductionRepo;

@Service
public class MonthlyProductionService {

	private Logger logger = LoggerFactory.getLogger(MonthlyProductionService.class);

	private MonthlyProductionRepo monthlyProductionRepo;

	@Autowired
	public MonthlyProductionService(MonthlyProductionRepo monthlyProductionRepo) {
		this.monthlyProductionRepo = monthlyProductionRepo;

	}

	@Transactional
	public ResponseEntity<?> createMonthlyProduction(List<MonthlyProduction> monthlyProductions) {

		logger.info("===>>>>>>>>>>paload size is: {} ", monthlyProductions.size());

		if (monthlyProductions.isEmpty()) {

			return ResponseEntity.notFound().build();

		} else {

			monthlyProductionRepo.saveAll(monthlyProductions);

		}

		return ResponseEntity.ok()
				.body(new Response(HttpStatus.CREATED.value(), "Monthly Production details added successfully", null));

	}

}
