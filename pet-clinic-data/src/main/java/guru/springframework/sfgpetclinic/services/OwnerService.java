package guru.springframework.sfgpetclinic.services;

/**
 * Created by Ferenc on 12/28/2018.
 */
public interface OwnerService<Owner, Long> {
    Owner findByLastName(String lastName);
}
