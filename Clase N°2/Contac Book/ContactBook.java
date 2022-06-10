package ClaseN2SemanaN3;

import java.util.*;

public class ContactBook extends Contact {

    private String name;
    ArrayList<Contact> contacBook=new ArrayList();
    public ContactBook() {
        super(null, null, null, false);
    }
    


    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = name;
    }

    public void addContact(Contact c) {

        contacBook.add(c);
    }

    public void delContact(Contact c) {
        for(int i=0;i<contacBook.size();i++){
            if (contacBook.get(i).equals(c)==true){

                contacBook.remove(i);
            }
        }

    }

    public boolean isTheContact(Contact c) {
        return false;
    }

    @Override
    public String toString() {
        String names="";
        for(int i=0;i< contacBook.size();i++){
            names=names+" "+contacBook.get(i).toString('#');
        }
        return names;
    }

    public String toString(char barita) {
        String names="";
        for(int i=0;i< contacBook.size();i++){
            names=names+barita+contacBook.get(i).toString('#');
        }
        return names;
    }


}
