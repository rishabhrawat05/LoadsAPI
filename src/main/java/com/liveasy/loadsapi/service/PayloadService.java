package com.liveasy.loadsapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.liveasy.loadsapi.dto.PayloadDto;
import com.liveasy.loadsapi.exceptions.PayloadNotFoundException;
import com.liveasy.loadsapi.models.Payload;
import com.liveasy.loadsapi.repositories.PayloadRepository;

@Service
public class PayloadService {

	private PayloadRepository payloadRepository;
	
	public PayloadService(PayloadRepository payloadRepository) {
		this.payloadRepository = payloadRepository;
	}
	
	public Payload createPayload(PayloadDto payloadDto) {
		Payload payload = new Payload();
		payload.setFacility(payloadDto.getFacility());
		payload.setProductType(payloadDto.getProductType());
		payload.setTruckType(payloadDto.getTruckType());
		payload.setNoOfTrucks(payloadDto.getNoOfTrucks());
		payload.setWeight(payloadDto.getWeight());
		payload.setComment(payloadDto.getComment());
		payload.setShipperId(payloadDto.getShipperId());
		payload.setDate(payloadDto.getDate());
		payloadRepository.save(payload);
		return payload;
		
	}
	
	public List<Payload> getPayload(String shipperId, String truckType, String productType, String loadingPoint, String unloadingPoint) {
		return payloadRepository.findAllByParam(shipperId, truckType, productType, loadingPoint, unloadingPoint);
	}
	
	public Payload getPayloadById(String loadId) {
		Optional<Payload> payloadOpt = payloadRepository.findById(loadId);
		if(payloadOpt.isEmpty()) {
			throw new PayloadNotFoundException("Payload Not Found with loadId:" + loadId);
		}
		Payload payload = payloadOpt.get();
		return payload;
		
	}
	
	public Payload updatePayload(String loadId, PayloadDto payloadDto) {
		Optional<Payload> payloadOpt = payloadRepository.findById(loadId);
		if(payloadOpt.isEmpty()) {
			throw new PayloadNotFoundException("Payload Not Found with loadId:" + loadId);
		}
		Payload payload = payloadOpt.get();
		
		if(payloadDto.getNoOfTrucks() != null) {
			payload.setNoOfTrucks(payloadDto.getNoOfTrucks());
		}
		if(payloadDto.getComment() != null) {
			payload.setComment(payloadDto.getComment());
		}
		if(payloadDto.getProductType() != null) {
			payload.setProductType(payloadDto.getProductType());
		}
		if(payloadDto.getShipperId() != null) {
			payload.setShipperId(payloadDto.getShipperId());
		}
		if(payloadDto.getFacility() != null) {
			payload.setFacility(payloadDto.getFacility());
		}
		if(payloadDto.getTruckType() != null) {
			payload.setTruckType(payloadDto.getTruckType());
		}
		if(payloadDto.getDate() != null) {
			payload.setDate(payloadDto.getDate());
		}
		if(payloadDto.getWeight() != null) {
			payload.setWeight(payload.getWeight());
		}
		payloadRepository.save(payload);
		return payload;
	}
	
	public String deletePayloadById(String loadId) {
		Optional<Payload> payloadOpt = payloadRepository.findById(loadId);
		if(payloadOpt.isEmpty()) {
			throw new PayloadNotFoundException("Payload Not Found with loadId:" + loadId);
		}
		Payload payload = payloadOpt.get();
		payloadRepository.delete(payload);
		return new String("Payload has been deleted with loadId:" + loadId);
	}
}
