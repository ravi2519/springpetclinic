package in.ravir.springpetclinic.model;

public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

}