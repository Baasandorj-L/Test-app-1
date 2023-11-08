package com.example.RepairType.service;

import com.example.RepairType.model.entity.RepairEntity;
import com.example.RepairType.repository.RepairRepository;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairServiceImpl implements RepairService {

    @Resource
    private RepairRepository repairRepository;

    @Override
    public List<RepairEntity> findAll() {
        return repairRepository.findAll();
    }

    @Override
    public ResponseEntity<?> add(String repairName) {

        if (repairRepository.findByRepairName(repairName).isPresent()) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Repair type already registered.");

        } else {
            RepairEntity repairEntity = new RepairEntity();
            repairEntity.setRepairName(repairName);
            repairRepository.save(repairEntity);
            return ResponseEntity.ok("Амжилттай үүслээ.");
        }
    }

    @Override
    public ResponseEntity<?> deleteId(Integer repairId) {
        if (repairRepository.findById(repairId).isPresent()) {
            repairRepository.deleteById(repairId);
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
