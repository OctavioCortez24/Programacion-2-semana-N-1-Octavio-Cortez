
import java.util.Scanner;

public class S3P3 {

    //5. Modifique el programa anterior de manera que imprima el vector, ordenado de menor a mayor.
    

    public static void main(String args[]) {
        int vector[] = new int[5];

        Scanner LeerNumer = new Scanner(System.in);
        int i;
        int numer;
        for (i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el numero " + i + " :");
            numer = LeerNumer.nextInt();
            if (numer % 7 != 0) {
                vector[i] = numer;
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("El numero "+numer+" no es valido porque es multiplo de 7");
                System.out.println("-----------------------------------------------");
                i = i - 1;

            }
        }

        S3P3.ordenarMayorMenor(vector);

    }

    public static void ordenarMayorMenor(int miVect[]) {
        int i = 0;
        boolean bandera;
        
        do {
            bandera = false;
            for (i = 0; i <= 3; i++) {

                if (miVect[i] < miVect[i + 1]) {
                    
                    int auxiliar = miVect[i];
                    miVect[i] = miVect[i + 1];
                    miVect[i + 1] = auxiliar;
                    bandera = true;
                    
                }
            }
        } while (bandera);
        
        System.out.println("------------------------");
        for (int j = 0; j < miVect.length; j++) {
            System.out.println("          "+miVect[j]+"          ");
        }
        System.out.println("-----------------------");

    }
}
