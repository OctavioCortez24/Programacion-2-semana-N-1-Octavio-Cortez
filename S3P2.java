import java.util.Scanner;
public class S3P2 {
    //4. Modifique el programa para que no almacene múltiplos de siete.
    public static void main(String args[]){
        int vector[]=new int[5];
        Scanner LeerNumer=new Scanner(System.in);
        int i;
        int numer;
        for(i=0;i<vector.length;i++){
            System.out.print("Ingrese el numero "+i+" :");
                numer=LeerNumer.nextInt();
            if(numer%7!=0){
                vector[i]=numer;
            }else{
                System.out.println("-----------------------------------------------");
                System.out.println("El numero no es valido porque es multiplo de 7");
                System.out.println("-----------------------------------------------");
                i=i-1;
                
            }
        }
        
        for(i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
        
    }
}
