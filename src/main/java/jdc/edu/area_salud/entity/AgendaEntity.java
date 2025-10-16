package jdc.edu.area_salud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "agendas")
public class AgendaEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private AgendaId id;

    @ManyToOne
    @MapsId("idcitas")
    @JoinColumn(name = "idcitas", referencedColumnName = "idcita")
    private CitaEntity cita;

    @ManyToOne
    @MapsId("idpacientes")
    @JoinColumn(name = "idpacientes", referencedColumnName = "idpaciente")
    private PacienteEntity paciente;
}
