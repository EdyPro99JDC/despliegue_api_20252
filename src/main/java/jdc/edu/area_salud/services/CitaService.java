package jdc.edu.area_salud.services;

import jdc.edu.area_salud.entity.AgendaEntity;
import jdc.edu.area_salud.entity.CitaEntity;

import java.util.List;
import java.util.Optional;

public interface CitaService {
    List<CitaEntity> findAll();
    Optional<CitaEntity> findById(Long id);
    CitaEntity save(CitaEntity cita);
    CitaEntity update(Long id, CitaEntity cita);
    void delete(Long id);
}
