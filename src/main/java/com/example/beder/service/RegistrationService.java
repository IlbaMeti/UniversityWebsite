package com.example.beder.service;

import com.example.beder.model.Bachelor;
import com.example.beder.model.Master;
import com.example.beder.model.Student;
import com.example.beder.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    StudentRepository studentRepository;

    public void registerStudent(Student newStudent) {
        var student = new Student();
        student.setFirstName(newStudent.getFirstName());
        student.setLastName(newStudent.getLastName());
        student.setBirthdate(newStudent.getBirthdate());
        student.setCity(newStudent.getCity());
        student.setSchool(newStudent.getSchool());
        student.setAverage(newStudent.getAverage());
        student.setPhone(newStudent.getPhone());
        student.setEmail(newStudent.getEmail());
        student.setProgramType(newStudent.getProgramType());

        if(newStudent.getProgramType().equalsIgnoreCase("master"))
            student.setProgramsMaster(setMaster(newStudent.getProgramsMaster()));
        else
            student.setProgramsBachelor(setBachelor(newStudent.getProgramsBachelor()));

        studentRepository.save(student);
    }

    private Bachelor setBachelor(Bachelor programsBachelor) {
        var bachelor = new Bachelor();
        bachelor.setCommMultimedia(programsBachelor.isCommMultimedia());
        bachelor.setLaw(programsBachelor.isLaw());
        bachelor.setTIK(programsBachelor.isTIK());
        bachelor.setComputerScience(programsBachelor.isComputerScience());
        bachelor.setIslamicScience(programsBachelor.isIslamicScience());
        return bachelor;
    }

    private Master setMaster(Master programsMaster) {
        var master = new Master();
        master.setIslamicScience(programsMaster.isIslamicScience());
        master.setComputerScience(programsMaster.isComputerScience());
        master.setCommunicationScience(programsMaster.isCommunicationScience());
        master.setReligiousScience(programsMaster.isReligiousScience());
        return master;
    }

    public List<Student> getListAppliedStudents() {
        return studentRepository.findAll();
    }
}
