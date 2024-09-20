package org.example.paymentservice_julybatch2024.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {

    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    public IPaymentGateway getBestPaymentGateway() {
       //return razorpayPaymentGateway;
        return stripePaymentGateway;
    }
}
