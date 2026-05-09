package com.sandev.studentrecordmanagement.service;

import com.sandev.studentrecordmanagement.entity.Student;
import com.sandev.studentrecordmanagement.exception.StudentNotFound;
import com.sandev.studentrecordmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String addStudent(List<Student> student) {

        studentRepository.saveAll(student);
        return "Student created successfully";
    }

    public List<Student> getStudents() {
        List<Student> students = studentRepository.findAll();
        if(students.isEmpty()) {
            throw new StudentNotFound("No students found");
        }
        return students;
    }

    public Student updateStudent(Integer id, Student updatedStudent) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new StudentNotFound("Student not found"));
        student.setFirstName(updatedStudent.getFirstName());
        student.setLastName(updatedStudent.getLastName());
        student.setEmail(updatedStudent.getEmail());
        student.setAge(updatedStudent.getAge());
        studentRepository.save(student);
        return student;
    }

    public Student getStudentId(Integer id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFound("Student not found with this id: "+id));
    }

    public void deleteById(Integer id) {
        Student student = getStudentId(id);
        studentRepository.delete(student);
    }
}
