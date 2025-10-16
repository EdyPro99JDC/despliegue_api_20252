package jdc.edu.area_salud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "medicos")
public class MedicoEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmedico")
    private Long idmedico;

    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;

    @Column(name = "primerapellido", length = 15)
    private String primerApellido;

    @Column(name = "segundoapellido", length = 15)
    private String segundoApellido;

    @Column(name = "genero", length = 15)
    private String genero;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "idcategoria")
    private CategoriaEntity categoria;
}
