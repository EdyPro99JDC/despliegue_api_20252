package jdc.edu.area_salud.services.impl;

import jdc.edu.area_salud.entity.UsuarioEntity;
import jdc.edu.area_salud.repository.UsuarioRepository;
import jdc.edu.area_salud.services.UsuarioService;

import java.util.List;
import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioService {
    private UsuarioRepository usuarioRepository;


    @Override
    public List<UsuarioEntity> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<UsuarioEntity> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public UsuarioEntity save(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public UsuarioEntity update(Long id, UsuarioEntity usuario) {
        usuario.setIdusuario(id);
        return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
