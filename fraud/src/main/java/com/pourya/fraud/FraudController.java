package com.pourya.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudController {
    private final FraudCheckService service;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable Integer customerId
    ) {
        log.info("fraud check request for customer {}", customerId);
        return new FraudCheckResponse(service.isFraudulentCustomer(customerId));
    }
}
