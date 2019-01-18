package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Ferenc on 12/27/2018.
 */
public class Vet extends Person {
    private Set<Speciality> specialties;

    public Set<Speciality> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Speciality> specialties) {
        this.specialties = specialties;
    }

    public int nrOfSpecialties(){
        return specialties.size();
    }
}
