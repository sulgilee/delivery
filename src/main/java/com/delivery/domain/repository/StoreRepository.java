package com.delivery.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delivery.domain.Store;

@Repository
public interface StoreRepository extends CrudRepository<Store, Long> {

}
