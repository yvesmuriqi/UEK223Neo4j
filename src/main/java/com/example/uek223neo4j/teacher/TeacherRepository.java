package com.example.uek223neo4j.teacher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This is an example repository with an example query
@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

    // This is an example query, it isn't actually used
    // It exists to show the basic syntax of the generated queries
    public Teacher findByTeachernameAndLockedFalse(String teachername);

}
