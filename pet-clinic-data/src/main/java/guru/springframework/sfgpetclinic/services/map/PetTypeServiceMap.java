package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 1/18/2019.
 */
@Service
@Profile({"default", "map"})
public class PetTypeServiceMap extends BaseMapService<PetType, Long> implements PetTypeService{

}
