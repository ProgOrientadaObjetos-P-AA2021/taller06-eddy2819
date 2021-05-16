
package paqueteuno;

public class Hospital {
    private String nHospital;
    private int nEspecialidad;
    private double tpagar;
    private String direccion;
    private Medicos[] medico;
    private enfermero[] enfer;
    private CiudadHospital ciu;
    
    public Hospital(String hos,String di, CiudadHospital c, int es, Medicos[] m, enfermero[] e){
        nHospital = hos;
        nEspecialidad = es;
        direccion = di;
        medico = m;
        enfer = e;
        ciu = c;
    }
    
    public void establecerNombreHospital(String n){
        nHospital = n;
    }
    public void establecerNumeroEspecialidad(int n){
        nEspecialidad = n;
    }
    public void establecerTotalSueldos(){
        double total = 0;
        double total2= 0;
        for (int i = 0; i <obtenerEnfermeroSueldo().length; i++){
            total = total + obtenerEnfermeroSueldo()[i].obtenerSueldoMens();
        }
        for (int j = 0; j < obtenerMedicoSueldo().length; j++){
            total2 = total2 +obtenerMedicoSueldo()[j].obtenerSueldoMensual();
        }
        tpagar = total + total2;
        
    }
    public void establecerDireccionHospital(String n){
        direccion = n;
    }
    public void establecerMedicoSueldo(Medicos[] n){
        medico = n;
    }
    public void establecerEnfermeroSueldo(enfermero[] n){
        
        enfer = n;
    }
    public void establecerCiudad(CiudadHospital n){
        ciu = n;
    }
    
    public String obtenerNombreHospital(){
        return nHospital;
    }
    public int obtenerNumeroEspecialidad(){
        return nEspecialidad;
    }
    public double obtenerTotalSueldos(){
        return tpagar;
    }
    public String obtenerDireccionHospital(){
        return direccion;
    }
    public Medicos[] obtenerMedicoSueldo(){
        return medico;
    }
    public enfermero[] obtenerEnfermeroSueldo(){
        return enfer;
    }
    public CiudadHospital obtenerCiudad(){
        return ciu;
    }
    @Override
    public String toString(){
       String cadena = "Entidad Hospitalaria\n";
       cadena = String.format("%sHospital: %s\n"
               + "Direccion:%s\n"
               + "Ciudad: %s\n"
               + "provincia:%s\n"
               + "Numero de Especialidades%d\n"
               + "Listado de Medicos\n"
               + "Listado de enfermero@"
               ,cadena,
               obtenerNombreHospital(),obtenerDireccionHospital(),
               obtenerCiudad().obtenerNombreCiudad(),
               obtenerCiudad().obtenerProvincia_Ciudad(),
               obtenerNumeroEspecialidad());
        for (int i = 0; i < obtenerMedicoSueldo().length; i++){
            
            cadena = String.format("\"-%s\t\t%s -" +"Sueldo: [%.3f]" 
                    + " - %s\n",cadena,
                    obtenerMedicoSueldo()[i].obtenerNombreDoctor(),
                    obtenerMedicoSueldo()[i].obtenerSueldoMensual(),
                    obtenerMedicoSueldo()[i].obtenerEspecialidad());
        }
      
        for (int i = 0; i < obtenerEnfermeroSueldo().length; i++){
            cadena = String.format(""
                    +"\"-%s\t\t%s -" +"Sueldo: [%.3f]" 
                    + " - %s\n",cadena,
                    obtenerEnfermeroSueldo()[i].obtenerNombreEnfermero(),
                    obtenerEnfermeroSueldo()[i].obtenerSueldoMens(),
                    obtenerEnfermeroSueldo()[i].obtenerTipo());
            
        }
        cadena =String.format("%sTotal de sueldo a pagar por Mes: %.3f\n",
                cadena,obtenerTotalSueldos());
       return cadena;
       
   }
    
    
    
    

}
