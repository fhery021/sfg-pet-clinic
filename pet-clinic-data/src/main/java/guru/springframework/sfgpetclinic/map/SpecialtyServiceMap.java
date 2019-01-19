package guru.springframework.sfgpetclinic.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 1/19/2019.
 */
@Service
public class SpecialtyServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtyService {

}
