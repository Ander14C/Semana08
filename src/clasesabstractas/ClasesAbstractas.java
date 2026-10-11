
package clasesabstractas;

import java.time.LocalDate;
import java.util.Scanner;

public class ClasesAbstractas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sw=1;
        Trabajador t = null;
        TrabajadorController tc = new TrabajadorController();
        String tipo="", tipodoc="", nrodoc="", pat="", mat="", nomb=""; 
        LocalDate fn=LocalDate.parse("1990-01-01");
        
        while(sw==1){ // //Este while es para que cuando ingrese otro dato que no sea OBRERO o EMPLEADO siga preguntando
            System.out.println("¿Quiere ingresar un obrero o un empleado?");
            tipo = sc.nextLine();
        
            if(!tipo.equalsIgnoreCase("obrero")&&!tipo.equalsIgnoreCase("empleado")){
                System.out.println("Error, debe de ingresar obrero o empleado");
                sw=1;
            }
            else{
                sw=2;
            }
        }
        
        System.out.println("El dato ingresado es: "+ tipo);
        sw=1;
        
        if(tipo.equalsIgnoreCase("obrero")){
                t = new Obrero();
        }else{
            t = new Empleado();
        }
        while(t.getTipo_doc()== null){
            System.out.println("¿Ingrese tipo de documento?");
            tipodoc= sc.nextLine();
            t.setTipo_doc(tipodoc);
        }
        System.out.println("El dato ingresado es: "+ tipodoc);
        
        while(t.getNro_doc()== null){
            System.out.println("¿Ingrese numero de documento?");
            nrodoc= sc.nextLine();
            t.setNro_doc(nrodoc);
        }
        System.out.println("El dato ingresado es: "+ nrodoc);
        
        while(t.getNombre()== null){
            System.out.println("¿Ingrese su nombre: ?");
            nomb= sc.nextLine();
            t.setNombre(nomb);
        }
        System.out.println("El nombre ingresado es: "+ nomb);
        
        tc.agregarTrabajador(t);
        tc.ListarTrabajadores();
    }
}
//Cuando te piden que inicialices la variable por ejemplo "tipo" lo dque debes de hacer es poner en donde String tipo solo poner el = ""; y ya esta