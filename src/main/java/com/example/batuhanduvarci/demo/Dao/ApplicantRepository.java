package com.example.batuhanduvarci.demo.Dao;

import com.example.batuhanduvarci.demo.Model.Applicant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicantRepository extends CrudRepository<Applicant, Long> {
    List<Applicant> findByFirstName(String firstName);
}
