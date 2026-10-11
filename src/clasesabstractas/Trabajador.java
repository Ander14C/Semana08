
package clasesabstractas;

import java.time.LocalDate;

public abstract class Trabajador { //Siempre que dentro de una clase haiga un metodo abstracto la clase tambien debe de ser abstracta
    protected String tipo_doc;
    protected String nro_doc;
    protected String nombre;
    protected String ape_paterno;
    protected String ape_materno;
    protected LocalDate fec_nac;

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        if(tipo_doc.equalsIgnoreCase("DNI") || tipo_doc.equalsIgnoreCase("C. E")){
        this.tipo_doc = tipo_doc;
        }
        else{     
            System.out.println("El tipo de documento debe de ser DNI o Carnet de Extranjeria");
        }
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        if(nro_doc != null && nro_doc.matches("-?\\d+")){//este if verifica si el usuario a puesto numeros por eso lo del matches y "-?\\d+"        
        if(this.tipo_doc.equalsIgnoreCase("dni")){
            if(nro_doc.length()==8){
                this.nro_doc = nro_doc;
            }
            else{
                System.out.println("Error debe de ingresar 8 numeros");
            }
        }else if(this.tipo_doc.equalsIgnoreCase("C. E"))
            if(nro_doc.length() == 10){            
                this.nro_doc = nro_doc;
            }else{
                System.out.println("El numero de C. E debe de tener 10 digitos");
            }
        }
        else{
            System.out.println("Ingrese solo numeros");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length()>=3){
        this.nombre = nombre;
        }else{
            System.out.println("Error, el nombre debe de ser minimo 3 caracteres");
        }
    }

    public String getApe_paterno() {
        return ape_paterno;
    }

    public void setApe_paterno(String ape_paterno) {
        this.ape_paterno = ape_paterno;
    }

    public String getApe_materno() {
        return ape_materno;
    }

    public void setApe_materno(String ape_materno) {
        this.ape_materno = ape_materno;
    }

    public LocalDate getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(LocalDate fec_nac) {
        this.fec_nac = fec_nac;
    }
    
    public abstract void VerDatos(); //Cuando es sobre el tema Abstraccion se pone "abstract" y aparte no se agrega nada de codigo dentro
    
}
