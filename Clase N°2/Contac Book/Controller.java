package ClaseN2SemanaN3;


import java.util.*;

public class Controller {

    public static void main(String[] args) {
        Contact contacto = new Contact("","","",false);
        ContactBook contactBookObj = new ContactBook();
        Scanner LeerNumer = new Scanner(System.in);


        int decision = 0;
        System.out.println("Program to create a list of contact");
        do {
            System.out.println("[0]-->Exit");
            System.out.println("[1]-->Create a new contact");
            System.out.println("[2]-->Delete contact");
            System.out.println("[3]-->Show contact book");

            decision = LeerNumer.nextInt();
            if (decision == 1) {
                Contact contact=view.createContact();
                contactBookObj.addContact(contact);

            } else if (decision == 2) {
                System.out.println("Do you want to delete a contact?");
                System.out.println("[1]--> Yes");
                System.out.println("[2]--> No");
                int delOrNotDel= LeerNumer.nextInt();
                if (delOrNotDel==1) {
                    Contact c=view.deleteContact(contactBookObj);
                    contactBookObj.delContact(c);
                }

                contactBookObj.delContact(contacto);
            }else if(decision==3){

                System.out.println(contactBookObj.toString('|'));
            }else if(decision==4){
                System.out.println(contactBookObj.isTheContact(contacto));
            }
        } while (decision != 0);
    }
}
