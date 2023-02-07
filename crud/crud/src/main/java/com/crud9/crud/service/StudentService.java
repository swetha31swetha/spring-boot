package com.crud9.crud.service;

import com.crud9.crud.entity.StudentEntity;
import com.crud9.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    public StudentRepository repository;
    public String save(StudentEntity student){
        repository.saveAndFlush(student);
        return "student";
    }
    public StudentEntity save(List<StudentEntity> obj1){
        List<StudentEntity>obj2=new ArrayList<>();
        StudentEntity obj3=null;
        for(StudentEntity obj4:obj1){
             obj3 = new StudentEntity();
            repository.saveAndFlush(obj4);
        }
        return obj3;
    }

    public List<StudentEntity> getAll() {
        return repository.findAll();
    }

    public Optional<StudentEntity> getById(int id) {
        return repository.findById(3);
    }

    public String update(StudentEntity student) {
        repository.saveAndFlush(student);
        return "update";

    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
