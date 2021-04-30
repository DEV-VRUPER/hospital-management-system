package com.vrutech.controller.doctor;

import com.vrutech.model.doctor.Doctor;
import com.vrutech.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/getdoctors")
    public List<Doctor> getDoctors(){
        return doctorService.getDoctor();
    }
}
