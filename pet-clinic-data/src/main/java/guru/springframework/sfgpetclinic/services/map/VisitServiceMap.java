package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

/**
 * Created by Ferenc on 2/5/2019.
 */
@Service
public class VisitServiceMap extends MapService<Visit, Long> implements VisitService{

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null){
            throw new RuntimeException("Invalid visit");
        }

        return super.save(visit);
    }
}
