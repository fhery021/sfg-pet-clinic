package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 2/4/2019.
 */
@Service
@Profile("springdatajpa")
public class SpecialtyServiceJPA extends BaseJPAService<Specialty, Long, SpecialtyRepository> implements SpecialtyService {
    public SpecialtyServiceJPA(SpecialtyRepository repository) {
        super(repository);
    }
}
