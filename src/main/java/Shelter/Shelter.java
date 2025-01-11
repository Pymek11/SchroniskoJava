package Shelter;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

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

    // Zapis zwierząt do pliku csv
    public void saveAnimalListToCSV(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("ID,Species,Breed,Age,Weight,Description,Picture\n"); // Nagłówki kolumn
            for (Animal animal : animalList) {
                writer.write(animal.getID() + "," +
                        animal.getSpecies() + "," +
                        animal.getBreed() + "," +
                        animal.getAge() + "," +
                        animal.getWeight() + "," +
                        animal.getDescription() + "," +
                        animal.getPicture() + "\n");
            }
            System.out.println("Lista zwierząt została zapisana do pliku: " + filename);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku CSV.");
            e.printStackTrace();
        }
    }

    // zapisz
    public void saveEmployeeListToCSV(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("ID,Name,Position,Salary\n"); // Nagłówki kolumn
            for (Employee employee : employeeList) {
                // to do
            }
            System.out.println("Lista pracowników została zapisana do pliku: " + filename);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku CSV.");
            e.printStackTrace();
        }
    }

    // zapis adopcji do csv
    public void saveAdoptionListToCSV(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("AdoptionID,AnimalID,EmployeeID,Date\n"); // Nagłówki kolumn
            for (Adoption adoption : adoptionList) {
                // to do
            }
            System.out.println("Lista adopcji została zapisana do pliku: " + filename);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku CSV.");
            e.printStackTrace();
        }
    }


}

