package com.payment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="Payments")
public class PaymentDetails {
	
	@Id
    private int orderId;
	private int amount;
    private String paymentStatus;
    private String txId;
    

}



