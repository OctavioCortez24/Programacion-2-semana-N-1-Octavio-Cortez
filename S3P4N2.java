
import java.util.Random;


public class S3P4N2 {

    //Repita los programas anteriores, esta vez con un vector de diez elementos y completado con valores aleatorios. Programa 4
    public static void main(String args[]) {
        int vector[] = new int[10];

        
        int i;
        int numer;
        Random numerAleatorio = new Random();
        int k;
        for (i = 0; i < vector.length; i++) {
            
            
            numer = numerAleatorio.nextInt(100 - 0 + 1) + 0;

            k = 0;
            while (k != 9) {

                if (vector[k] == numer&i>=0&i>=9) {

                    System.out.println("---------------------------------------------------");
                    System.out.println("El numero "+numer+" no es valido porque ya ingreso uno igual");
                    System.out.println("---------------------------------------------------");
                    i = i - 1;
                    
                }

                k++;
            }

            if (numer % 7 != 0) {
                vector[i] = numer;

            } else if (numer % 7 == 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("El numero "+numer+" no es valido porque es multiplo de 7");
                System.out.println("-----------------------------------------------");
                i = i - 1;

            }

        }

        S3P4N2.ordenarMayorMenorP4N2(vector);

    }

    public static void ordenarMayorMenorP4N2(int miVect[]) {
        int i;
        boolean bandera;

        do {
            bandera = false;
            for (i = 0; i <= 8; i++) {

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
            System.out.println("          " + miVect[j] + "          ");
        }
        System.out.println("-----------------------");

    }
}
