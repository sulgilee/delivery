package com.delivery.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delivery.domain.Driver;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {

}
