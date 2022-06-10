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
        Scanner LeerNumer=new Scanner(System.in);
        if (contacBook.get(0)!=null){
            for (int i = 0; i < contacBook.size(); i++) {
                Contact con =contacBook.get(i);
                System.out.println(i + "° " + con);
            }
            System.out.println("Do you want to delete a contact?");
            System.out.println("[1]--> Yes");
            System.out.println("[2]--> No");
            int delOrNotDel= LeerNumer.nextInt();
            if (delOrNotDel==1){
                System.out.println("Select the contact you want to delete:");
                int eleccionUser= LeerNumer.nextInt();
                contacBook.remove(eleccionUser);

            }
        }else{
            System.out.println("There is no contact");
        }


    }

    public boolean isTheContact(Contact c) {
        int cont=0;
        for(int i=0;i< contacBook.size();i++){
            if(contacBook.get(i).equals(c)){
                cont++;
            }
        }
        if (cont!=0){
            return true;
        }else{
            return false;
        }


    }

    @Override
    public String toString() {
        String names="";
        for(int i=0;i< contacBook.size();i++){
            names=names+"|"+contacBook.get(i);
        }
        return names;
    }



}
