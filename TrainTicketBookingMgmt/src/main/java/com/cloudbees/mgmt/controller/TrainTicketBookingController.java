package com.cloudbees.mgmt.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudbees.mgmt.dto.TrainTicketBooking;
import com.cloudbees.mgmt.service.TrainTicketBookingService;

@RestController
@RequestMapping("/train-ticket-booking")
public class TrainTicketBookingController {
	Logger logger = LoggerFactory.getLogger(TrainTicketBookingController.class); 
	@Autowired  
	TrainTicketBookingService trainTicketBookingService;
	@GetMapping("/get-all-details")  
	public List<TrainTicketBooking> getAllTrainTicketBookingDetails(){
		logger.info("Inside Controller Class");
		return trainTicketBookingService.getAllTrainTicketBookingDetails();
	}
}
