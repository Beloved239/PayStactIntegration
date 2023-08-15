package com.tobi.paymentService.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InitializePaymentResponse {

    private Boolean status;
    private String message;
    private Data data;





}

