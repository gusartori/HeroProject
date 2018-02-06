package com.project.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Setter
@Getter
@XmlRootElement
public class Hero {
    @Id
    @JsonIdentityInfo(property = "id", generator = ObjectIdGenerators.IntSequenceGenerator.class)
    private long id;
    private String name;
    @JsonProperty("real_name")
    private String realName;
    private long health;
    private long armour;
    private long shield;
    private String description;
    private int age;
    private int height;
    private String affiliation;
    @JsonProperty("base_of_operations")
    private String baseOperations;
    private int difficulty;
    private String url;
}