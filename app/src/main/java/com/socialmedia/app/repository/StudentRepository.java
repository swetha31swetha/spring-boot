package com.socialmedia.app.repository;

import com.socialmedia.app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
        @Query(value = "select * from student_details where name =:name", nativeQuery = true)
        Optional<Student> findByName(String name);
@Query(value = "select * from student_details where address like 't%'", nativeQuery = true)
        List<Student> findByCity(String address);
}
        