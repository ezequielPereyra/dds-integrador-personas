package domain;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="area_de_relacionamiento")
public class AreaDeRelacionamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Transient
    private List<Persona> personasHabilitadas;
    @Transient
    private List<Delegacion> delegaciones;

    public List<Persona> getPersonasHabilitadas() {
        return personasHabilitadas;
    }

    public void setPersonasHabilitadas(List<Persona> personasHabilitadas) {
        this.personasHabilitadas = personasHabilitadas;
    }

    public List<Delegacion> getDelegaciones() {
        return delegaciones;
    }

    public void setDelegaciones(List<Delegacion> delegaciones) {
        this.delegaciones = delegaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AreaDeRelacionamiento{" +
                "id=" + id +
                ", personasHabilitadas=" + personasHabilitadas +
                ", delegaciones=" + delegaciones +
                '}';
    }
}
