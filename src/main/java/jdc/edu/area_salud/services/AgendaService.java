package jdc.edu.area_salud.services;

import jdc.edu.area_salud.entity.AgendaEntity;

import java.util.List;
import java.util.Optional;

public interface AgendaService {
    List<AgendaEntity> findAll();
    Optional<AgendaEntity> findById(Long id);
    AgendaEntity save(AgendaEntity agenda);
    AgendaEntity update(Long id, AgendaEntity agenda);
    void delete(Long id);
}
