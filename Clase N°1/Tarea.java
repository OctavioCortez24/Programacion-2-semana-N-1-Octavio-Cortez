import java.util.Scanner;
public class Tarea {
    public static void main(String args[]){
        System.out.println("Programa para sumar numeros");
        Scanner LeerNumer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int numero1=LeerNumer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2=LeerNumer.nextInt();
        int numero3=numero1+numero2;
        System.out.println("La suma de los numeros es: "+numero3);
    }
}
