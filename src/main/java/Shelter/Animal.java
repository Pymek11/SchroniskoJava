package Shelter;

import java.util.Random;

public class Animal {
    private boolean hasid;
    private int id;
    private String species;
    private String breed;
    private int age;
    private float weight;
    private String description;
    private String picture; //  ścieżka do obrazu lub URL
    // to do Zdjęcie;

    // Konstruktor nie ostawia opisu i zdjęcia
    public Animal(boolean hasid_,int id,String species, String breed, int age, float weight) {
        if(!hasid_){
            this.id = generateID();
            this.hasid=true;
        }else{
            this.hasid=hasid_;
            this.id=id;
        }
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.description = "";
        this.picture= "";
    }

    public boolean getHasId(){
        return hasid;
    }
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
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
    private int generateID() {
        Random random = new Random();
        //this.hasid=true;
        return 100000 + random.nextInt(900000); // Losowe ID z przedziału 100000 - 999999
    }

}