package guru.springframework.sfgpetclinic.model;

/**
 * Created by Ferenc on 12/27/2018.
 */
public class PetType extends BaseEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
