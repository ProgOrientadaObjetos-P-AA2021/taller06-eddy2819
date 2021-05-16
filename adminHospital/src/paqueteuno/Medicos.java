package paqueteuno;

public class Medicos {

    private String nomdoc;
    private String especialidad;
    private double sueldom;

    public Medicos(String no,  double s,String e) {
        nomdoc = no;
        especialidad = e;
        sueldom = s;
    }

    public void establecerNombreDoctor(String m) {
        nomdoc = m;
    }

    public void establecerEspecialidad(String m) {
        especialidad = m;
    }

    public void establecerSueldoMensual(double m) {
        sueldom = m;
    }

    public String obtenerNombreDoctor() {
        return nomdoc;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldoMensual() {
        return sueldom;
    }

}
