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

import com.ctel.bpcl.entity.Sto;
import com.ctel.bpcl.service.StoService;

@RestController
public class StoController {
	private Logger logger = LoggerFactory.getLogger(StoController.class);

	@Autowired
	private StoService stoService;

	@PostMapping("d/addStoDetails")
	public @ResponseBody ResponseEntity<?> addStoDetails(@RequestBody List<Sto> stoDetails) {
		logger.info("add Sto Details");
		
		return stoService.createStoDetails(stoDetails);

	}

}
