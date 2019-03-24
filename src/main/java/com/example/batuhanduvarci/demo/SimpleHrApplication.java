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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SimpleHrApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(SimpleHrApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(HrRepository hrRepository, ApplicantRepository applicantRepository, JobRepository jobRepo) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		String date = format.format(new Date());
		Date currentDate = format.parse(date);

		return (args) -> {
			//save
			jobRepo.save(new Job("Google", "Hiring software developers", 10, currentDate));
			jobRepo.save(new Job("Airbnb", "Hiring front-end developers", 5, currentDate));
			jobRepo.save(new Job("Uber", "Hiring developers", 12, currentDate));
			jobRepo.save(new Job("Sahibinden", "Hiring software developers", 20, currentDate));
			jobRepo.save(new Job("Sony", "Hiring java developers", 3, currentDate));
			jobRepo.save(new Job("Apple", "Hiring dev-ops engineers", 7, currentDate));

			for (Job job : jobRepo.findAll()){
				System.out.println(job);
			}
		};
	}
}
