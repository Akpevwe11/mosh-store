package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private int  timeout;

    @Value("${stripe.supported-currencies:USD,EUR,GBP}")
    private List<String> supportedCurrencies = List.of("USD", "EUR", "GBP");


    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("API URL: " + apiUrl);
        System.out.println("ENABLED: " + enabled);
        System.out.println("TIMEOUT" + timeout);
        System.out.println("Amount: " + amount);
        System.out.println("Supported Currencies: " + String.join(", ", supportedCurrencies));
    }
}

