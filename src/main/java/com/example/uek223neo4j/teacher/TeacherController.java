package com.example.uek223neo4j.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// This is an example controller with CRUD logic
@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping({"/", ""})
    public ResponseEntity<Teacher> create(@RequestBody Teacher user) {
        return new ResponseEntity<>(teacherService.create(user), HttpStatus.CREATED);
    }

    @GetMapping({"/", ""})
    public ResponseEntity<List<Teacher>> getAll() {
        return new ResponseEntity<>(teacherService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getById(@PathVariable int id) {
        return new ResponseEntity<>(teacherService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Teacher> updateById(@PathVariable int id, @RequestBody Teacher teacher) {
        return new ResponseEntity<>(teacherService.updateById(id, teacher), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        teacherService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
