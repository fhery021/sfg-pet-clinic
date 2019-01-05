package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.map.VetServiceMap;
import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Person;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Ferenc on 1/6/2019.
 */
@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerService<Person, Number> ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... strings) throws Exception {
        Owner owner1  = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        Owner owner2  = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        System.out.println("Owners loaded...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Iulius");
        vet2.setLastName("Caesar");

        vetService.save(vet1);

        System.out.println("Vets loaded...");
    }
}
