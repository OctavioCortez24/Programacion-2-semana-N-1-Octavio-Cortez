
import java.util.Scanner;

public class S3P4 {

    //6. Modifique el programa para que no almacene valores ingresado por el usuario que estén repetidos.
    public static void main(String args[]) {
        int vector[] = new int[5];

        Scanner LeerNumer = new Scanner(System.in);
        int i;
        int numer;

        int k;
        for (i = 0; i < vector.length; i++) {
            
            System.out.print("Ingrese el numero " + i + " :");
            numer = LeerNumer.nextInt();

            k = 0;
            while (k != 4) {
                
                if (vector[k] == numer) {

                    System.out.println("---------------------------------------------------");
                    System.out.println("El numero no es valido porque ya ingreso uno igual");
                    System.out.println("---------------------------------------------------");
                    i = i - 1;
                    
                }
                
                k++;
            }

            if (numer % 7 != 0) {
                vector[i] = numer;

            } else if (numer % 7 == 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("El numero no es valido porque es multiplo de 7");
                System.out.println("-----------------------------------------------");
                i = i - 1;

            }

        }

        S3P4.ordenarMayorMenorP4(vector);

    }

    public static void ordenarMayorMenorP4(int miVect[]) {
        int i ;
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

        System.out.println("-----------------------");
        for (int j = 0; j < miVect.length; j++) {
            System.out.println("          "+miVect[j]+"          ");
        }
        System.out.println("-----------------------");

    }
}
