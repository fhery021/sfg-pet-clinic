package guru.springframework.sfgpetclinic.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 1/19/2019.
 */
// TODO Check if it is really need to override with super() the methods from PetTypeService
@Service
public class SpecialtiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
}
