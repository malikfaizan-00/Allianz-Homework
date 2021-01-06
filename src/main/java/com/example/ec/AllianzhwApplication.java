package com.example.ec;

import com.example.ec.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AllianzhwApplication implements CommandLineRunner {

	@Autowired
	private CityService cityService;

	public static void main(String[] args) {
		SpringApplication.run(AllianzhwApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createDataModel();
	}
	/**
	 * Initialize all the known tour packages
	 */
	private void createDataModel(){
		cityService.create("Gràcia", "Barcelona") ;
		cityService.create("Eixample", "Barcelona");
		cityService.create("Währing", "Wien");
		cityService.create("Penzing","Wien");
		cityService.create("Maxvorstadt","München");
	}

}
