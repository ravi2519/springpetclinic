package in.ravir.springpetclinic.bootstrap;

import in.ravir.springpetclinic.model.Owner;
import in.ravir.springpetclinic.model.PetType;
import in.ravir.springpetclinic.model.Vet;
import in.ravir.springpetclinic.service.OwnerService;
import in.ravir.springpetclinic.service.VetService;
import in.ravir.springpetclinic.service.map.OwnerServiceMap;
import in.ravir.springpetclinic.service.map.PetTypeMapService;
import in.ravir.springpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * DataLoader
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeMapService petTypeMapService;

    public DataLoader(OwnerServiceMap ownerService, VetServiceMap vetService, PetTypeMapService petTypeMapService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeMapService = petTypeMapService;
    }

    public void run( String... args ) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogtype = petTypeMapService.save(dog);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...."); 

    }


    
}