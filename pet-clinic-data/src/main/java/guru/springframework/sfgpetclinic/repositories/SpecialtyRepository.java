package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ferenc on 2/4/2019.
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
