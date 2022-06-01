
import java.util.Random;

public class S3P2N2 {

    //Repita los programas anteriores, esta vez con un vector de diez elementos y completado con valores aleatorios. Programa 2
    public static void main(String args[]) {
        int vector[] = new int[10];
         Random numerAleatorio=new Random();
        int i;
        int numer;
        for (i = 0; i < vector.length; i++) {

            numer=numerAleatorio.nextInt(100-0+1)+0;
            if (numer % 7 != 0) {
                vector[i] = numer;
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("El numero "+numer+" no es valido porque es multiplo de 7");
                System.out.println("-----------------------------------------------");
                i = i - 1;

            }
        }

        for (i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

    }
}
