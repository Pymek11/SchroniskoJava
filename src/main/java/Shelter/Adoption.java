package Shelter;

import java.util.Random;

public class Adoption {
    boolean hasid;
    private int id;
    private int idofSubbmiter;
    private int idofAnimal;

    public Adoption(boolean hasid,int id_, int idofSubbmiter_, int idofAnimal_){
        if(hasid){
            this.id=id_;
        }else {
            id=generateID();

        }
        this.idofSubbmiter=idofSubbmiter_;
        this.idofAnimal=idofAnimal_;


    }
    private int generateID() {
        Random random = new Random();
        this.hasid=true;
        return 100000 + random.nextInt(900000); // Losowe ID z przedziału 100000 - 999999
    }
    public boolean gethasId(){
        return hasid;
    }
    public int getId(){
        return id;
    }

    public int getIdofAnimal() {
        return idofAnimal;
    }
    public void setIdofAnimal(int idofAnimal_){
        idofAnimal=idofAnimal_;
    }
    public int getIdofSubbmiter(){
        return idofSubbmiter;
    }
    public void setIdofSubbmiter(int idofSubbmiter_){
        idofSubbmiter=idofSubbmiter_;
    }
}
