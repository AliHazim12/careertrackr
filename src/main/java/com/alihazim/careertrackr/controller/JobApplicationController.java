package com.alihazim.careertrackr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.alihazim.careertrackr.model.ApplicationStatus;
import com.alihazim.careertrackr.model.JobApplication;
import com.alihazim.careertrackr.service.JobApplicationService;

import jakarta.validation.Valid;

@Controller
public class JobApplicationController {

    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("applications", service.getAllApplications());
        return "index";
    }

    @GetMapping("/applications/new")
    public String showNewApplicationForm(Model model) {
        model.addAttribute("jobApplication", new JobApplication());
        model.addAttribute("statuses", ApplicationStatus.values());
        return "form";
    }

    @PostMapping("/applications/save")
    public String saveApplication(@Valid @ModelAttribute("jobApplication") JobApplication jobApplication,
            BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("statuses", ApplicationStatus.values());
            return "form";
        }

        service.saveApplication(jobApplication);
        return "redirect:/";
    }

    @GetMapping("/applications/edit/{id}")
    public String showEditApplicationForm(@PathVariable Long id, Model model) {
        model.addAttribute("jobApplication", service.getApplicationById(id));
        model.addAttribute("statuses", ApplicationStatus.values());
        return "form";
    }

    @GetMapping("/applications/delete/{id}")
    public String deleteApplication(@PathVariable Long id) {
        service.deleteApplication(id);
        return "redirect:/";
    }
}