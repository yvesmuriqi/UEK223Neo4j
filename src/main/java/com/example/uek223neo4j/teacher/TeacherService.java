package com.example.uek223neo4j.teacher;

import java.util.List;

// This is an example service with method signatures for CRUD logic
public interface TeacherService {

    Teacher create(Teacher teacher);

    List<Teacher> findAll();

    Teacher findById(int id);

    Teacher updateById(int id, Teacher teacher);

    void deleteById(int id);

}
