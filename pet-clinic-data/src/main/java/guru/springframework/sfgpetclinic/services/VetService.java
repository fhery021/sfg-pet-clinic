package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Ferenc on 12/28/2018.
 */
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet id);
    Set<Vet> findAll();
}
