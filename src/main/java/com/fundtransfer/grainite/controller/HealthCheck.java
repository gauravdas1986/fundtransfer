package com.fundtransfer.grainite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundtransfer.grainite.model.FundTransferRequest;
import com.grainite.api.Event;
import com.grainite.api.Grainite;
import com.grainite.api.GrainiteClient;
import com.grainite.api.GrainiteException;
import com.grainite.api.Topic;
import com.grainite.api.Value;

@RestController
@RequestMapping("/v1/transaction")
public class HealthCheck {
	
	@GetMapping("/health")
	public String getHealth() {
		System.out.println("Working");
		return "Working";
	}
	
	@PostMapping("/append_test")
	public void appendEventTest(@RequestBody FundTransferRequest fundTransferRequest) throws GrainiteException {
		System.out.println("From "+fundTransferRequest.getFromAccount() +" TO "
			    +fundTransferRequest.getToAccount()+" Amount "+fundTransferRequest.getAmount());
		Grainite grainite = GrainiteClient.getClient("localhost", 5056);
		Topic topic = grainite.getTopic("food_app", "transfer_topic");
		topic.append(new Event(Value.of("123"), Value.of(fundTransferRequest.toString())));
	}

}
