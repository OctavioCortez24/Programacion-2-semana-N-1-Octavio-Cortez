package ClaseN2SemanaN3;

import java.util.Scanner;

public class ProgramaMultiplicacion {
    public static void main(String[] args) {
        Scanner LeerNumer=new Scanner(System.in);
        System.out.println("Ingresa el numero para saber su tabla:");
        int multiplo=LeerNumer.nextInt();
        System.out.println("Ingresa el modulo:");
        int modulo=LeerNumer.nextInt();

        for(int i=0;i<80;i++){
            int resultadoMilti=i*multiplo;
            System.out.println(i+" X "+multiplo+" = "+resultadoMilti+" Resto del numero divivido por "+modulo+" : "+resultadoMilti%modulo);
        }

    }
}
