package com.tobi.paymentService.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePlanDto {


    @JsonProperty("name")
    private String name;


    @JsonProperty("interval")
    private String interval;


    @JsonProperty("amount")
    private Integer amount;
}

