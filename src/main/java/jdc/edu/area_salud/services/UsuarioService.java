package jdc.edu.area_salud.services;

import jdc.edu.area_salud.entity.AgendaEntity;
import jdc.edu.area_salud.entity.UsuarioEntity;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<UsuarioEntity> findAll();
    Optional<UsuarioEntity> findById(Long id);
    UsuarioEntity save(UsuarioEntity usuario);
    UsuarioEntity update(Long id, UsuarioEntity usuario);
    void delete(Long id);
}
