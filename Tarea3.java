
import java.util.Scanner;

public class Tarea3 {

    public static void main(String args[]) {
        System.out.println("Programa para sumar numeros");
        Scanner LeerNumer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int numero1 = LeerNumer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = LeerNumer.nextInt();
        int mayor;
        int menor;

        if (numero1 < numero2) {
            mayor = numero2;
            menor = numero1;
        } else {
            mayor = numero1;
            menor = numero2;
        }
        
        do {
            System.out.println("resultado = " + menor);
           
            menor = menor + 1;
            
            
        } while (menor <= mayor);
    }
}