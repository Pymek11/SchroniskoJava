package Shelter;

public class Animal {
    private int ID;
    private String species;
    private String breed;
    private int age;
    private float weight;
    private String description;
    private String picture; //  ścieżka do obrazu lub URL
    // to do Zdjęcie;

    // Konstruktor nie ostawia opisu i zdjęcia
    public Animal(int ID, String species, String breed, int age, float weight) {
        this.ID = ID;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.description = "";
        this.picture= "";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}