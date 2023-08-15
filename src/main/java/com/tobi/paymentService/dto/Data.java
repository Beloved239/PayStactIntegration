package com.tobi.paymentService.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private String authorization_url;
    private String access_code;
    private String reference;

}
