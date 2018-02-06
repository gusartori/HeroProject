package com.project.usecases.impl;

import com.project.entities.AbilityInfo;
import com.project.entities.Hero;
import com.project.gateway.repository.AbilityRepository;
import com.project.gateway.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Service
public class HeroImporterIntegration {

    Client client = ClientBuilder.newClient();

    @Autowired
    AbilityRepository abilityRepository;

    @Autowired
    HeroRepository heroRepository;

    public void importHero() {

        WebTarget webTarget = client.target("https://overwatch-api.net/api/v1/ability");
        Invocation.Builder invocationBuilder = webTarget.request(APPLICATION_JSON);
        AbilityInfo abilityInfo = invocationBuilder.get(AbilityInfo.class);
        abilityInfo.getData().stream().forEach(ability -> {
            Hero hero = ability.getHero();
            hero.setDescription("");
            ability.setDescription("");
            heroRepository.save(hero);
            abilityRepository.save(ability);

        });
    }
}
