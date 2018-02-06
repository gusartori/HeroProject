package com.project.gateway.impl;

import com.project.entities.Ability;
import com.project.gateway.AbilityGateway;
import com.project.gateway.repository.AbilityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AbilityGatewayImpl implements AbilityGateway {

    private final AbilityRepository abilityRepository;

    @Override
    public Iterable<Ability> listAllAbilities(){
        return abilityRepository.findAll();
    }

    @Override
    public Ability getAbility(long id){
        return abilityRepository.findOne(id);
    }

    @Override
    public Iterable<Ability> getAbilityByHero(long id){
        return abilityRepository.findByHeroId(id);
    }
}
