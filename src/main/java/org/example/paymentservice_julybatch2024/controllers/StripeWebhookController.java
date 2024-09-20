package org.example.paymentservice_julybatch2024.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {


    @PostMapping
    public void respondToEvent(@RequestBody String event) {
        System.out.println("ANURAG KHANNA");
        System.out.println(event);
    }
}
