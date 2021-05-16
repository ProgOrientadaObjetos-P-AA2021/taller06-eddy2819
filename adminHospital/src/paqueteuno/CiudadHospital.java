
package paqueteuno;

public class CiudadHospital {
   private String nombre;
   private String provincia;
   
   public CiudadHospital(String n, String p){
       nombre = n;
       provincia = p;
   }
   public void establecerNombreCiudad(String s){
       nombre = s;
   }
   public void establecerProvincia_Ciudad(String s){
       provincia = s;
   }
   
   public String obtenerNombreCiudad(){
       return nombre;
   }
   public String obtenerProvincia_Ciudad(){
       return provincia;
   }
   
   
}
