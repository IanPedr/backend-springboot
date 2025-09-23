package com.ianznudemy.api.controller;


import com.ianznudemy.api.domain.coupon.Coupon;
import com.ianznudemy.api.domain.coupon.CouponRequestDTO;
import com.ianznudemy.api.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping
public class CouponController {

    @Autowired
    private CouponService couponService;


    @PostMapping("/event/{eventId}")
    public ResponseEntity<Coupon> addCoupon(@PathVariable UUID eventId, @RequestBody CouponRequestDTO data) {
        Coupon coupons = couponService.addCouponToEvent(eventId, data);
        return ResponseEntity.ok(coupons);
    }
}
