package com.example.batuhanduvarci.demo.Controller;

import com.example.batuhanduvarci.demo.Dal.ApplicantRepository;
import com.example.batuhanduvarci.demo.Dal.JobRepository;
import com.example.batuhanduvarci.demo.Model.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicantController {

    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private ApplicantRepository applicantRepository;
    private Long jobId;

    @GetMapping("/appliance")
    public String populateList(Model model){
        model.addAttribute("jobs", jobRepository.findAll());
        return "appliance";
    }

    @PostMapping("/appliance")
    public String applianceList(@RequestParam("id") String id){
        this.jobId = Long.parseLong(id);
        System.out.println(jobId);
        return "apply";
    }

    @PostMapping("/apply")
    public String applyJob(@RequestParam("name") String name,
                           @RequestParam("eMail") String eMail,
                           @RequestParam("phone") String phone,
                           @RequestParam("address") String address,
                           @RequestParam("thoughts") String thoughts){
        applicantRepository.save(new Applicant(name, eMail, phone, address, thoughts, jobId));
        return "redirect:/appliance";
    }
}
