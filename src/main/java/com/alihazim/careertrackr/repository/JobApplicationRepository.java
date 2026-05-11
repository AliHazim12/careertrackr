package com.alihazim.careertrackr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alihazim.careertrackr.model.JobApplication;

public interface JobApplicationRepository 
        extends JpaRepository<JobApplication, Long> {

}