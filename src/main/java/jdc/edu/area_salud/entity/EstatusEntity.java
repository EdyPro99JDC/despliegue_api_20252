package jdc.edu.area_salud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "estatus")
public class EstatusEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestatus")
    private Long idestatus;

    @Column(name = "nombrestatus", length = 200)
    private String nombreEstatus;

}
