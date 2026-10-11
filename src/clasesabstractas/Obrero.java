
package clasesabstractas;

public class Obrero extends Trabajador{
    private double jornal;

    public double getJornal() {
        return jornal;
    }

    public void setJornal(double jornal) {
        this.jornal = jornal;
    }
    
      public void calcularJornadaMensual(int diastrabajados){ //Este metodo sirve para calcular los dias trabajados
        double rpta = diastrabajados * this.jornal; //
        System.out.println("El jornal mensual es: " + rpta);
    }

    @Override
    public void VerDatos() {
          System.out.println(" OBRERO TIPODOC: "+ this.tipo_doc +
                " NRODOC: "+ this.nro_doc +
                " NOMBRE: "+ this.nombre +
                " PATERNO "+ this.ape_paterno +
                " MATERNO: "+this.ape_materno +
                " FECHA DE NACIMIENTO: "+ this.fec_nac + 
                " JORNAL: "+this.jornal);
    }
    
}
