package Clase2Semana1;

public class Escuela {

    private String nombre;
    private String nivel;

    public Escuela() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nNivel: " + nivel;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(toString());
        
    }

}
