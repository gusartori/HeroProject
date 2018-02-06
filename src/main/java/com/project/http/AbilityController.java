package com.project.http;


import com.project.entities.Ability;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.usecases.AbilityIntegration;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/abilities")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AbilityController {

    private final AbilityIntegration abilityIntegration;

    @GetMapping(path = "/")
    public ResponseEntity<Iterable<Ability>> listAbilities() throws URISyntaxException {
        return ResponseEntity.ok().body(abilityIntegration.listAbilities());
    }

    @GetMapping(path = "/{abilityId}")
    public ResponseEntity<Ability> getAbility(@PathVariable("abilityId") long abilityId) throws URISyntaxException {
        return ResponseEntity.ok().body(abilityIntegration.getAbility(abilityId));
    }

}
