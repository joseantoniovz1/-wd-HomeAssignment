package org.westerndigital.wdhomeassignment.service;

import org.westerndigital.wdhomeassignment.model.TheOfficeCharacter;

import java.util.List;

public interface CharacterService {

    List<TheOfficeCharacter> getAllCharacters();
    TheOfficeCharacter getCharacterById(String id);
    TheOfficeCharacter updateCharacter(String id, TheOfficeCharacter character);
    void deleteCharacterById(String id);
    TheOfficeCharacter createCharacter(TheOfficeCharacter character);
}
