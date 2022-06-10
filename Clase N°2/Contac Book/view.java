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
}
