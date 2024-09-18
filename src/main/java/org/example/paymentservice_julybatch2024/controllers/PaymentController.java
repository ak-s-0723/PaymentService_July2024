package org.example.paymentservice_julybatch2024.controllers;

import org.example.paymentservice_julybatch2024.dtos.InitializePaymentDto;
import org.example.paymentservice_julybatch2024.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @PostMapping
    public String initializePayment(@RequestBody InitializePaymentDto initializePaymentDto) {
       return paymentService.getPaymentLink(initializePaymentDto.getName(),initializePaymentDto.getPhoneNumber(),initializePaymentDto.getEmail(),initializePaymentDto.getOrderId());
    }
}
