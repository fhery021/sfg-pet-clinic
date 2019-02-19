package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(value = MockitoExtension.class)
public class OwnerServiceJPATest {

    private static final String LAST_NAME = "Smith";

    @Mock
    private OwnerRepository ownerRepository;

    @Mock
    private PetRepository petRepository;

    @Mock
    private BaseJPAService baseJPAService;

    @Mock
    private PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerServiceJPA service;

    @BeforeEach
    void setUp() {
        service.save(Owner.builder()
                .id(1L)
                .lastName("Bond")
                .firstName("James")
                .address("Gyepes utca 1")
                .city("Zerind")
                .telephone("0257 355 123")
                .build());
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
        final Long ID = 3L;
        Owner owner2 = Owner.builder().id(ID).build();

        when(ownerRepository.save(owner2)).thenReturn(owner2);

        Owner savedOwner = service.save(owner2);

        assertEquals(ID, savedOwner.getId());
//        verify(ownerRepository, times(1)).save(owner2);
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByLastName() {
        Owner returnOwner = Owner.builder()
                .id(2L)
                .lastName(LAST_NAME)
                .build();

        when(ownerRepository.findByLastName(any(String.class))).thenReturn(returnOwner);

        Owner owner = service.findByLastName(LAST_NAME);

        assertEquals(returnOwner, owner);
    }
}