package com.delivery.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.delivery.domain.AbstractEntity;

import lombok.Data;

@Data
@MappedSuperclass
public class StoreDetailDto extends AbstractEntity {
    @Id private Long id;
    @Column(nullable=false, length=255, unique=true)
    private String address;
    @Column(nullable=false, length=255)
    private String name;
    @Column(nullable=false, length=255)
    private String store_name;
}
