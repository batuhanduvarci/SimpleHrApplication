package com.example.batuhanduvarci.demo.Dao;

import com.example.batuhanduvarci.demo.Model.Job;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobRepository extends CrudRepository<Job, Long> {
    List<Job> findByJobTitle(String jobTitle);
}
