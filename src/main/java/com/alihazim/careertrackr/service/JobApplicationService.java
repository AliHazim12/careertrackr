package com.alihazim.careertrackr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alihazim.careertrackr.model.JobApplication;
import com.alihazim.careertrackr.repository.JobApplicationRepository;

@Service
public class JobApplicationService {

    private final JobApplicationRepository repository;

    public JobApplicationService(JobApplicationRepository repository) {
        this.repository = repository;
    }

    public List<JobApplication> getAllApplications() {
        return repository.findAll();
    }

    public void saveApplication(JobApplication application) {
        repository.save(application);
    }

    public void deleteApplication(Long id) {
        repository.deleteById(id);
    }

    public JobApplication getApplicationById(Long id) {
        return repository.findById(id).orElse(null);
    }
}