package domain;

import java.util.Date;
import java.util.List;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private Usuario usuario;
    private Date fechaNacimiento;
    private String ciudad;
    private String Localidad;
    //private String foto; ??
    private List<Persona> autorizadosParaOperar;

    public void loggearse(){

    }

    public void actualizarDatos(){

    }

    public void autorizarA(Persona persona_a_autorizar){

    }
    public void confirmarAutorizacion(Persona persona_a_autorizar){

    }
    public void denegarAutorizacion(){

    }

    public void aceptarDelegacion(Persona persona_a_autorizar){

    }
    public void denegarDelegacion(Persona persona){

    }

    public List<Persona> listadoPersonas(){
        return usuario.area.getPersonasHabilitadas();
    }
    public List<Delegacion> listadoDelegaciones(){
        return usuario.area.getDelegaciones();
    }

    public void desloggearse(){

    }
}
