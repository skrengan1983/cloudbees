package com.cloudbees.mgmt.repo;

import org.springframework.data.repository.CrudRepository;

import com.cloudbees.mgmt.dto.TrainTicketBooking;

public interface TrainTicketBookingRepo extends CrudRepository<TrainTicketBooking, Integer> {

}
