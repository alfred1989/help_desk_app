package com.example.help_desk_app.controller;

import com.example.help_desk_app.model.Applications;
import com.example.help_desk_app.repository.ApplicationsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
private ApplicationsRepository applicationsRepository;

    public HomeController(ApplicationsRepository applicationsRepository) {
        this.applicationsRepository = applicationsRepository;
    }

    @GetMapping("/add")
    public String addForm(Model model){
        model.addAttribute("application", new Applications());
        return "addForms";
    }

    @PostMapping("/save")
    public String addAplications(Applications applications){
applicationsRepository.save(applications);
        return "succes";
    }
}
