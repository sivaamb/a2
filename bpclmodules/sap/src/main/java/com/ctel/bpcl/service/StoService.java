package com.ctel.bpcl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ctel.bpcl.entity.Sto;
import com.ctel.bpcl.entity.StoDetail;
import com.ctel.bpcl.model.Response;
import com.ctel.bpcl.repo.StoDetailRepo;
import com.ctel.bpcl.repo.StoRepo;

@Service
public class StoService {

	private Logger logger = LoggerFactory.getLogger(StoService.class);

	private StoRepo stoRepo;
	private StoDetailRepo stoDetailRepo;

	@Autowired
	public StoService(StoRepo stoRepo, StoDetailRepo stoDetailRepo) {
		this.stoRepo = stoRepo;

		this.stoDetailRepo = stoDetailRepo;

	}

	@Transactional
	public ResponseEntity<?> createStoDetails(List<Sto> stos) {

		logger.info("===>>>>>>>>>>paload size is: {} ", stos.size());

		if (stos.isEmpty()) {
			return ResponseEntity.ok()
					.body(new Response(HttpStatus.NOT_ACCEPTABLE.value(), "given content is not acceptable", null));

		} else {

			for (Sto sto : stos) {
				Sto stoWithId = stoRepo.save(sto);

				for (StoDetail stoDetail : sto.getStoDetails()) {

					stoDetail.setStoId(stoWithId.getId());
					stoDetailRepo.save(stoDetail);
				}

			}

		}

		return ResponseEntity.ok()
				.body(new Response(HttpStatus.CREATED.value(), "sto details added successfully", null));

	}

}
