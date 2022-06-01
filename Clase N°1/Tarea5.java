
import java.util.Scanner;
public class Tarea5 {
    public static void main(String[] args) {
        System.out.println("Programa N°5");
        Scanner LeerNumer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int numero1=LeerNumer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2=LeerNumer.nextInt();
        System.out.println("Ingrese el numero del cual desea quitar los multiplos:");
        int numero3=LeerNumer.nextInt();
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
            if(menor%numero3!=0){
                System.out.println("resultado = " + menor);
            }
           
            menor = menor + 1;
            
            
        } while (menor <= mayor);
        
  }
}