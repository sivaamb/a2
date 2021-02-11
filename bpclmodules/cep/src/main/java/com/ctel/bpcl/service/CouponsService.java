package com.ctel.bpcl.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ctel.bpcl.entity.Coupons;
import com.ctel.bpcl.entity.CouponsDetails;
import com.ctel.bpcl.model.GlobalException;
import com.ctel.bpcl.model.Response;
import com.ctel.bpcl.repo.CouponsDetailsRepo;
import com.ctel.bpcl.repo.CouponsRepo;

/**
 * 
 * @author Gowtham
 *
 */
@Service
public class CouponsService {

	private Logger logger = LoggerFactory.getLogger(CouponsService.class);

	private CouponsRepo couponsRepo;
	private CouponsDetailsRepo couponsDetailsRepo;

	/**
	 * constructor based dependency injection
	 * 
	 * @param couponsRepo
	 * @param couponsDetailsRepo
	 */
	@Autowired
	public CouponsService(CouponsRepo couponsRepo, CouponsDetailsRepo couponsDetailsRepo) {
		this.couponsRepo = couponsRepo;
		this.couponsDetailsRepo = couponsDetailsRepo;
	}

	/**
	 * insert the coupon details into bpcl_coupons and bpcl_coupons_details tables
	 * 
	 * @param coupons
	 * @return success or failure response
	 */
	@Transactional
	public ResponseEntity<?> createCoupons(Coupons coupons) {

		logger.info("Coupon Loc code {}", coupons.getLocCode());

		Coupons coupon = couponsRepo.save(coupons);

		if(coupon.getId()!=0) {
			if (coupons.getCouponsDetails().size() != 0) {
				for (CouponsDetails couponsDetails : coupons.getCouponsDetails()) {
					couponsDetails.setCouponsId(coupon.getId());
					couponsDetailsRepo.save(couponsDetails);
				}
			}	
		}else {
			throw new GlobalException(HttpStatus.NOT_MODIFIED, "Not Acceptable content");

		}
		
		return ResponseEntity.ok().body(new Response(HttpStatus.CREATED.value(), "coupons added successfully", null));

	}

}
