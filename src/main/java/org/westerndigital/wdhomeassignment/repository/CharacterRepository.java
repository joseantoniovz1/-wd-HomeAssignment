package org.westerndigital.wdhomeassignment.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.westerndigital.wdhomeassignment.model.TheOfficeCharacter;

@EnableScan
public interface CharacterRepository extends CrudRepository<TheOfficeCharacter, String> {

}
