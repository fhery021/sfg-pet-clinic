package guru.springframework.sfgpetclinic.map;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Ferenc on 12/29/2018.
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
