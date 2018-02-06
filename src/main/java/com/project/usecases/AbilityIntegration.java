package com.project.usecases;

import com.project.entities.Ability;

public interface AbilityIntegration {
    Iterable<Ability> listAbilities();

    Ability getAbility(long id);
}
