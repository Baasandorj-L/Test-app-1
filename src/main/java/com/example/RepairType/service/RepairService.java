package com.example.RepairType.service;

import com.example.RepairType.model.entity.RepairEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RepairService {
    List<RepairEntity> findAll();

    ResponseEntity<?> add(String repairName);

    ResponseEntity<?> deleteId(Integer repairId);
}
