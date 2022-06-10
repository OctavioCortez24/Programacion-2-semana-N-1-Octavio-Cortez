package ClaseN2SemanaN3;

import java.util.Scanner;

public class view {

    public static void menu(){

    }
    public static ContactBook createAContactBook(){
        Scanner Leer=new Scanner(System.in);
        System.out.println("Enter the name of contactBook");
        String nameContactBook=Leer.nextLine();
        ContactBook libreta=new ContactBook(nameContactBook);
        return libreta;
    }
    public static void menu2(ContactBook contactBookObj){
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


            }else if(decision==3){
                System.out.println(contactBookObj.toString('|'));
            }
        } while (decision != 0);
    }

    public static Contact createContact(){
        boolean topList;
        Scanner Leer = new Scanner(System.in);
        Scanner LeerNumer=new Scanner(System.in);
        System.out.println("Enter your name:");
        String nameCont = Leer.nextLine();
        System.out.println("Enter your Email:");
        String emailCont = Leer.nextLine();
        System.out.println("Enter your movile:");
        String movilCont = Leer.nextLine();
        System.out.println("Top list");
        System.out.println("[1]-->True");
        System.out.println("[2]-->False");
        int decicion=LeerNumer.nextInt();
        if(decicion==1){
           topList=true;
        }else{
            topList=false;
        }
        Contact c=new Contact(nameCont,emailCont,movilCont,topList);
        return c;

    }
    public static Contact deleteContact(ContactBook cB) {
        boolean topListDelCont;
        System.out.println(cB.toString('|'));
        Scanner LeerNumer=new Scanner(System.in);
        Scanner Leer=new Scanner(System.in);
            System.out.println("Select the contact you want to delete:");
            System.out.print("Enter the name of contact:");
            String nameCont=Leer.nextLine();
            System.out.print("Enter the email of contact:");
            String emailCont=Leer.nextLine();
            System.out.print("Enter the phone number of contact:");
            String numerCont=Leer.nextLine();
            System.out.println("Enter the topList of contact:");
            System.out.println("[1]-->True");
            System.out.println("[2]-->False");
            int decicion=LeerNumer.nextInt();
            if (decicion==1){
                topListDelCont=true;
            }else {
                topListDelCont=false;
            }
           Contact c=new Contact(nameCont,emailCont,numerCont,topListDelCont);


        return c;

    }
}
