package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    private final Long OWNER_ID = 1L;
    private final String LAST_NAME = "Smith";

    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
        ownerServiceMap.save(Owner.builder()
                .id(OWNER_ID)
                .lastName(LAST_NAME)
                .build());
    }

    @Test
    void findAll(){
        Set<Owner> owners = ownerServiceMap.findAll();

        assertEquals(1, owners.size());
    }

    @Test
    void findById(){
        Optional<Owner> owner = ownerServiceMap.findById(OWNER_ID);

        assertTrue(owner.isPresent());
        assertEquals(OWNER_ID, owner.get().getId());
    }

    @Test
    void saveExistingId() {
        final Long ID = 2L;
        Owner owner2 = Owner.builder().id(ID).build();

        Owner savedOwner = ownerServiceMap.save(owner2);

        assertEquals(ID, savedOwner.getId());
    }

    @Test
    void saveNoId(){
        Owner savedOwner = ownerServiceMap.save(Owner.builder().build());

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete(){
        ownerServiceMap.delete(ownerServiceMap.findById(OWNER_ID).get());

        assertTrue(ownerServiceMap.findAll().isEmpty());
    }

    @Test
    void deleteById(){
        ownerServiceMap.deleteById(OWNER_ID);

        assertFalse(ownerServiceMap.findById(OWNER_ID).isPresent());
        assertTrue(ownerServiceMap.findAll().isEmpty());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerServiceMap.findByLastName(LAST_NAME);

        assertNotNull(owner);
        assertEquals(OWNER_ID, owner.getId());
    }
    @Test
    void findByLastNameNotFound() {
        Owner owner = ownerServiceMap.findByLastName("Jani");

        assertNull(owner);
    }
}