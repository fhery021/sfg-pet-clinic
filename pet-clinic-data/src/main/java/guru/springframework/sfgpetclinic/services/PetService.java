package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Ferenc on 12/28/2018.
 */
public interface PetService {
    Pet findById(Long id);
    Pet save(Pet id);
    Set<Pet> findAll();
}
