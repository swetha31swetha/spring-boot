package com.socialmedia.app.service;

import com.socialmedia.app.dto.StudentDTO;
import com.socialmedia.app.entity.Student;
import com.socialmedia.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    public String save(List<StudentDTO> studentDTOList){
    Student obj;

        for (StudentDTO listObj: studentDTOList) {

            obj = new Student();

            obj.setName(listObj.getName());
            obj.setDob(listObj.getDob());
            obj.setAge(listObj.getAge());
            obj.setAddress(listObj.getAddress());
            obj.setContactNo(listObj.getContactNo());

        studentRepository.saveAndFlush(obj);
        }
        return "saved";
    }
    public String update(List<StudentDTO> studentDTOList){
        Student obj = new Student();

        for (StudentDTO listObj: studentDTOList) {

            obj.setId(listObj.getId());
            obj.setName(listObj.getName());
            obj.setDob(listObj.getDob());
            obj.setAge(listObj.getAge());
            obj.setAddress(listObj.getAddress());
            obj.setContactNo(listObj.getContactNo());
            studentRepository.saveAndFlush(obj);
        }
        return "updated successfully";

    }

    public Optional<Student> findByName(String name){
        return studentRepository.   findByName(name);
    }
    public List<Student> findByCity(String address){
        return studentRepository.findByCity(address);
    }

//    public ArrayList<StudentDTO> getAllStudent() {
//    }
//
//    public StudentDTO getUserByID(Integer id) {
//    }

}
