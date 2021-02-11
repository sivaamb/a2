package com.ctel.bpcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctel.bpcl.entity.CouponsDetails;

/**
 * 
 * @author Gowtham
 * 
 * CouponsDetailsRepo contains the full API of CrudRepository and PagingAndSortingRepository . 
 * So it contains API for basic CRUD operations and also API for pagination and sorting.
 */
public interface CouponsDetailsRepo extends JpaRepository<CouponsDetails, Long>{

}
