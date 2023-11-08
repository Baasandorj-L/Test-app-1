package com.example.RepairType.controller;

import com.example.RepairType.model.entity.RepairEntity;
import com.example.RepairType.service.RepairService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("repairType")
public class RepairController {
    @Resource
    private RepairService repairService;

    @GetMapping(value = "/getAll")
    public List<RepairEntity> getAll() {
        return repairService.findAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> postRepair(@RequestParam("repairName") String repairName) {
        return repairService.add(repairName);

    }

    @DeleteMapping(value = "/deleteId/{repairId}")
    public ResponseEntity<?> deleteId(@PathVariable("repairId") Integer repairId) {
        return repairService.deleteId(repairId);
    }
}
