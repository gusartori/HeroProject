package com.project.usecases.impl;

import com.project.entities.Ability;
import com.project.gateway.AbilityGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.project.usecases.AbilityIntegration;

@RequiredArgsConstructor
@Component
public class AbilityIntegrationImpl implements AbilityIntegration {

    private final AbilityGateway abilityGateway;

    @Override
    public Iterable<Ability> listAbilities(){
        return abilityGateway.listAllAbilities();
    }

    @Override
    public Ability getAbility(long id){
        return abilityGateway.getAbility(id);
    }
}
