package com.example.teacher.service;

import com.example.teacher.entity.Teacher;
import com.example.teacher.repository.DepartmentRepository;
import com.example.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    public String save(Teacher teacher){
        teacherRepository.saveAndFlush(teacher);
        return "teacher";
    }
    public Teacher save(List<Teacher> obj1) {
        List<Teacher> obj2 = new ArrayList<>();
        Teacher obj3 = null;
        for (Teacher obj4 : obj1) {
            obj3 = new Teacher();
            teacherRepository.saveAndFlush(obj4);
        }
        return obj3;


    }

    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getById(int id) {
        return teacherRepository.findById(id);

    }

    public String update(Teacher teacher) {
      teacherRepository.saveAndFlush(teacher);
        return "update";
    }

    public void delete(int id) {
        teacherRepository.deleteById(id);

    }
}
