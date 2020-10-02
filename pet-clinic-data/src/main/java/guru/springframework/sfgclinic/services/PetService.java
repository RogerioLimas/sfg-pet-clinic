package guru.springframework.sfgclinic.services;

import guru.springframework.sfgclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}