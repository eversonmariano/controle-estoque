package com.dev.everson.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class TransactionRequest {

    @Positive(message = "Product ID is required")
    private Long productId;
    @Positive(message = "Quantity is required")
    private Integer quantity;

    private Long suplierId;

    private Long description;

}
