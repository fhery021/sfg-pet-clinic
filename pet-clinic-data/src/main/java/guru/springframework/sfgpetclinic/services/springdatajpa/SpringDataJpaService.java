package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.BaseEntity;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.data.repository.CrudRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Ferenc on 2/4/2019.
 * Basic CRUD operations using Spring Data JPA.
 *
 */
public class SpringDataJpaService<T extends BaseEntity, ID extends Long, R extends CrudRepository<T, Long>> implements CrudService<T, ID>{

    protected final R repository;

    public SpringDataJpaService(R repository){
        this.repository = repository;
    }

    @Override
    public Set<T> findAll() {
        Set<T> all = new HashSet<>();
        repository.findAll().iterator().forEachRemaining(all::add);
        return all;
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public T save(T object) {
        return repository.save(object);
    }

    @Override
    public void delete(T object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

}
