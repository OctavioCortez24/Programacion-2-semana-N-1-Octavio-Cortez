
import java.util.Scanner;

public class Tarea2 {

    public static void main(String args[]) {
        System.out.println("Programa para sumar numeros");
        Scanner LeerNumer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int numero1 = LeerNumer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = LeerNumer.nextInt();
        
        
            
            
        
      
        if (numero1 < numero2) {
            do {
                System.out.println("numero = " + numero1);

                numero1 = numero1 + 1;

            } while (numero1 <= numero2);
            
            
        } else {
            do {
                System.out.println("numero = " + numero1);

                numero1 = numero1 - 1;

            } while (numero2 <= numero1);
        }

    }
}
