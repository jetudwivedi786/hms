package com.springboot.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {
	
	@Id
    private int orderId;
	private int amount;
    private String paymentStatus;
    private String txId;
    

}



