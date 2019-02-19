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

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(value = MockitoExtension.class)
public class OwnerServiceJPATest {

    private static final String LAST_NAME = "Smith";
    private static final Long ID = 1001L;
    private Owner returnOwner;

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
        returnOwner = Owner.builder()
                .id(ID)
                .lastName("Bond")
                .firstName("James")
                .address("Gyepes utca 1")
                .city("Zerind")
                .telephone("0257 355 123")
                .build();
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1L).build());
        returnOwnerSet.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);

        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(java.util.Optional.ofNullable(returnOwner));

        assertNotNull(service.findById(ID).get());
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        assertEquals(Optional.empty(), service.findById(ID));
    }

    @Test
    void save() {
        final Long ID = 3L;
        Owner owner2 = Owner.builder().id(ID).build();

        when(ownerRepository.save(owner2)).thenReturn(owner2);

        Owner savedOwner = service.save(owner2);

        assertEquals(ID, savedOwner.getId());
        verify(ownerRepository, times(1)).save(owner2);
        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        service.delete(this.returnOwner);
        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(ID);
        verify(ownerRepository).deleteById(any());
    }

    @Test
    void findByLastName() {
        Owner owner2 = Owner.builder()
                .id(2L)
                .lastName(LAST_NAME)
                .build();

        when(ownerRepository.findByLastName(any())).thenReturn(owner2);
        Owner owner = service.findByLastName(LAST_NAME);

        verify(ownerRepository).findByLastName(any());
        assertEquals(LAST_NAME, owner.getLastName());
    }
}