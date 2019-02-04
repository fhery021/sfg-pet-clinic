package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 1/19/2019.
 */
@Service
public class SpecialtyServiceMap extends MapService<Specialty, Long> implements SpecialtyService {

}
