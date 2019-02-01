package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ferenc on 12/27/2018.
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties",
            joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Speciality> specialties = new HashSet<>();

    public Set<Speciality> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Speciality> specialties) {
        this.specialties = specialties;
    }

    public int getNrOfSpecialties(){
        return specialties.size();
    }
}
