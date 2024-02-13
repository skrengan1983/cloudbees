package com.cloudbees.mgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudbees.mgmt.dto.TrainTicketBooking;
import com.cloudbees.mgmt.service.TrainTicketBookingService;

@RestController
@RequestMapping("/train-ticket-booking")
public class TrainTicketBookingController {
	@Autowired  
	TrainTicketBookingService trainTicketBookingService;
	@GetMapping("/get-all-details")  
	public List<TrainTicketBooking> getAllTrainTicketBookingDetails(){
		return trainTicketBookingService.getAllTrainTicketBookingDetails();
	}
}