package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);

    }

    public List<Student> saveAllService(List<Student> student) {
        System.out.println("saveAllService method is working");
        return studentRepository.saveAll(student);
    }


    public String deleteByIdService(int id) {
        System.out.println("deleteByIdService method is working");
        studentRepository.deleteById(id);
        return "Record deleted successfully";
    }

    public String deleteAllRecordsService() {
        System.out.println("deleteAllByService method is working");
        studentRepository.deleteAll();
        return "All records deleted successfully";
    }

    public List<Student> getAllRecordsService() {
        System.out.println("getAllRecordsService method is working");
        return studentRepository.findAll();
    }

    public String updateRecordsService(Student student) {
        studentRepository.save(student);
        return "Records are updated";
    }
}
