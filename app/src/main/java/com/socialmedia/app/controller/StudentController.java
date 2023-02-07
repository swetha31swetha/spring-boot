package com.socialmedia.app.controller;

import com.socialmedia.app.dto.StudentDTO;
import com.socialmedia.app.dto.UserDTO;
import com.socialmedia.app.entity.Student;
import com.socialmedia.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/postStudent")
    private void createStudent(@RequestBody List<StudentDTO> studentDTOList){
        studentService.save(studentDTOList);
    }

//    @PutMapping("/putStudent/{id}")
//    private String update(@RequestBody List<StudentDTO> studentDTOList, @PathVariable("id") Integer id){
//        studentService.update(studentDTOList);
//        return "updated successfully";
//    }
//
//    @GetMapping("/getStudent/{name}")
//    private Optional<Student> findByName(@PathVariable("name") String name){
//       return studentService.findByName(name);
//    }
//
//    @GetMapping("/getStudentAddress/{address}")
//    private List<Student> findByAdd(@PathVariable("address") String address){
//        return studentService.findByCity(address);
//    }
//
}


