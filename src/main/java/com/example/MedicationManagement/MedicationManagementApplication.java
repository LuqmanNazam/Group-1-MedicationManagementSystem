package com.example.medicationmanagementapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MedicationTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicationTrackerApplication.class, args);
    }
}

@RestController
@RequestMapping("/api/medications")
class MedicationController {
    public final List<Medication> medications = new ArrayList<>();

    @GetMapping
    public List<Medication> getAllMedications() {
        return medications;
    }

    @PostMapping
    public String addMedication(@RequestBody Medication medication) {
        if (medications.size() < 10) {
            medications.add(medication);
            return "Medication added successfully!";
        } else {
            return "Cannot store more than 10 medications.";
        }
    }
}

class Medication {
    public String name;
    public String type;
    public String dosage;
    public String mealTime;
    public String schedule;
    public String startDate;

    // Constructors
    public Medication() {}

    public Medication(String name, String type, String dosage, String mealTime, String schedule, String startDate) {
        this.name = name;
        this.type = type;
        this.dosage = dosage;
        this.mealTime = mealTime;
        this.schedule = schedule;
        this.startDate = startDate;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDosage() { return dosage; }
    public void setDosage(String dosage) { this.dosage = dosage; }

    public String getMealTime() { return mealTime; }
    public void setMealTime(String mealTime) { this.mealTime = mealTime; }

    public String getSchedule() { return schedule; }
    public void setSchedule(String schedule) { this.schedule = schedule; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }
}
