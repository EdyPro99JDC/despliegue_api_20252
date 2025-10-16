package jdc.edu.area_salud.services;

import jdc.edu.area_salud.entity.AgendaEntity;
import jdc.edu.area_salud.entity.EstatusEntity;

import java.util.List;
import java.util.Optional;

public interface EstatusService {
    List<EstatusEntity> findAll();
    Optional<EstatusEntity> findById(Long id);
    EstatusEntity save(EstatusEntity estatus);
    EstatusEntity update(Long id, EstatusEntity estatus);
    void delete(Long id);
}
