package com.project.gateway;

import com.project.entities.Ability;

public interface AbilityGateway {
    Iterable<Ability> listAllAbilities();

    Ability getAbility(long id);

    Iterable<Ability> getAbilityByHero(long id);
}
