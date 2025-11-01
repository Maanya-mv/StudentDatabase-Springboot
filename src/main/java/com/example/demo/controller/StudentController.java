package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Single record at once
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        System.out.println("Controller is working good");
        return studentService.createStudent(student);
    }


    //Multiple record at once
    @PostMapping("/saveAll")
    public List<Student> multiCreateStudent(@RequestBody List<Student> student) {
        System.out.println("multiCreateStudent");
        return studentService.saveAllService(student);
    }

    //Delete records by ID
    @DeleteMapping("/delete/{id}")
    public String deleteByIdController(@PathVariable int id) {
        System.out.println("deleteByIdController is working");
        return studentService.deleteByIdService(id);
    }

    //Delete all records
    @DeleteMapping("/deleteAll")
    public String deleteAllRecords() {
        System.out.println("deleteAllRecords controller is working");
        return studentService.deleteAllRecordsService();

    }

    //Get all records(Reading all data stored in table)
    @GetMapping("/getAll")
    public List<Student> getAllRecords() {
        System.out.println("getAllRecords is working");
        return studentService.getAllRecordsService();
    }

    //Update the records
    @PutMapping("/update")
    public String updateRecords(@RequestBody Student student) {
        System.out.println("records are getting updated");
        return studentService.updateRecordsService(student);
    }

}
