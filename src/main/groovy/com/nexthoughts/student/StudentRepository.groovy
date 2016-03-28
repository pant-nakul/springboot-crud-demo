package com.nexthoughts.student

import org.springframework.data.jpa.repository.JpaRepository


interface StudentRepository extends JpaRepository<Student,Long> {
    void delete(Student deleted);

    List<Student> findAll();

    Student findOne(Long id);

    Student save(Student persisted);
    Student saveAndFlush(Student persisted);


}