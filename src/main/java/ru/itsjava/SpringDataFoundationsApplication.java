package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.service.AnimalService;
import ru.itsjava.service.PetService;


@SpringBootApplication
public class SpringDataFoundationsApplication {

	public static void main(String[] args) {

		var context =SpringApplication
                .run(SpringDataFoundationsApplication.class, args);

		AnimalService animalService = context.getBean(AnimalService.class);
		animalService.printAllAnimals();

		PetService petService = context.getBean(PetService.class);
		petService.changePet("hamster", "Wolf");
		petService.printPet("Wolf");
	}

}
