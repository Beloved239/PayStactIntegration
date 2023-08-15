package com.tobi.paymentService.dto;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InitializePaymentDto {

    private BigDecimal amount;
    private String email;

}

