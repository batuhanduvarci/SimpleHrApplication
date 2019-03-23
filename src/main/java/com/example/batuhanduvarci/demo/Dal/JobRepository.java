package com.example.batuhanduvarci.demo.Dal;

import com.example.batuhanduvarci.demo.Model.Job;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobRepository extends CrudRepository<Job, Long> {
    List<Job> findByJobTitle(String jobTitle);
}
