package jdc.edu.area_salud.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
@Data
@Embeddable
public class AgendaId implements Serializable {
    private Long idcitas;
    private Long idpacientes;

    @Override
    public int hashCode() {
        return Objects.hash(idcitas, idpacientes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AgendaId that = (AgendaId) obj;
        return Objects.equals(idcitas, that.idcitas) &&
                Objects.equals(idpacientes, that.idpacientes);
    }
}
