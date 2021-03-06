package ru.itsjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itsjava.domain.Animal;
import ru.itsjava.domain.Pet;

import java.util.Optional;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Optional<Animal> findAnimalByBreedAndPet(String breed, Pet pet);
}
