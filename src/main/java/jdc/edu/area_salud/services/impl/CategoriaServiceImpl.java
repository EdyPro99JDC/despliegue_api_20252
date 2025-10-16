package jdc.edu.area_salud.services.impl;

import jdc.edu.area_salud.entity.CategoriaEntity;
import jdc.edu.area_salud.repository.CategoriaRepository;
import jdc.edu.area_salud.services.CategoriaService;

import java.util.List;
import java.util.Optional;

public class CategoriaServiceImpl implements CategoriaService {
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaEntity> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<CategoriaEntity> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public CategoriaEntity save(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public CategoriaEntity update(Long id, CategoriaEntity categoria) {
        categoria.setIdcategoria(id);
        return categoriaRepository.save(categoria);
    }

    @Override
    public void delete(Long id) {
        categoriaRepository.deleteById(id);
    }
}
