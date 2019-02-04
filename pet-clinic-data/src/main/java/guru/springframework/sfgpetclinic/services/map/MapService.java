package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.*;

/**
 * Created by Ferenc on 12/29/2018.
 */
public class MapService<T extends BaseEntity, ID extends Long> implements CrudService<T,ID>{

    private Map<Long, T> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public Optional<T> findById(ID id){
        return Optional.ofNullable(map.get(id));
    }

    public void deleteById(ID id){
        map.remove(id);
    }

    public void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public T save(T object){
        if (object != null){
            if(object.getId() == null){
                object.setId(getNextID());
            }
            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    private Long getNextID(){
        Long nextId;
        try{
            nextId = Collections.max(map.keySet())+1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }
}
