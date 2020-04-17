package com.example.uek223neo4j.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

// This is an example service implementation with coded out CRUD logic
// Note that the @Service annotation belongs on here as the effective logic is found here
@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    // The logic for creating a new teacher
    @Override
    public Teacher create(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    // The logic for retrieving all teachers
    @Override
    public List<Teacher> findAll() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    // The logic for retrieving a single teacher with a given id
    @Override
    public Teacher findById(int id) {
        return teacherRepository.findById(id).get();
    }

    // The logic for updating an existing teacher with a given id and data
    @Override
    public Teacher updateById(int id, Teacher teacher) {
        if(teacherRepository.existsById(id)) {
            teacher.setId(id);
            teacherRepository.save(teacher);

            return teacher;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    // The logic for deleting a teacher with a given id
    @Override
    public void deleteById(int id) {
        teacherRepository.deleteById(id);
    }

}
