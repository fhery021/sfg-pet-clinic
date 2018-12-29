package guru.springframework.sfgpetclinic.map;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Ferenc on 12/29/2018.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
