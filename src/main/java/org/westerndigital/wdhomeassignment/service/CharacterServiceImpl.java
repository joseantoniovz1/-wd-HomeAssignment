package org.westerndigital.wdhomeassignment.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.westerndigital.wdhomeassignment.model.TheOfficeCharacter;
import org.westerndigital.wdhomeassignment.repository.CharacterRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository characterRepository;


    @Override
    public List<TheOfficeCharacter> getAllCharacters() {
        return (List<TheOfficeCharacter>) characterRepository.findAll();
    }

    @Override
    public TheOfficeCharacter getCharacterById(String id) {
        return Optional.of(characterRepository.findById(id)).get().orElse(null);
    }

    @Override
    public TheOfficeCharacter updateCharacter(String id, TheOfficeCharacter character) {
        if(characterRepository.existsById(id)) {
            return characterRepository.save(character);
        }
        return null;
    }

    @Override
    public void deleteCharacterById(String id) {
        characterRepository.deleteById(id);
    }

    @Override
    public TheOfficeCharacter createCharacter(TheOfficeCharacter character) {
        return characterRepository.save(character);
    }
}
