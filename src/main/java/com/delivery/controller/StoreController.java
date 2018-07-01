package com.delivery.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.dto.StoreDetailDto;

@RestController
public class StoreController {
    @RequestMapping("")
    public StoreDetailDto createStore(@RequestBody StoreDetailDto store) {
        return null;
    }
}
