package guru.springframework.sfgpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ferenc on 12/27/2018.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Owners")
public class Owner extends Person {

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city,
                 String telephone, Set<Pet> pets){
        super(id, firstName, lastName);
        setAddress(address);
        setCity(city);
        setTelephone(telephone);
        setPets(pets != null ? pets : new HashSet<>());
    }

    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

}
