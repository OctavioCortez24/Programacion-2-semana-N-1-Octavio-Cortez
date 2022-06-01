package Clase2Semana1;

public class Grado extends Escuela {
    private String nom;
    private int cantAlum;
    public Grado(){
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
 
    public int getCantAlum() {
        return cantAlum;
    }

    public void setCantAlum(int cantAlum) {
        this.cantAlum = cantAlum;
    }

    @Override
    public String toString() {
        return "Nombre: "+nom+
                "\nCantidad de alumnos: "+cantAlum;
    }

    @Override
    public boolean equals(Object obj) {
       return obj.equals(toString());
    }
    
    
}
