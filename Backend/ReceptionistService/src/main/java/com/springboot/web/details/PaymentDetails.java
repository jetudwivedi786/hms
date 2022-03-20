package com.springboot.web.details;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {
	
	@Id
    private int orderId;
	private int ammount;
    private String paymentStatus;
    private String txId;
    

}



