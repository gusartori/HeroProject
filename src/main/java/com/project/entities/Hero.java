package com.project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Hero {

    @Id
    private long id;

    private String name;

    private String realName;

    private long health;

    private long armour;

    private long shield;

}
