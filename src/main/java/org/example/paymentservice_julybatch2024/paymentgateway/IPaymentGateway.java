package org.example.paymentservice_julybatch2024.paymentgateway;

public interface IPaymentGateway {

    String getPayLink(String name,String phoneNumber,String email,String orderId);
}
