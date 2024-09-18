package org.example.paymentservice_julybatch2024.services;

import org.example.paymentservice_julybatch2024.paymentgateway.IPaymentGateway;
import org.example.paymentservice_julybatch2024.paymentgateway.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String getPaymentLink(String name,String phoneNumber,String email,String orderId) {
        IPaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();
        return paymentGateway.getPayLink(name,phoneNumber,email,orderId);
    }
}
