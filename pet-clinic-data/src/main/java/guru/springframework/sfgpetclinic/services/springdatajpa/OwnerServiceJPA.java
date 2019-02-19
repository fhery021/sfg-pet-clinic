package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Ferenc on 2/4/2019.
 *
 * Additional operations for Owner
 */
@Service
@Profile("springdatajpa")
public class OwnerServiceJPA implements OwnerService , CrudService<Owner, Long> {

    private final OwnerRepository repository;

    public OwnerServiceJPA(OwnerRepository ownerRepository) {
        this.repository = ownerRepository;
    }

    // The CRUDService from Spring boot is overridden by the superclass.
    // From BaseJPAService it gets the basic CRUD operations and from OwnerService the additional ones.

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> all = new HashSet<>();
        repository.findAll().forEach(all::add);
        return all;
    }

    @Override
    public Optional<Owner> findById(Long aLong) {
        return repository.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return repository.save(object);
    }

    @Override
    public void delete(Owner object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
