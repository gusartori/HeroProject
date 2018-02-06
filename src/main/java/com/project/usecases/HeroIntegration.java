package com.project.usecases;

import com.project.entities.Ability;
import com.project.entities.Hero;

public interface HeroIntegration {
    Iterable<Hero> listHeroes();

    Hero getHero(long id);

    Iterable<Ability> getHeroAbilities(long id);
}
