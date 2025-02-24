package com.example.MedicationManagement.repository;

import com.example.MedicationManagement.model.Medicine;
import org.springframework.data.repository.CrudRepository;

public interface MedicineRepository extends CrudRepository<Medicine, Integer> {
}
