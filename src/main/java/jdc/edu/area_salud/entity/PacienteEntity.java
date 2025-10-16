package jdc.edu.area_salud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "pacientes")
public class PacienteEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaciente")
    private Long idpaciente;

    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;

    @Column(name = "primerapellido", length = 15)
    private String primerApellido;

    @Column(name = "segundoapellido", length = 15)
    private String segundoApellido;

    @Column(name = "documento", length = 10)
    private String documento;

    @Column(name = "fechanacimiento")
    private LocalDate fechanacimiento;

    @Column(name = "medicamentos", length = 100)
    private String medicamentos;

    @Column(name = "alergias", length = 100)
    private String alergias;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private UsuarioEntity usuario;
}
