package paqueteuno;

public class enfermero {

    private String nombre;
    private String tipo;
    private double sueldo;

    public enfermero(String nom, double su ,String ti) {
        nombre = nom;
        tipo = ti;
        sueldo = su;
    }

    public void establecerNombreEnfermero(String e) {
        nombre = e;
    }

    public void establecerTipo(String e) {
        tipo = e;
    }

    public void establecerSueldoMens(double e) {
        sueldo = e;
    }

    public String obtenerNombreEnfermero() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldoMens() {
        return sueldo;
    }

}
