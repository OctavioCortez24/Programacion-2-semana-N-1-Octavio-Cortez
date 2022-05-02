package programacion2;

import java.util.Scanner;

public class vista {

    public static void mostrarPersona(persona a) {
        String retorno=a.getNombre() + " " + a.getApellido();
        System.out.println(retorno);
    }

    public static persona entregarPersona() {

        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = Leer.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = Leer.nextLine();
        persona persona1 = new persona();

        persona1.setNombre(nombre);
        persona1.setApellido(apellido);

        return persona1;
    }
}
