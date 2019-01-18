package guru.springframework.sfgpetclinic.map;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 1/18/2019.
 */
// TODO Check if it is really need to owverride with super() the methods from PetTypeService
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService{

}
