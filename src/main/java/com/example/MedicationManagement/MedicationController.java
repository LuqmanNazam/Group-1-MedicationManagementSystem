package com.example.MedicationManagement;

// REST controller to expose CRUD endpoints.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// this class will handle the HTTP requests for the Medication entity

@RestController
@RequestMapping ("/medications") // Base URL for all endpoints
public class MedicationController {

    @Autowired // Inject the MedicationService dependency
    private MedicationService medicationService;

    // Create a new medication
    @PostMapping
    public Medication createMedication(@RequestBody Medication medication){ // Request body is the medication object
        return medicationService.createMedication(medication);
    }

    // Get a medication by ID
    @GetMapping("/{id}")
    public Optional<Medication> getMedicationById(@PathVariable int id){
        return medicationService.getMedicationById(id);
    }

    // Get all medications
    @GetMapping
    public List<Medication> getAllMedication(){
        return medicationService.getAllMedication();
    }

    // Update a medication
    @PutMapping("/{id}")
    public Medication updateMedication(@PathVariable int id, @RequestBody Medication updatedMedication){
        return medicationService.updateMedication(id, updatedMedication);
    }

    // Delete a medication
    @DeleteMapping("/{id}")
    public void deleteMedication(@PathVariable int id){
        medicationService.deleteMedication(id);
    }
}
