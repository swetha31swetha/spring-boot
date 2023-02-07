package com.crud9.crud.controller;

import com.crud9.crud.entity.StudentEntity;
import com.crud9.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    public StudentService service;
    @PostMapping("/post")
    private String save(@RequestBody StudentEntity student){
        service.save(student);
        return "student";
    }
    @PostMapping("/listall")
    private String ListAll(@RequestBody List<StudentEntity> obj1){
        StudentEntity obj2=service.save(obj1);
        return "ListAll";

    }
    @GetMapping("/get")
    private List<StudentEntity>getAll(){
        return service.getAll();
    }
    @GetMapping("/get/{id}")
    private Optional<StudentEntity>getId(@PathVariable("id")int id){
        return service.getById(id);
    }
    @PutMapping("/update")
    private String update(@RequestBody StudentEntity student){
        service.update(student);
        return "update";
    }
    @DeleteMapping("delete/{id}")
    private void deleteId(@PathVariable("id")int id){
        service.delete(id);
    }

}
