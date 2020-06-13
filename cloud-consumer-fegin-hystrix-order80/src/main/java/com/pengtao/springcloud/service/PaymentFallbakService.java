package com.pengtao.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author pengtao.li
 * @Description: mySpringCloud
 * @Email lpt18731306448@gmail.com
 * @Date 2020/6/6 11:24
 */
@Component
public class PaymentFallbakService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }

    @Override
    public String paymentCircuitBreaker(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
