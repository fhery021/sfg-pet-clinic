package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 2/5/2019.
 */
@Service
@Profile("springdatajpa")
public class VisitServiceJPA extends SpringDataJpaService<Visit, Long, VisitRepository> implements VisitService {
    public VisitServiceJPA(VisitRepository repository) {
        super(repository);
    }
}
