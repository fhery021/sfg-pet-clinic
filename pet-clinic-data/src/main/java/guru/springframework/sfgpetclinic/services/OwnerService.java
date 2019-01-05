package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Ferenc on 12/28/2018.
 */
public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
