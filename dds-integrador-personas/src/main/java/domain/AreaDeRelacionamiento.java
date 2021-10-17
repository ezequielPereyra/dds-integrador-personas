package domain;

import java.util.List;

public class AreaDeRelacionamiento {

    private List<Persona> personasHabilitadas;
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


}
