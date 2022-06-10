package ClaseN2SemanaN3;


import java.util.*;

public class Controller {

    public static void main(String[] args) {
        ArrayList<ContactBook>memoria = new ArrayList<>();




        Scanner LeerNumer=new Scanner(System.in);
        int decicion=0;

        do{
            System.out.println("Program to create contactBook");
            System.out.println("[1]-->Create a new ContactBook");
            System.out.println("[2]-->Add contact to contactBook");
            System.out.println("[9]-->Exit");
            decicion=LeerNumer.nextInt();
            if (decicion==1){
               ContactBook contactBookObj=view.createAContactBook();

                memoria.add(contactBookObj);
            } else if (decicion==2) {
                if (memoria==null||memoria.size()==0){
                    System.out.println("There is no contactBook");
                }else{
                    System.out.println("Choose the contact book");
                    for (int i=0;i<memoria.size();i++){
                        System.out.println(i+" "+memoria.get(i));
                    }
                    int seleccion=LeerNumer.nextInt();
                    ContactBook contactBookSelecion=memoria.get(seleccion);
                    view.menu2(contactBookSelecion);
                }
            }

        }while (decicion!=9);

    }
}
