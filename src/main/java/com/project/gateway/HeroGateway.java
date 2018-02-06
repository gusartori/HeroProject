package com.project.gateway;

import com.project.entities.Hero;

public interface HeroGateway {
    Iterable<Hero> listAllHeroes();

    Hero getHero(long id);
}
