package Clase2;
import java.util.Scanner;
public class ClaseN2Programa {
    public static void main(String args []){
        String vector[]=new String[4];
        Scanner Leer=new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Inngrese la frase celebre N°"+i+": ");
            vector[i]=Leer.nextLine();
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
}
