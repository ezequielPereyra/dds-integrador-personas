package domain;
import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;
    @Column
    private String contraseña;
    @Column
    private Boolean esAdministrador;
    @Transient
    public AreaDeRelacionamiento area;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Boolean getEsAdministrador() {
        return esAdministrador;
    }

    public void setEsAdministrador(Boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    public AreaDeRelacionamiento getArea() {
        return area;
    }

    public void setArea(AreaDeRelacionamiento area) {
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", esAdministrador=" + esAdministrador +
                ", area=" + area +
                '}';
    }
}
