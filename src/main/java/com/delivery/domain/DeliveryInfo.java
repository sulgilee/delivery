package com.delivery.domain;

import javax.persistence.Entity;

import com.delivery.dto.DeliveryInfoDetailDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class DeliveryInfo extends DeliveryInfoDetailDto {
}
