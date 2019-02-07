package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 2/4/2019.
 */
@Service
@Profile("springdatajpa")
public class PetTypeServiceJPA extends BaseJPAService<PetType, Long, PetTypeRepository> implements PetTypeService{
    public PetTypeServiceJPA(PetTypeRepository repository) {
        super(repository);
    }
}
