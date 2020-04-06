package in.ravir.springpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetType(PetType petType ) {
        this.petType = petType;        
    }

    public PetType getPetType() {
        return this.petType;        
    }

    public void setOwner( Owner owner ) {
        this.owner = owner;        
    }

    public Owner getOwner() {
        return this.owner;        
    }

    public void setBirthDate( LocalDate birthDate ) {
        this.birthDate = birthDate;        
    }

    public LocalDate getBirthDate() {
        return this.birthDate;        
    }

}