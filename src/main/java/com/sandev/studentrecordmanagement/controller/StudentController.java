package com.sandev.studentrecordmanagement.controller;

import com.sandev.studentrecordmanagement.entity.Student;
import com.sandev.studentrecordmanagement.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Student>>  getAllStudents() {
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> createStudent(@RequestBody List<Student> student) {
        String stu = studentService.addStudent(student);
        return  new ResponseEntity<>(stu, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Integer id,
            @RequestBody Student updatedStudent
    ) {
        Student student = studentService.updateStudent(id, updatedStudent);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {
        Student student = studentService.getStudentId(id);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Integer id) {
        studentService.deleteById(id);
        return ResponseEntity.ok("Deleted student with id: " + id);
    }
}
