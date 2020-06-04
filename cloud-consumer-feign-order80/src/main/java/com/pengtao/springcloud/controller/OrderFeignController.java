package com.pengtao.springcloud.controller;

import com.pengtao.springcloud.entities.CommonResult;
import com.pengtao.springcloud.entities.Payment;
import com.pengtao.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * pengtao.li
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        CommonResult<Payment> paymentById = paymentFeignService.getPaymentById(id);

        return paymentById;
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openfeign-ribbon,客户端一般默认等待1分钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
