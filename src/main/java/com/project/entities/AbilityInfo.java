package com.project.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@Setter
@Getter
@XmlRootElement
public class AbilityInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    @Column
    private List<Ability> data;

    private int total;

    private String first;

    private String next;

    private String previous;

    private String last;
}
