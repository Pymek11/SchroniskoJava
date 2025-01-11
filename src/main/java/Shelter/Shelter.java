package Shelter;
import java.util.List;
import java.util.ArrayList;

public class Shelter {
    // Atrybuty
    private List<Animal> animalList;
    private List<Employee> employeeList;
    private List<Adoption> adoptionList;

    // Konstruktor
    public Shelter() {
        this.animalList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
        this.adoptionList = new ArrayList<>();
    }
}

