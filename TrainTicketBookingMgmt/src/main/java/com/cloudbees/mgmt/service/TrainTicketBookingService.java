package com.cloudbees.mgmt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudbees.mgmt.dto.TrainTicketBooking;
import com.cloudbees.mgmt.repo.TrainTicketBookingRepo;

@Service
public class TrainTicketBookingService {
	@Autowired
	TrainTicketBookingRepo trainTicketBookingRepo;

	public List<TrainTicketBooking> getAllTrainTicketBookingDetails() {
		List<TrainTicketBooking> trainTicketBookingList = new ArrayList<>();
		trainTicketBookingRepo.findAll().forEach(t -> {
			trainTicketBookingList.add(t);
		});
		return trainTicketBookingList;
	}

}
