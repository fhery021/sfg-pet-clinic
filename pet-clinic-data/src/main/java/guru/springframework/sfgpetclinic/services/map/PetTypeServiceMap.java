package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 1/18/2019.
 */
@Service
public class PetTypeServiceMap extends MapService<PetType, Long> implements PetTypeService{

}
