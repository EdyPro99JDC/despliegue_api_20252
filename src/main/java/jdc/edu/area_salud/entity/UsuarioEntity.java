package jdc.edu.area_salud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@Table(name = "usuarios")
public class UsuarioEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Long idusuario;

    @Column(name = "username", nullable = false, length = 10)
    private String username;

    @Column(name = "password", nullable = false, length = 10)
    private String password;

    @Column(name = "estado")
    private Boolean estado;
}
