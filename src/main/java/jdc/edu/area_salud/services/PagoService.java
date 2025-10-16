package jdc.edu.area_salud.services;

import jdc.edu.area_salud.entity.AgendaEntity;
import jdc.edu.area_salud.entity.PagoEntity;

import java.util.List;
import java.util.Optional;

public interface PagoService {
    List<PagoEntity> findAll();
    Optional<PagoEntity> findById(Long id);
    PagoEntity save(PagoEntity pago);
    PagoEntity update(Long id, PagoEntity pago);
    void delete(Long id);
}
