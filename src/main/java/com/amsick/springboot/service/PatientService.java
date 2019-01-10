package com.amsick.springboot.service;

import com.amsick.springboot.model.Patient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PatientService {

   // public static List<Patient> patients = new ArrayList<>();

    public List<Patient> getAllPatients(Patient patient){

        Patient patient1 = new Patient("1", "Aneesh","Male");
        Patient patient2 = new Patient("2", "Edwin","Male");
        Patient patient3 = new Patient("3", "Becky","Female");
        Patient patient4 = new Patient("4", "Matt","Male");
        Patient patient5 = new Patient("5", "Fabio","Female");
        Patient patient6 = new Patient("6", "Ramneek","Female");
        List<Patient> patientsList = new ArrayList<>(Arrays.asList(patient1, patient2, patient3, patient4, patient5));
        if(patient != null){
            patientsList.add(patient);
        }
        return patientsList;
    }
}
