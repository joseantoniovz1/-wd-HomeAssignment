package org.westerndigital.wdhomeassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.westerndigital.wdhomeassignment.model.TheOfficeCharacter;
import org.westerndigital.wdhomeassignment.service.CharacterService;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;


    @GetMapping
    public List<TheOfficeCharacter> getCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/{id}")
    public TheOfficeCharacter getCharacterById(@PathVariable("id") String id) {
        return characterService.getCharacterById(id);
    }

    @PostMapping
    public TheOfficeCharacter addCharacter(@RequestBody TheOfficeCharacter character) {
        return characterService.createCharacter(character);
    }

    @PatchMapping("/{id}")
    public TheOfficeCharacter updateCharacter(@PathVariable("id") String id,
                                              @RequestBody TheOfficeCharacter character) {
        return characterService.updateCharacter(id, character);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCharacter(@PathVariable("id") String id) {
        characterService.deleteCharacterById(id);
        return ResponseEntity.accepted().build();
    }


}
