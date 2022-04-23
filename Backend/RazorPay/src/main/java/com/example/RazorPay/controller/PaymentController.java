package com.example.RazorPay.controller;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/payment")
public class PaymentController {

	@PostMapping("/create_order")
	public String createOrder(@RequestBody Map<String, Object> data) throws RazorpayException {
		System.out.println("INSIDE PAYMENT ORDER");
		Double amt = Double.parseDouble(data.get("amount").toString());

		var client = new RazorpayClient("rzp_test_qbRIP8bhRC3wZa", "oDfJYgATzY9OMzyqQTw6YrZm");

		JSONObject orderRequest = new JSONObject();

		orderRequest.put("amount", amt*100); // amount in the smallest currency unit

		orderRequest.put("currency", "INR");

		orderRequest.put("receipt", "HMS_76576");

		Order order = client.Orders.create(orderRequest);

		System.out.println(order);

		return order.toString();

	}

}
