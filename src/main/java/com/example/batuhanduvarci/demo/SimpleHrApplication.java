package com.example.batuhanduvarci.demo;

import com.example.batuhanduvarci.demo.Dal.ApplicantRepository;
import com.example.batuhanduvarci.demo.Dal.JobRepository;
import com.example.batuhanduvarci.demo.Dal.HrRepository;
import com.example.batuhanduvarci.demo.Model.HrManager;
import com.example.batuhanduvarci.demo.Model.Job;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SimpleHrApplication {


	public static void main(String[] args) throws Throwable {
		SpringApplication.run(SimpleHrApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(HrRepository hrRepository, ApplicantRepository applicantRepository, JobRepository jobRepo){
		Date currentDate = new Date();

		return (args) -> {
			//save
			hrRepository.save(new HrManager("John", "Doe", "john.doe@example.com"));

			jobRepo.save(new Job("Google", "Hiring software developers", 10, currentDate));
			jobRepo.save(new Job("Airbnb", "Hiring front-end developers", 5, currentDate));
			jobRepo.save(new Job("Uber", "Hiring back-end developers", 12, currentDate));

			//fetch all
			for(HrManager manager : hrRepository.findAll()){
				System.out.println(manager.toString());
			}
			System.out.println("\n");

			for (Job job : jobRepo.findAll()){
				System.out.println(job.toString());
			}
		};
	}

}
