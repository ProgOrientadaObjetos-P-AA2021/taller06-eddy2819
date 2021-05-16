
package paquetedos;

import paqueteuno.CiudadHospital;
import paqueteuno.Hospital;
import paqueteuno.Medicos;
import paqueteuno.enfermero;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombreHospi;
        String direc;
        String ciu;
        String pro;
        int espe;
        String nom;
        double sueldo;
        String especi;
        int nue;
        String nenf;
        double su;
        String ti;
        Medicos [] obmedic;
        enfermero [] obenfer;
        
        System.out.println("Ingrese el Nombre del Hospital: ");
        nombreHospi = sc.nextLine();
        System.out.println("Ingrese la Direccion del Hospital: ");
        direc = sc.nextLine();
        System.out.println("Ingrese la Ciudad: ");
        ciu = sc.nextLine();
        System.out.println("Ingrese la provincia: ");
        pro = sc.nextLine();
        System.out.println("Ingrese el numero de especialidades");
        espe = sc.nextInt();
        
        CiudadHospital ch = new CiudadHospital(ciu,pro);
        
        obmedic = new Medicos[espe];
         for (int i = 0; i < espe; i++){
             System.out.printf("Ingrese nombre del Medico%d\n",i+1);
             nom = sc.nextLine();
             System.out.printf("Ingrese el sueldo %d\n",i+1);
             sueldo = sc.nextDouble();
             System.out.printf("Ingrese la especialidad %d\n",i+1);
             especi = sc.nextLine();
             Medicos me = new Medicos(nom,sueldo,especi);
             obmedic [i] = me;
             
         }
         
        System.out.println("Ingrese el numero de enfermeros");
        nue =  sc.nextInt();
        obenfer = new enfermero[nue];
        for (int i = 0; i < nue; i++){
            System.out.printf("Ingrese nombre del enfermer@%d\n",i+1);
            nenf = sc.nextLine();
            System.out.printf("Ingrese sueldo%d\n",i+1);
            su = sc.nextDouble();
            System.out.printf("Ingrese tipo de contrato %d\n",i+1);
            ti = sc.nextLine();
            enfermero en = new enfermero(nenf,su,ti);
            obenfer [i] = en;
        }
        Hospital hp = new Hospital( nombreHospi,direc,ch,espe,obmedic,obenfer);
        hp.establecerTotalSueldos();
        System.out.println("++++++++++++++++++++++++++");
        System.out.printf("\n%s\n", hp);
    }
    
}
