package Shelter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
    private String name;
    private String address;
    private String email;
    private int id;
    private List<Adoption> adoptionList= new ArrayList<>();

    public User(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.id=generateID();
        // to do - reszta - lista

    }

    public void ViewAnimals(){
        //todo
    }
    public void AdoptAnimals(){
        //todo
    }
    private int generateID() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // Losowe ID z przedziału 100000 - 999999
    }

    public int getId() {
        return id;
    }
}
