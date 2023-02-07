package com.example.teacher.controller;

import com.example.teacher.entity.Teacher;
import com.example.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping("/post")
    private String save(@RequestBody Teacher teacher){
        teacherService.save(teacher);
        return "ok";
    }
    @PostMapping("/ListAll")
    private String ListAll(@RequestBody List<Teacher> obj1) {
       Teacher obj2 = teacherService.save(obj1);
        return "listAll";
    }

    @GetMapping("/get")
    private List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<Teacher> getId(@PathVariable("id") int id) {
        return teacherService.getById(id);

    }

    @PutMapping("/update")
    private String update(@RequestBody Teacher teacher) {
        teacherService.update(teacher);
        return "update";
    }

    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
        teacherService.delete(id);
    }

}


