package com.ctel.bpcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctel.bpcl.entity.Coupons;

/**
 * 
 * @author Gowtham
 * 
 * CouponsRepo contains the full API of CrudRepository and PagingAndSortingRepository . 
 * So it contains API for basic CRUD operations and also API for pagination and sorting.
 */
public interface CouponsRepo extends JpaRepository<Coupons, Long>{

}
