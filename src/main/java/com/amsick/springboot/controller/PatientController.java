package com.amsick.springboot.controller;

import com.amsick.springboot.model.Patient;
import com.amsick.springboot.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/getPatients")
    public List<Patient> data(){
        return patientService.getAllPatients(null);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<Patient> createPatient(@RequestBody Patient patient){

        return patientService.getAllPatients(patient);
    }
}
