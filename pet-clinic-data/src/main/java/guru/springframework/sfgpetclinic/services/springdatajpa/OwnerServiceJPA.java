package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 2/4/2019.
 *
 * Additional operations for Owner
 */
@Service
@Profile("springdatajpa")
public class OwnerServiceJPA extends SpringDataJpaService<Owner, Long, OwnerRepository> implements OwnerService {

    public OwnerServiceJPA(OwnerRepository repository) {
        super(repository);
    }

    // The CRUDService from Spring boot is overridden by the superclass.
    // From SpringDataJpaService it gets the basic CRUD operations and from OwnerService the additional ones.

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

}
