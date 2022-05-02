import java.util.Random;
public class S3P1N2 {
    //Repita los programas anteriores, esta vez con un vector de diez elementos y completado con valores aleatorios. Programa 1
    public static void main(String args[]){
        int  vector []=new int [10];
        Random numerAleatorio=new Random();
        int i;
        for( i=0;i<vector.length;i++){
            ;
            int numer=numerAleatorio.nextInt(100-0+1)+0;
            vector[i]=numer;
        }
        System.out.println("--------------------------");
        for(i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
}

