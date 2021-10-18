package domain;
import javax.persistence.*;

@Entity
@Table(name="delegacion")
public class Delegacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_delegador", referencedColumnName = "id")
    private Persona delegador;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_autorizado", referencedColumnName = "id")
    private Persona autorizado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_motivo")
    private Motivo motivo;

    public Persona getDelegador() {
        return delegador;
    }

    public void setDelegador(Persona delegador) {
        this.delegador = delegador;
    }

    public Persona getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Persona autorizado) {
        this.autorizado = autorizado;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
}
