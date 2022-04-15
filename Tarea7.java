
import java.util.Scanner;

public class Tarea7 {

    public static void main(String args[]) {
        System.out.println("Programa N°6 'Loggin'");
        int contrasena = 4321;
        int decicion=0;
        Scanner Leer = new Scanner(System.in);
        Scanner LeerNumer = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("-------------------------");
            System.out.println("Ingrese su opción");
            System.out.println("[0]Salir");
            System.out.println("[1]Ver Programa");
            opcion=LeerNumer.nextInt();
            System.out.println("-------------------------");
            if (opcion==1) {
                System.out.print("Ingrese su nombre de usuario: ");
        String usuIngre = Leer.nextLine();
        System.out.print("Ingrese su contraseña: ");
        int contraIngre = LeerNumer.nextInt();

        if (usuIngre.equals("Enzo") & contraIngre != contrasena) {
            System.out.println("---->Contraseña incorrecta<----");
        } else if (!usuIngre.equals("Enzo") & contraIngre == contrasena) {
            System.out.println("---->Usuario incorrecto<----");
        } else if (!usuIngre.equals("Enzo") && contraIngre != contrasena) {
            System.out.println("---->Usuario y contraseaña incorrectos<----");
        } else if (usuIngre.equals("Enzo") & contraIngre == contrasena) {
            System.out.println("---->Usuario y contraseña correctos<----");
            boolean bandera=true;
            do{
                bandera=true;
                System.out.println("Desea modificar la contraseña:");
                System.out.println("[1] --> SI");
                System.out.println("[2] --> No");
                decicion = LeerNumer.nextInt();
                if(decicion<1|decicion>2){
                    System.out.println("-----------------------------");
                    System.out.println("----> Numero equivocado <----");
                    System.out.println("-----------------------------");
                    bandera=false;
                }
                
            } while(bandera==false);
            
            if (decicion == 1) {
                System.out.print("Ingrese la nueva contraseña:");
                int nuevaContra = LeerNumer.nextInt();
                contrasena = nuevaContra;
                System.out.println("Se ha cambiado la contraseña");
            } else if (decicion == 2) {
                System.out.println("Fin del programa");
            }
        }
            }
        }while(opcion!=0);

    }
}
