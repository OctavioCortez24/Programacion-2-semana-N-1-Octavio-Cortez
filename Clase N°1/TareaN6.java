import java.util.Scanner;
public class TareaN6 {
    public static void main(String args[]){
        System.out.println("Programa N°6 'Loggin'");
        int contrasena=4321;
        Scanner Leer=new Scanner(System.in);
        Scanner LeerNumer=new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String usuIngre=Leer.nextLine();
        System.out.print("Ingrese su contraseña: ");
        int contraIngre=LeerNumer.nextInt();
        
        if(usuIngre.equals("Enzo")&contraIngre!=contrasena){
            System.out.println("Contraseña incorrecta");
        }else if(!usuIngre.equals("Enzo")&contraIngre==contrasena){
            System.out.println("Usuario incorrecto");
        }else if(!usuIngre.equals("Enzo")&&contraIngre!=contrasena){
            System.out.println("Usuario y contraseaña incorrectos");
        }else if(usuIngre.equals("Enzo")&contraIngre==contrasena){
            System.out.println("Usuario y contraseña correctos");
        }
        
    }
}
