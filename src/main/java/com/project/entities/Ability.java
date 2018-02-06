package com.project.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Setter
@Getter
@XmlRootElement
public class Ability  {
    @Id
    private long id;
    private String name;
    private String description;
    @JsonProperty("is_ultimate")
    private boolean isUltimate;
    private String url;
    @ManyToOne(cascade = CascadeType.ALL)
    private Hero hero;
}