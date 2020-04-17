package com.example.uek223neo4j.apprentice;

import java.util.List;

// This is an example service with method signatures for CRUD logic
public interface ApprenticeService {

    Apprentice create(Apprentice user);

    List<Apprentice> findAll();

    Apprentice findById(int id);

    Apprentice updateById(int id, Apprentice user);

    void deleteById(int id);

}
