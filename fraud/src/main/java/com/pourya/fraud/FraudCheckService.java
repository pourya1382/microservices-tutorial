package com.pourya.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository repository;
    public boolean isFraudulentCustomer(Integer customerId){
        repository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .build()
        );
        return false;
    }


}
