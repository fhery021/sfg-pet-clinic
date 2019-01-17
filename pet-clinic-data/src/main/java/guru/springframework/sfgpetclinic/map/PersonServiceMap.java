package guru.springframework.sfgpetclinic.map;

import guru.springframework.sfgpetclinic.model.Person;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Ferenc on 12/29/2018.
 */
@Service
public class PersonServiceMap extends AbstractMapService<Person, Long> {

    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Person object) {
        super.delete(object);
    }

    @Override
    public Person save(Person object) {
        return super.save(object);
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }
}