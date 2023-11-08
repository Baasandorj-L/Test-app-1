package com.example.RepairType.model.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class RepairEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repair_type_id")
    private Long repairTypeId;

    @Column(name = "repair_name", nullable = false)
    private String repairName;
}
