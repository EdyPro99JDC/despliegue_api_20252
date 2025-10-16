package jdc.edu.area_salud.services;

import jdc.edu.area_salud.entity.AgendaEntity;
import jdc.edu.area_salud.entity.CategoriaEntity;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<CategoriaEntity> findAll();
    Optional<CategoriaEntity> findById(Long id);
    CategoriaEntity save(CategoriaEntity categoria);
    CategoriaEntity update(Long id, CategoriaEntity categoria);
    void delete(Long id);
}
