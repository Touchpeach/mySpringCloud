package com.pengtao.springcloud.service;

import com.pengtao.springcloud.entities.CommonResult;
import com.pengtao.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * pengtao
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id")Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
