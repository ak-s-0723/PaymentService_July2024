package org.example.paymentservice_julybatch2024.services;

public interface IPaymentService {

    String getPaymentLink(String name,String phoneNumber,String email,String orderId);
}
