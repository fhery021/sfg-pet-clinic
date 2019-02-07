package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 2/4/2019.
 */
@Service
@Profile("springdatajpa")
public class PetServiceJPA extends BaseJPAService<Pet, Long, PetRepository> implements PetService{

    public PetServiceJPA(PetRepository repository) {
        super(repository);
    }
}
