package com.example.batuhanduvarci.demo.Controller;

import com.example.batuhanduvarci.demo.Dal.JobRepository;
import com.example.batuhanduvarci.demo.Model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class HrController {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping("/hr/jobs/list")
    public String populateList(Model model){
        model.addAttribute("jobs", jobRepository.findAll());
        return "list";
    }

//    @PostMapping("/hr/jobs/list")
//    public String show(@ModelAttribute Job job){
//        System.out.println(job);
//        return "detail";
//    }

//    @GetMapping("/hr/jobs/detail")
//    public String showJobDetails(@ModelAttribute Job job, @RequestParam("id") String jobId){
//        System.out.println(job.getId());
//        return "detail";
//    }

    @PostMapping("/hr/jobs/list")
    public String deleteJob(@RequestParam("id") String id){
        jobRepository.deleteById(Long.parseLong(id));
        return "redirect:/hr/jobs/list";
    }

    @GetMapping("/hr/jobs/add")
    public String getAddView(){
        return "add";
    }

    @PostMapping("/hr/jobs/add")
    public String addJob(@RequestParam("jobTitle") String jobTitle,
                         @RequestParam("jobDesc") String jobDesc,
                         @RequestParam("peopleAmount") String peopleAmount,
                         @RequestParam("lastDate") String lastDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        lastDate = format.format(new Date());
        Date date = format.parse(lastDate);

        jobRepository.save(new Job(jobTitle, jobDesc, Integer.parseInt(peopleAmount), date));

        return "redirect:/hr/jobs/list";
    }
}
