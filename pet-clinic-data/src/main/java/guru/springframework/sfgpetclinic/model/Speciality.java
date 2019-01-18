package guru.springframework.sfgpetclinic.model;

/**
 * Created by Ferenc on 1/18/2019.
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
