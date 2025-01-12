package Shelter;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Shelter {
    private List<Animal> animalList;
    private List<Employee> employeeList;
    private List<Adoption> adoptionList;
    private List<User> userList;

    public Shelter() {
        this.animalList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
        this.adoptionList = new ArrayList<>();
        this.userList = new ArrayList<>();

        loadAnimalListFromCSV("ListaZwierzat");
        //loadEmployeeListFromCSV("ListaPracownikow");
        //loadAdoptionListFromCSV("ListaWnioskow");
        //loadUserListFromCSV("ListaUzytkownikow");
    }

    private void loadAnimalListFromCSV(String filename) {
        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + filename;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Pominięcie nagłówka
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Animal animal = new Animal(data[1], data[2], Integer.parseInt(data[3]), Float.parseFloat(data[4]));
                animalList.add(animal);
            }

        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania listy zwierząt z pliku CSV.");
            e.printStackTrace();
        }
    }

    private void loadEmployeeListFromCSV(String filename) {
        String filePath = "src/main/resources/" + filename;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                // TODO: Implementacja wczytywania pracowników
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania listy pracowników z pliku CSV.");
            e.printStackTrace();
        }
    }

    private void loadAdoptionListFromCSV(String filename) {
        String filePath = "src/main/resources/" + filename;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                // TODO: Implementacja wczytywania adopcji
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania listy adopcji z pliku CSV.");
            e.printStackTrace();
        }
    }

    private void loadUserListFromCSV(String filename) {
        String filePath = "src/main/resources/" + filename;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                User user = new User(data[0], data[1], data[2]);
                userList.add(user);
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania listy użytkowników z pliku CSV.");
            e.printStackTrace();
        }
    }

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
    public User getUserListElem(int i){
        try {
            if(i<userList.size()){
                return userList.get(i);
            }else{
                throw  new IndexOutOfBoundsException();
            }

        }catch (IndexOutOfBoundsException e){
            System.out.println("Nie ma takiego elementu!!!");
        }
        return null;
    }
    public void addUserToList(User user){
        userList.add(user);
    }

    // Zapis zwierząt do pliku csv
    public void saveAnimalListToCSV(String filename) {
        String filePath = "src" + File.separator + "main" + File.separator + "resources" + File.separator + filename;
        try (FileWriter writer = new FileWriter(filePath)) {
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
            //System.out.println("Lista zwierząt została zapisana do pliku: " + filename);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku CSV.");
            e.printStackTrace();
        }
    }



    // zapisz
    public void saveEmployeeListToCSV(String filename) {
        String filePath = "src/main/resources/" + filename;
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("dane + TODO!!!!!!!!!!!!!!!!!!!!!\n"); // Nagłówki kolumn
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
        String filePath = "src/main/resources/" + filename;
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("dane + TODO!!!!!!!!!!!!!!!!!!!!!\n"); // Nagłówki kolumn
            for (Adoption adoption : adoptionList) {
                // to do
                continue;
            }
            System.out.println("Lista adopcji została zapisana do pliku: " + filename);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku CSV.");
            e.printStackTrace();
        }
    }

    public void saveUserListToCSV(String filename) {
        String filePath = "src/main/resources/" + filename;
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("dane + TODO!!!!!!!!!!!!!!!!!!!!!\n"); // Nagłówki kolumn
            for (User user : userList) {
                continue;
            }
            System.out.println("Lista zwierząt została zapisana do pliku: " + filename);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku CSV.");
            e.printStackTrace();
        }
    }

    // Metoda do generowania ID w nowej klasie ??

    // test
    public static void main(String[] args) {
        Shelter shelter= new Shelter();
        Animal animal = new Animal("Pies","Mieszaniec",4, 18.5F);
        User user = new User("Imię","Adress", "email");
        shelter.addAnimalToList(animal);
        shelter.saveAnimalListToCSV("ListaZwierzat");
        //shelter.saveAdoptionListToCSV("ListaWnioskow");
        //shelter.saveEmployeeListToCSV("ListaPracownikow");
       //shelter.saveUserListToCSV("ListaUzytkownikow");
    }

}

