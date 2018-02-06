package com.project.gateway.repository;

import com.project.entities.Hero;
import org.springframework.data.repository.CrudRepository;

public interface HeroRepository extends CrudRepository<Hero, Long> {

}
