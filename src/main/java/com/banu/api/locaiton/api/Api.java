package com.banu.api.locaiton.api;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banu.api.location.model.Location;

@RestController
public class Api {
	private List<Location> locations;
	protected Logger logger = Logger.getLogger(Api.class.getName());

	public Api() {
System.out.println("Entered into locations api service");
		locations = new ArrayList<>();
		locations.add(new Location("singapore", "1000000"));
		locations.add(new Location("aarhus", "1000001"));
		locations.add(new Location("newark", "1000002"));
		locations.add(new Location("tokyo", "1000003"));
		locations.add(new Location("jawaharlal nehru", "1000004"));
		locations.add(new Location("felixtowe", "1000005"));
		locations.add(new Location("London", "1000006"));
		locations.add(new Location("New York", "1000007"));

	}

	@RequestMapping("/locations/{cities}")
	public Location findByCity(@PathVariable("cities") String cities) {
		logger.info(String.format("Cities findByCity(%s)", cities));
		return locations.stream().filter(it -> it.getCities().equals(cities)).findFirst().get();
	}

	@RequestMapping("/locations")
	public List<Location> findAll() {
		logger.info("Location.findall()");
		return locations;
	}
}
