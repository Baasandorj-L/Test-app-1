package com.example.RepairType.repository;

import com.example.RepairType.model.entity.RepairEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepairRepository extends JpaRepository<RepairEntity, Integer> {
    Optional<RepairEntity> findByRepairName(String repairName);

}
