package com.example.batuhanduvarci.demo.Dal;

import com.example.batuhanduvarci.demo.Model.HrManager;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HrRepository extends CrudRepository<HrManager, Long> {
    List<HrManager> findByUsername(String username);
}
