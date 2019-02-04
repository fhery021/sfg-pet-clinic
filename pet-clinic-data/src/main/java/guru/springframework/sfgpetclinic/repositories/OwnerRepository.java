package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ferenc on 2/4/2019.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
