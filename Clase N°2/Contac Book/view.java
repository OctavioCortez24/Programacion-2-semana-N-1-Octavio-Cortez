package ClaseN2SemanaN3;

import java.util.Scanner;

public class view {

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
        System.out.println(cB);
        Scanner LeerNumer=new Scanner(System.in);
        Scanner Leer=new Scanner(System.in);
            System.out.println("Select the contact you want to delete:");
            System.out.print("Enter the name of contact:");
            String nameCont=Leer.nextLine();
            System.out.print("Enter the email of contact:");
            String emailCont=Leer.nextLine();
            System.out.print("Enter the phone number of contact:");
            String numerCont=Leer.nextLine();
            System.out.print("Enter the topList of contact:");
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
