package com.pardo.bookcatalog.repository;

import com.pardo.bookcatalog.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    List<Actor> findByDeathDateIsNull();
    List<Actor> findByBirthDateBefore(LocalDate year);
}

