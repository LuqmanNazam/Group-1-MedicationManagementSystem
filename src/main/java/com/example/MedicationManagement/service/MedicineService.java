package com.example.MedicationManagement.service;

import com.example.MedicationManagement.model.Medicine;
import com.example.MedicationManagement.repository.MedicineRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepository medicineRepository;

    // Delete
    public void deleteMedicine(Integer id) {
        medicineRepository.deleteById(id);
    }



}
