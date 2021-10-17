package domain;

public class Usuario {
/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
*/

    private String nombre;
    private String contraseña;
    private Boolean esAdministrador;
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
}
