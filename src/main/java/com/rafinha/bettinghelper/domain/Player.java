package com.rafinha.bettinghelper.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Wartośc nie może być pusta!")
    @Size(min=2, message = "Imię musi skladać się przynajmniej z 2 liter")
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String name;

    @NotNull(message = "Wartośc nie może być pusta!")
    @Size(min=2, message = "Imię musi skladać się przynajmniej z 2 liter")
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String surname;

    @NotNull
    @Size(min = 1, max = 2, message = "Wiek musi być cyfrą pomiędzy 1 a 99")
    @Pattern(regexp = "^[0-9]+")
    private int age;

    @ManyToMany(targetEntity = Match.class)
    private List<Match> matchList;
}

