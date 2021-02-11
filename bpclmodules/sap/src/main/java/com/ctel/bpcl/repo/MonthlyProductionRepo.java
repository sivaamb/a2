package com.ctel.bpcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctel.bpcl.entity.MonthlyProduction;

public interface MonthlyProductionRepo extends JpaRepository<MonthlyProduction, Long>{

}
