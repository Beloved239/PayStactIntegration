package com.tobi.paymentService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CreatePlanResponse {

    private Boolean status;
    private String message;
    private com.tobi.paymentService.dto.Data data;


}

