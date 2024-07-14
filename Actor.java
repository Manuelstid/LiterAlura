package com.pardo.bookcatalog.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthDate;
    private LocalDate deathDate;

    // getters and setters
}
