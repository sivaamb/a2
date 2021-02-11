package com.ctel.bpcl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ctel.bpcl.entity.Coupons;
import com.ctel.bpcl.service.CouponsService;

/**
 * 
 * @author Gowtham
 * 
 *         CouponsController is processed if an appropriate
 *         HandlerMapping-HandlerAdapter pair is configured such as the
 *         RequestMappingHandlerMapping-RequestMappingHandlerAdapter pair which
 *         are the default in the MVC Java
 */
@RestController
public class CouponsController {

	@Autowired
	private CouponsService couponsService;

	private Logger logger = LoggerFactory.getLogger(CouponsController.class);

	/**
	 * insert the coupon details into bpcl_coupons and bpcl_coupons_details tables
	 * 
	 * @param coupons
	 * @return application/json
	 */
	@PostMapping("d/addCoupons")
	public ResponseEntity<?> addCouponDetails(@RequestBody Coupons coupons) {

		logger.info("add Coupon Details {}", coupons.getLocCode());
		return couponsService.createCoupons(coupons);

	}

}
