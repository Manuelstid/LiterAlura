package controller;

import com.pardo.bookcatalog.model.Actor;
import com.pardo.bookcatalog.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping
    public List<Actor> listAllActors() {
        return actorService.listAllActors();
    }

    @GetMapping("/alive")
    public List<Actor> listAliveActors() {
        return actorService.listAliveActors();
    }

    @GetMapping("/year/{year}")
    public List<Actor> listActorsByYear(@PathVariable String year) {
        return actorService.listActorsByYear(LocalDate.parse(year + "-01-01"));
    }
}

