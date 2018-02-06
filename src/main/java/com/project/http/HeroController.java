package com.project.http;


import com.project.entities.Ability;
import com.project.entities.Hero;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.usecases.HeroIntegration;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/heros")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HeroController {

    private final HeroIntegration heroIntegration;

    @GetMapping(path = "/")
    public ResponseEntity<Iterable<Hero>> listHeroes() throws URISyntaxException {
        return ResponseEntity.ok().body(heroIntegration.listHeroes());
    }

    @GetMapping(path = "/{heroId}")
    public ResponseEntity<Hero> getHero(@PathVariable("heroId") long heroId) throws URISyntaxException {
        return ResponseEntity.ok().body(heroIntegration.getHero(heroId));
    }

    @GetMapping(path = "/{heroId}/abilities")
    public ResponseEntity<Iterable<Ability>> getHeroAbilities(@PathVariable("heroId") long heroId) throws URISyntaxException {
        return ResponseEntity.ok().body(heroIntegration.getHeroAbilities(heroId));
    }

}