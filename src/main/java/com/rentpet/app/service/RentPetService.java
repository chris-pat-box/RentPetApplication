package com.rentpet.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentpet.app.dao.RentPetDao;
import com.rentpet.app.entity.Pet;

/**
 * This file will contain all the code for fetching the details from database
 * 
 * @author Pavan Singh
 *
 */

@Service
public class RentPetService {

	@Autowired
	RentPetDao rentPetDao;

	public Pet createorder(Pet pet) {
		return rentPetDao.save(pet);
	}

	public Optional<Pet> getorderdetailsbyId(Integer orderid) {
		return rentPetDao.findById(orderid);
	}

	public Iterable<Pet> getAllOrders() {
		return rentPetDao.findAll();
	}

	public void deleteOrderId(Integer orderid) {
		rentPetDao.deleteById(orderid);
	}

	public Pet updateOrder(Pet pet) {
		return rentPetDao.save(pet);
	}

}
