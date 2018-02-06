package com.project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Ability {

    @Id
    private long id;

    private String name;

    private String description;

    private long isUltimate;

    private long heroId;
}
