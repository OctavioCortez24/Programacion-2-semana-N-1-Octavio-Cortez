package Clase2;

import java.util.Scanner;

public class ClaseN2Programa2 {

    public static void main(String args[]) {
        Scanner Leer = new Scanner(System.in);
        Scanner LeerNumer = new Scanner(System.in);
        String user[] = new String[4];
        int pass[] = new int[4];
        user[0] = "Daiana";
        pass[0] = 1234;
        user[1] = "Facundo";
        pass[1] = 4321;
        user[2] = "Osvaldo";
        pass[2] = 1122;
        user[3] = "Malina";
        pass[3] = 3344;
        int i;

        int decicion = 0;
        int eleccion = 0;
        int cont = 0;
        do {

            cont = 0;
            do {
                System.out.println("-------------------");
                System.out.println("Ingrese su opción:");
                System.out.println("[0]-->Salir");
                System.out.println("[1]-->Iniciar Sesión");
                decicion = LeerNumer.nextInt();
                if (decicion < 0 && decicion < 2) {
                    System.out.println("Numero equivocado");
                }

            } while (decicion > 0 && decicion < 1);

            if (decicion == 1) {
                i = 0;
                System.out.println("----------------------");
                System.out.println("Ingrese su Usuario: ");
                String nombre = Leer.nextLine();
                System.out.println("Ingrese su contrasea:");
                int contrasena = LeerNumer.nextInt();

                for (i = 0; i < user.length; i++) {
                    if (user[i].equals(nombre)) {
                        if (user[i].equals(nombre) && contrasena == pass[i]) {
                           
                            System.out.println("Usuario y Contraseña correctos");
                            System.out.println("Sr/a " + user[i]);

                            do {
                                System.out.println("¿Desea cambiar de contraseña?");
                                System.out.println("[1]-->Si");
                                System.out.println("[2]-->No");
                                eleccion = LeerNumer.nextInt();
                                if (eleccion == 1) {
                                    System.out.println("Ingrese la nueva contraseña: ");
                                    int newContra = LeerNumer.nextInt();
                                    pass[i] = newContra;
                                }
                                if (eleccion != 1 && eleccion != 2) {
                                    System.out.println("Numero equivocado");
                                }
                            } while (eleccion != 1 && eleccion != 2);
                            //Aca va el otro codigo
                        } else if (user[i].equals(nombre) && contrasena != pass[i] && cont != 1) {
                            System.out.println("Contraseña incorrecta");
                        }
                    } else {
                        cont = cont + 1;
                    }
                }

                if (cont == 4) {
                    System.out.println("Usuario Incorrecto");
                }
            }
        } while (decicion != 0);

    }

}
