
import java.util.Random;


public class S3P3N2 {

    //Repita los programas anteriores, esta vez con un vector de diez elementos y completado con valores aleatorios. Programa 3
    public static void main(String args[]) {
        int vector[] = new int[10];

        Random numerAleatorio = new Random();
        int i;
        int numer;

        for (i = 0; i < vector.length; i++) {

            numer = numerAleatorio.nextInt(100 - 0 + 1) + 0;
            if (numer % 7 != 0) {
                vector[i] = numer;
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("El numero no "+numer+" es valido porque es multiplo de 7");
                System.out.println("-----------------------------------------------");
                i = i - 1;

            }
        }

        S3P3N2.ordenarMayorMenorS3P3N2(vector);

    }

    public static void ordenarMayorMenorS3P3N2(int miVect[]) {
        int i = 0;
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

        System.out.println("------------------------");
        for (int j = 0; j < miVect.length; j++) {
            System.out.println("          "+miVect[j]+"          ");
        }
        System.out.println("-----------------------");

    }
}
