package com.fundtransfer.grainite.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundtransfer.grainite.model.FundTransferRequest;
import com.fundtransfer.grainite.service.TransactionService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/transaction")
public class FundTransferController {

//    private final FundTransferService fundTransferService;
	
	private final TransactionService txnService;

	@PostMapping("/fund-transfer")
    public ResponseEntity fundTransfer(@RequestBody FundTransferRequest fundTransferRequest) {
		System.out.println("From "+fundTransferRequest.getFromAccount() +" TO "
    +fundTransferRequest.getToAccount()+" Amount "+fundTransferRequest.getAmount());
        return ResponseEntity.ok(txnService.fundTransfer(fundTransferRequest));
    }

}
