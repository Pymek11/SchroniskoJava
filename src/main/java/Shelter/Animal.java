package Shelter;

public class Animal {
    private int ID;
    private String species;
    private String breed;
    private int age;
    private int weight;
    private String description;
    private ImageView imageView;

    public Animal(int ID, String species, String breed, int age, int weight, String description) {
        this.ID = ID;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.description = description;
    }
    public int getID() {
        return ID;
    }
    public String getSpecies() {
        return species;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public String getDescription() {
        return description;
    }

}
