package com.liveasy.loadsapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.liveasy.loadsapi.dto.PayloadDto;
import com.liveasy.loadsapi.service.PayloadService;

@RestController
@RequestMapping("/payload")
public class PayloadController {

	private PayloadService payloadService;
	
	public PayloadController(PayloadService payloadService) {
		this.payloadService = payloadService;
	}
	
	@PostMapping("/load")
	public ResponseEntity<?> createPayload(@RequestBody PayloadDto payloadDto) {
		return ResponseEntity.status(201).body(payloadService.createPayload(payloadDto));
	}

	@GetMapping("/load")
	public ResponseEntity<?> getPayload(@RequestParam(required = false) String shipperId, @RequestParam(required = false) String truckType,
			@RequestParam(required = false) String productType, @RequestParam(required = false) String loadingPoint, @RequestParam(required = false) String unloadingPoint) {
		return ResponseEntity.ok(payloadService.getPayload(shipperId, truckType, productType, loadingPoint, unloadingPoint));
	}

	@GetMapping("/load/{loadId}")
	public ResponseEntity<?> getPayloadById(@PathVariable String loadId) {
		return ResponseEntity.ok(payloadService.getPayloadById(loadId));
	}

	@PutMapping("/load/{loadId}")
	public ResponseEntity<?> updatePayload(@PathVariable String loadId, @RequestBody PayloadDto payloadDto) {
		return ResponseEntity.ok(payloadService.updatePayload(loadId, payloadDto));
	}

	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<?> deletePayloadById(@PathVariable String loadId) {
		return ResponseEntity.ok(payloadService.deletePayloadById(loadId));
	}
}
