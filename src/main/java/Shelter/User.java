package Shelter;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String address;
    private String email;
    private List<Adoption> adoptionList= new ArrayList<>();

    public User(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        // to do - reszta - lista

    }

    public void ViewAnimals(){
        //todo
    }
    public void AdoptAnimals(){
        //todo
    }
}
