package guru.springframework.sfgpetclinic.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 12/29/2018.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
}
