package com.example.batuhanduvarci.demo.Dao;

import com.example.batuhanduvarci.demo.Model.HrManager;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HrRepository extends CrudRepository<HrManager, Long> {
    List<HrManager> findByFirstName(String firstName);
}
