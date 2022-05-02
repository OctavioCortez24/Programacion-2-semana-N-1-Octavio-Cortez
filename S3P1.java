import java.util.Scanner;
public class S3P1 {
    /*1. Dimensionar un vector de cinco elementos.
      2. Completar los elementos del vectore con valores ingresados por el usuario.
      3. Una vez completado el vector, imprimir los valores por pantalla.*/
    public static void main(String args[]){
        int  vector []=new int [5];
        Scanner LeerNumer=new Scanner(System.in);
        int i;
        for( i=0;i<vector.length;i++){
            System.out.print("Ingrese el numero "+i+" :");
            int numer=LeerNumer.nextInt();
            vector[i]=numer;
        }
        System.out.println("--------------------------");
        for(i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
}
