package domain;
import javax.persistence.*;

@Entity
@Table(name="motivo")
public class Motivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombreMotivo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMotivo() {
        return nombreMotivo;
    }

    public void setNombreMotivo(String nombreMotivo) {
        this.nombreMotivo = nombreMotivo;
    }

    @Override
    public String toString() {
        return "Motivo{" +
                "id=" + id +
                ", nombreMotivo='" + nombreMotivo + '\'' +
                '}';
    }
}
