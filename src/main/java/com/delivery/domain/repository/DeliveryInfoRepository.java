package com.delivery.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.delivery.domain.DeliveryInfo;

@Repository
public interface DeliveryInfoRepository extends CrudRepository<DeliveryInfo, Long> {
    
}
