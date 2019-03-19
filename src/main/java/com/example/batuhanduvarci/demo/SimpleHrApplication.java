package com.example.batuhanduvarci.demo;

import com.example.batuhanduvarci.demo.Model.Applicant;
import com.example.batuhanduvarci.demo.Model.HrManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleHrApplication {
	public static HrManager test = new HrManager("Batuhan", "Duvarci","batuhanduvarci@gmail.com");
	public static Applicant test2 = new Applicant("Batuhan", "Duvarci","batuhanduvarci@gmail.com");

	public static void main(String[] args) {
		SpringApplication.run(SimpleHrApplication.class, args);
		System.out.println(test.toString() +"\n" + test2.toString());
	}

}
