package com.cloudbees.mgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudbees.mgmt.dto.TrainTicketBooking;
import com.cloudbees.mgmt.repo.TrainTicketBookingRepo;

@Service
public class TrainTicketBookingService {
	Logger logger = LoggerFactory.getLogger(TrainTicketBookingService.class); 

	@Autowired
	TrainTicketBookingRepo trainTicketBookingRepo;

	public List<TrainTicketBooking> getAllTrainTicketBookingDetails() {
		logger.info("Inside Service Class");
		List<TrainTicketBooking> trainTicketBookingList = new ArrayList<>();
		trainTicketBookingRepo.findAll().forEach(t -> {
			trainTicketBookingList.add(t);
		});
		return trainTicketBookingList;
	}

}
