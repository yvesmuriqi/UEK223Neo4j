package com.example.uek223neo4j.apprentice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenticeRepository extends CrudRepository<Apprentice, Integer> {
}
