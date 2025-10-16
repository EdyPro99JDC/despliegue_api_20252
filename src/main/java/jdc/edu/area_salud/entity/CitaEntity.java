package jdc.edu.area_salud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "citas")
public class CitaEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcita")
    private Long idcita;

    @Column(name = "titulo", length = 50)
    private String titulo;

    @Column(name = "nota", length = 50)
    private String nota;

    @Column(name = "fechacita")
    private LocalDate fechaCita;

    @Column(name = "sintomas", length = 100)
    private String sintomas;

    @Column(name = "medicamentos", length = 100)
    private String medicamentos;

    @Column(name = "antecedentes")
    private Boolean antecedentes;

    @ManyToOne
    @JoinColumn(name = "idmedico")
    private MedicoEntity medico;

    @ManyToOne
    @JoinColumn(name = "idpago")
    private PagoEntity pago;

    @ManyToOne
    @JoinColumn(name = "idestatus")
    private EstatusEntity estatus;

}
