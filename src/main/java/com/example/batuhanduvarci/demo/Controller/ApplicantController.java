package com.example.batuhanduvarci.demo.Controller;

import com.example.batuhanduvarci.demo.Dal.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicantController {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping("/appliance")
    public String populateList(Model model){
        model.addAttribute("jobs", jobRepository.findAll());
        return "appliance";
    }
}
