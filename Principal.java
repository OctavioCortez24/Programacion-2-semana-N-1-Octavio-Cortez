package Clase2Semana1;

public class Principal {

    public static void main(String[] args) {
        Grado grado1 = new Grado();
        grado1.setCantAlum(19);
        grado1.setNom("Primero");
        Escuela esc1 = (Escuela) grado1;

        Grado grado2 = new Grado();
        grado2.setCantAlum(10);
        grado2.setNom("Segundo");

        Grado grado3 = new Grado();
        grado3.setCantAlum(19);
        grado3.setNom("Primero");
        
        System.out.println("grado1");
        System.out.println(grado1);
        System.out.println("-------------");
        System.out.println("grado2");
        System.out.println(grado2);
        System.out.println("-------------");
        System.out.println("grado3");
        System.out.println(grado3);
        System.out.println("-------------");
        System.out.println("grado1=grado2 " + grado1.equals(grado2));
        System.out.println("-------------");
        System.out.println("grado1=grado3 " + grado1.equals(grado3));

    }
}
