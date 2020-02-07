package in.ravir.springpetclinic.model;

public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;


    public void setPetType( PetType petType ) {
        this.petType = petType;        
    }

    public void getPetType() {
        return this.petType;        
    }

    public void setOwner( Owner owner ) {
        this.owner = owner;        
    }

    public void getOwner() {
        return this.owner;        
    }

    public void setBirthDate( LocalDate birthDate ) {
        this.birthDate = birthDate;        
    }

    public void getBirthDate() {
        return this.birthDate;        
    }

}