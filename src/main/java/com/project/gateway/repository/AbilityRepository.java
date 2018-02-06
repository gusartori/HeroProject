package com.project.gateway.repository;

import com.project.entities.Ability;
import org.springframework.data.repository.CrudRepository;

public interface AbilityRepository extends CrudRepository<Ability, Long> {

    Iterable<Ability> findByHeroId(long id);
}
