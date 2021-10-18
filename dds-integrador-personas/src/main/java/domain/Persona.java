package domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String dni;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @Column
    private Date fechaNacimiento;
    @Column
    private String ciudad;
    @Column
    private String Localidad;
    //private String foto; ??
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    public List<Persona> getAutorizadosParaOperar() {
        return autorizadosParaOperar;
    }

    public void setAutorizadosParaOperar(List<Persona> autorizadosParaOperar) {
        this.autorizadosParaOperar = autorizadosParaOperar;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", usuario=" + usuario +
                ", fechaNacimiento=" + fechaNacimiento +
                ", ciudad='" + ciudad + '\'' +
                ", Localidad='" + Localidad + '\'' +
                ", autorizadosParaOperar=" + autorizadosParaOperar +
                '}';
    }
}
