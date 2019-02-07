package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 1/19/2019.
 */
@Service
@Profile({"default", "map"})
public class SpecialtyServiceMap extends BaseMapService<Specialty, Long> implements SpecialtyService {

}
