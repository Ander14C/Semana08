
package clasesabstractas;

import java.util.ArrayList;

public class TrabajadorController {
    ArrayList<Trabajador> lista = new ArrayList();
    
    public void agregarTrabajador(Trabajador ntrabajador){
        lista.add(ntrabajador);
    }
    
    public void ListarTrabajadores(){
        System.out.println("La lista de trabajadores es: ");
        for (int i=0; i<lista.size(); i++){
            Trabajador t = lista.get(i);
            t.VerDatos();
        }
    }
}
