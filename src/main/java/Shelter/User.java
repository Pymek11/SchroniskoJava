package Shelter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
    private boolean hasid;
    private String name;
    private String address;
    private String email;
    private int id;
    private List<Integer> adoptionIdList= new ArrayList<>();

    public User(boolean hasid_,int id, String name, String address, String email) {
        if(!hasid_){
            this.id = generateID();
            this.hasid=true;
        }else{
            this.hasid=hasid_;
            this.id=id;
        }
        this.name = name;
        this.address = address;
        this.email = email;
    }
    public boolean isHasid() {
        return hasid;
    }
    public void setHasid(boolean hasid) {
        this.hasid = hasid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void ViewAnimals(){
        //todo
    }
    public void AdoptAnimals(){
        //todo
    }
    private int generateID() {
        Random random = new Random();
        return random.nextInt(10000); // Losowe ID z przedziału 100000 - 999999
    }
    private void addAdoptionId(int AdoptionId){
        adoptionIdList.add(AdoptionId);
    }
    public List<Integer> getAdoptionIdList() {
        return adoptionIdList;
    }
    public boolean getHasId(){
        return hasid;
    }



}
