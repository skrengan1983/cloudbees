package com.cloudbees.mgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudbees.mgmt.dto.TrainTicketBooking;
import com.cloudbees.mgmt.service.TrainTicketBookingService;

@RestController  
public class TrainTicketBookingController {
	@Autowired  
	TrainTicketBookingService trainTicketBookingService;
	@GetMapping("/train-ticket-booking")  
	public List<TrainTicketBooking> getAllTrainTicketBookingDetails(){
		return trainTicketBookingService.getAllTrainTicketBookingDetails();
	}
}
