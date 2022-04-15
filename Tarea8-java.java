import java.util.Scanner;

public class Tarea8 {

    public static void main(String args[]) {
        System.out.println("Programa N°8 'Contar Vocales'");
        System.out.println("Ingrese la frase o palabra:");
        Scanner Leer = new Scanner(System.in);
        String palabra = Leer.nextLine();
        int contador=0;
        

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'A'|palabra.charAt(i) == 'E'|palabra.charAt(i) == 'I'|palabra.charAt(i) == 'O'|palabra.charAt(i) == 'U'|palabra.charAt(i) == 'a'|palabra.charAt(i) == 'e'|palabra.charAt(i) == 'i'|palabra.charAt(i) == 'o'|palabra.charAt(i) == 'u') {
                contador=contador+1;
            }
        }
        System.out.println("La cantidad de vocales es: "+contador);
    }
}