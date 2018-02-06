package com.project.gateway.impl;

import com.project.entities.Hero;
import com.project.gateway.HeroGateway;
import com.project.gateway.repository.HeroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class HeroGatewayImpl implements HeroGateway {

    private final HeroRepository heroRepository;

    @Override
    public Iterable<Hero> listAllHeroes(){
        return heroRepository.findAll();
    }

    @Override
    public Hero getHero(long id){
        return heroRepository.findOne(id);
    }

}
