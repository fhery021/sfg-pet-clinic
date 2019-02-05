package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 12/29/2018.
 */
@Service
@Profile({"default", "map"})
public class PetServiceMap extends MapService<Pet, Long> implements PetService {
}
