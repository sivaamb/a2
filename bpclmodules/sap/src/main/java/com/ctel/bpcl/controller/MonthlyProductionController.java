package com.ctel.bpcl.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ctel.bpcl.entity.MonthlyProduction;
import com.ctel.bpcl.service.MonthlyProductionService;

@RestController
public class MonthlyProductionController {
	private Logger logger = LoggerFactory.getLogger(MonthlyProductionController.class);

	@Autowired
	private MonthlyProductionService monthlyProductionService;

	@PostMapping("d/addMonthlyProductionDetails")
	public @ResponseBody ResponseEntity<?> addStoDetails(@RequestBody List<MonthlyProduction> monthlyProductions) {
		logger.info("add monthly Production Details");

		return monthlyProductionService.createMonthlyProduction(monthlyProductions);

	}

}
