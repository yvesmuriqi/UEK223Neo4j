package com.example.uek223neo4j.apprentice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

// This is an example service implementation with coded out CRUD logic
// Note that the @Service annotation belongs on here as the effective logic is found here
@Service
public class ApprenticeServiceImpl implements ApprenticeService {

    private ApprenticeRepository apprenticeRepository;

    @Autowired
    public ApprenticeServiceImpl(ApprenticeRepository apprenticeRepository) {
        this.apprenticeRepository = apprenticeRepository;
    }

    @Override
    public Apprentice create(Apprentice user) {
        return apprenticeRepository.save(user);
    }

    @Override
    public List<Apprentice> findAll() {
        return (List<Apprentice>) apprenticeRepository.findAll();
    }

    @Override
    public Apprentice findById(int id) {
        return apprenticeRepository.findById(id).get();
    }

    @Override
    public Apprentice updateById(int id, Apprentice user) {
        if(apprenticeRepository.existsById(id)) {
            user.setId(id);
            apprenticeRepository.save(user);

            return user;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    @Override
    public void deleteById(int id) {
        apprenticeRepository.deleteById(id);
    }

}
