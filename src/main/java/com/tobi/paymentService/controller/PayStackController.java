package com.tobi.paymentService.controller;

import com.tobi.paymentService.dto.*;
import com.tobi.paymentService.service.PayStackService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/payment")
@RequiredArgsConstructor
public class PayStackController {

    private final PayStackService paystackService;


    @PostMapping("/createPlan")
    @ResponseStatus(HttpStatus.OK)
    public CreatePlanResponse createPlan(@Validated @RequestBody CreatePlanDto createPlanDto) throws Exception {
        return paystackService.createPlan(createPlanDto);
    }

    @PostMapping("/initializePayment")
    @ResponseStatus(HttpStatus.OK)
    public InitializePaymentResponse initializePayment(@Validated @RequestBody InitializePaymentDto initializePaymentDto) throws Throwable {
        return paystackService.initializePayment(initializePaymentDto);
    }

    @GetMapping("/verifyPayment/{reference}")
    public PaymentVerificationResponse paymentVerification(@PathVariable(value = "reference") String reference) throws Exception {
        return paystackService.paymentVerification(reference);
    }
}

