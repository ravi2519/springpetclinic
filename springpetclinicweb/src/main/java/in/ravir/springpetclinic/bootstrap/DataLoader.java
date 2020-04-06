package in.ravir.springpetclinic.bootstrap;

import in.ravir.springpetclinic.model.*;
import in.ravir.springpetclinic.service.OwnerService;
import in.ravir.springpetclinic.service.SpecialityService;
import in.ravir.springpetclinic.service.VetService;
import in.ravir.springpetclinic.service.map.OwnerServiceMap;
import in.ravir.springpetclinic.service.map.PetTypeMapService;
import in.ravir.springpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * DataLoader
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeMapService petTypeMapService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerServiceMap ownerService, VetServiceMap vetService, PetTypeMapService petTypeMapService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeMapService = petTypeMapService;
        this.specialityService = specialityService;
    }

    public void run( String... args ) throws Exception {

        int count = petTypeMapService.findAll().size();
        if( count == 0 ) {
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogtype = petTypeMapService.save(dog);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiologists");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgeon");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentist");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 lane");
        owner1.setCity("Nice");
        owner1.setTelephone("222-111-3333");

        Pet mikesPet = new Pet();
        mikesPet.setName("Butch");
        mikesPet.setPetType(savedDogtype);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setOwner(owner1);

        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 lane");
        owner2.setCity("Nice");
        owner2.setTelephone("222-111-3333");

        Pet fionaPet = new Pet();
        fionaPet.setName("SLug");
        fionaPet.setPetType(savedDogtype);
        fionaPet.setBirthDate(LocalDate.now());
        fionaPet.setOwner(owner2);

        owner2.getPets().add(fionaPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(radiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(dentistry);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }


}