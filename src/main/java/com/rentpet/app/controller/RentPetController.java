package com.rentpet.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rentpet.app.entity.Pet;
import com.rentpet.app.service.RentPetService;

/**
  * This file will contain all the controller requests needed in application
  * @author Pavan Singh
  * @RequestBody will convert the jason to the pet entity type based on pojo objects.
  */

@RestController
@RequestMapping(value= "/api/rentpet")
public class RentPetController {
	
	@Autowired
	RentPetService rentPetService;
	
	@PostMapping(value= "/createorder")
	public Pet createorder(@RequestBody Pet pet) {
		return rentPetService.createorder(pet);
	}
	
	@GetMapping(value = "/orderid/{orderid}")
	public Optional<Pet> getorderdetailsbyId(@PathVariable("orderid") Integer orderid) {
		return rentPetService.getorderdetailsbyId(orderid);
	}
	
	@GetMapping(value = "/getallorders")
	public Iterable<Pet> getAllOrders() {
		return rentPetService.getAllOrders();
	}
	
	@DeleteMapping(value = "/deleteorder/{orderid}")
	public void deleteOrder(@PathVariable("orderid") Integer orderid) {
		rentPetService.deleteOrderId(orderid);
	}
	
	@PutMapping(value = "/updateorder")
	public Pet updateOrder(@RequestBody Pet pet) {
		return rentPetService.updateOrder(pet);
	}
	
	
}
