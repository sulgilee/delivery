package com.delivery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Store extends AbstractEntity {
    @Id private Long id;
    @Column(nullable=false, length=255, unique=true)
    private String address;
    @Column(nullable=false, length=255)
    private String name;
    @Column(nullable=false, length=255)
    private String store_name;
}
