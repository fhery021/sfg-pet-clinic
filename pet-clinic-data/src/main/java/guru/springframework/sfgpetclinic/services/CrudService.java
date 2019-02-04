package guru.springframework.sfgpetclinic.services;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Ferenc on 12/29/2018.
 */
public interface CrudService<T,ID extends Long> {

    Set<T> findAll();

    Optional<T> findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
