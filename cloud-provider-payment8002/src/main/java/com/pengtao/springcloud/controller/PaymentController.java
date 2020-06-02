package com.pengtao.springcloud.controller;

import com.pengtao.springcloud.entities.CommonResult;
import com.pengtao.springcloud.entities.Payment;
import com.pengtao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * pengtao
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        log.info(payment.getSerial());
        int result = paymentService.create(payment);

        log.info("插入结果：" + result);
        if(result > 0){
            return new CommonResult(200,"成功" + serverPort,result);
        }else {
            return new CommonResult(400,"失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);

        log.info("插入结果 " + payment.toString() );
        if(payment != null){
            return new CommonResult(200,"成功" + serverPort,payment);
        }else {
            return new CommonResult(400,"失败");
        }
    }
}
