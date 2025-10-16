package jdc.edu.area_salud.services;

import jdc.edu.area_salud.entity.AgendaEntity;
import jdc.edu.area_salud.entity.MedicoEntity;

import java.util.List;
import java.util.Optional;

public interface MedicoService {
    List<MedicoEntity> findAll();
    Optional<MedicoEntity> findById(Long id);
    MedicoEntity save(MedicoEntity medico);
    MedicoEntity update(Long id, MedicoEntity medico);
    void delete(Long id);
}
