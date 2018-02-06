package com.project.usecases.impl;

import com.project.entities.Ability;
import com.project.entities.Hero;
import com.project.gateway.AbilityGateway;
import com.project.gateway.HeroGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.project.usecases.HeroIntegration;

@RequiredArgsConstructor
@Component
public class HeroIntegrationImpl implements HeroIntegration {

    private final HeroGateway heroGateway;

    private final AbilityGateway abilityGateway;

    @Override
    public Iterable<Hero> listHeroes(){
        return heroGateway.listAllHeroes();
    }

    @Override
    public Hero getHero(long id){
        return heroGateway.getHero(id);
    }

    @Override
    public Iterable<Ability> getHeroAbilities(long id){
        return abilityGateway.getAbilityByHero(id);
    }
}
