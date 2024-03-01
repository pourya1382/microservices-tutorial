package com.pourya.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
){}
