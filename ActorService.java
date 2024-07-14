package com.pardo.bookcatalog.service;

import com.pardo.bookcatalog.model.Actor;
import com.pardo.bookcatalog.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> listAllActors() {
        return actorRepository.findAll();
    }

    public List<Actor> listAliveActors() {
        return actorRepository.findByDeathDateIsNull();
    }

    public List<Actor> listActorsByYear(LocalDate year) {
        return actorRepository.findByBirthDateBefore(year);
    }
}

