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
    };
    public Animal getAnimalListElem(int i){
        try {
            if(i<animalList.size()){
                return animalList.get(i);
            }else{
                throw  new IndexOutOfBoundsException();
            }

        }catch (IndexOutOfBoundsException e){
            System.out.println("Nie ma takiego elementu!!!");
        }
        return null;
    }
    public void addAnimalToList(Animal animal){
        animalList.add(animal);
    }


    public Employee getEmployeeListElem(int i){
        try {
            if(i<employeeList.size()){
                return employeeList.get(i);
            }else{
                throw  new IndexOutOfBoundsException();
            }

        }catch (IndexOutOfBoundsException e){
            System.out.println("Nie ma takiego elementu!!!");
        }
        return null;
    }
    public void addEmployeeToList(Employee employee){
        employeeList.add(employee);
    }


    public Adoption getAdoptionListElem(int i){
        try {
            if(i<adoptionList.size()){
                return adoptionList.get(i);
            }else{
                throw  new IndexOutOfBoundsException();
            }

        }catch (IndexOutOfBoundsException e){
            System.out.println("Nie ma takiego elementu!!!");
        }
        return null;
    }
    public void addAdoptionApplicationToList(Adoption adoption){
        adoptionList.add(adoption);
    }
}

