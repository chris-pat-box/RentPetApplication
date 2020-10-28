package com.rentpet.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rentpet.app.entity.Pet;

/**
 * Any Database access, use this file.
 * 
 * @author Pavan Singh
 *
 */

@Repository
public interface RentPetDao extends CrudRepository<Pet, Integer> {

}
