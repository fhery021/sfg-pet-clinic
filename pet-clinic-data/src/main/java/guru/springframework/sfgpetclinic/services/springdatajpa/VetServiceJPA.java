package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.repositories.VetRepository;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 2/4/2019.
 */
@Service
@Profile("springdatajpa")
public class VetServiceJPA extends SpringDataJpaService<Vet,Long, VetRepository> implements VetService{
    public VetServiceJPA(VetRepository repository) {
        super(repository);
    }
}
