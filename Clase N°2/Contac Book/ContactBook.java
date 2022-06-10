package ClaseN2SemanaN3;

import java.util.*;

public class ContactBook extends Contact {

    private String nameCB;
    ArrayList<Contact> contacBook=new ArrayList();

    public ContactBook(){

    }
    public ContactBook(String name) {

        this.nameCB = name;
    }

    public String getName() {
        return nameCB;
    }

    public void setName(String n) {
        this.nameCB = nameCB;
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
        return nameCB;
    }

    public String toString(char barita) {
        String names="";
        for(int i=0;i< contacBook.size();i++){
            names=names+barita+contacBook.get(i).toString('#');
        }
        return names;
    }


}
