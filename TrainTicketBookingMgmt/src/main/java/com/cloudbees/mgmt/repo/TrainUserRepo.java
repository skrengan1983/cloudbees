package com.cloudbees.mgmt.repo;

import org.springframework.data.repository.CrudRepository;

import com.cloudbees.mgmt.dto.TrainUser;

public interface TrainUserRepo extends CrudRepository<TrainUser, Integer> {

}
