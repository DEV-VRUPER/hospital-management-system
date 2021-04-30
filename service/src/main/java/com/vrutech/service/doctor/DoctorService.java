package com.vrutech.service.doctor;

import com.vrutech.dao.doctor.DoctorRepository;
import com.vrutech.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.print.Doc;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostConstruct
    private void initDoctor() {
        doctorRepository.saveAll(Stream.of(new Doctor(1, "john", "Cardiac"),
                new Doctor(2, "john", "Cardiac"))
                .collect(Collectors.toList()));

    }

    public List<Doctor> getDoctor() {
        return doctorRepository.findAll();
    }

}
;