package com.java.resturant.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.resturant.appconstants.AppConstants;
import com.java.resturant.dto.ResturantDto;
import com.java.resturant.entity.Resturant;
import com.java.resturant.service.ResturantService;

@RequestMapping(value = AppConstants.RESTURANT_CONTROLLER)
@RestController
public class ResturantController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ResturantController.class);

	@Autowired
	private ResturantService resturantService;

	@PostMapping(value = AppConstants.SAVE)
	public void saveResturantDetails(@RequestBody Resturant resturant) {
		LOGGER.info("executing saveResturantDetails() of ResturantController : " + resturant);
		resturantService.saveResturantDetails(resturant);
	}

	@GetMapping(value = AppConstants.FIND_RESTURANTS)
	public @ResponseBody List<Resturant> findResturant(Resturant resturant) {
		return resturantService.findResturant();
	}

	@GetMapping(value = AppConstants.FIND_RESTURANTS_BY_ID)
	public Resturant findResturantById(@RequestHeader(name = AppConstants.ID) Long id) {
		return resturantService.findResturantById(id);
	}

	@DeleteMapping(value = AppConstants.DELETE_RESTURANTS_BY_ID)
	public void deleteResturantById(@RequestHeader(name = AppConstants.ID) Long id) {

		resturantService.deleteResturantById(id);
	}

	@PutMapping(value = AppConstants.UPDATE_RESTURANT_DETAILS)
	public void updateResturantDetails(@RequestBody ResturantDto resturantDto) {
		resturantService.updateResturantDetails(resturantDto);
	}

	@GetMapping(value = AppConstants.FIND_BY_NAME)
	public @ResponseBody List<Resturant> findResturantByName(@RequestHeader("resName") String resName) {
		return resturantService.findResturantByName(resName);

	}
}
