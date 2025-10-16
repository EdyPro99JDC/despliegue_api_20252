package jdc.edu.area_salud.services;

import jdc.edu.area_salud.entity.AgendaEntity;
import jdc.edu.area_salud.entity.PacienteEntity;

import java.util.List;
import java.util.Optional;

public interface PacienteService {
    List<PacienteEntity> findAll();
    Optional<PacienteEntity> findById(Long id);
    PacienteEntity save(PacienteEntity paciente);
    PacienteEntity update(Long id, PacienteEntity paciente);
    void delete(Long id);
}
