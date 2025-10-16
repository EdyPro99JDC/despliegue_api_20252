package jdc.edu.area_salud.services.impl;

import jdc.edu.area_salud.entity.EstatusEntity;
import jdc.edu.area_salud.repository.EstatusRepository;
import jdc.edu.area_salud.services.EstatusService;

import java.util.List;
import java.util.Optional;

public class EstatusServiceImpl implements EstatusService {
    private EstatusRepository estatusRepository;

    @Override
    public List<EstatusEntity> findAll() {
        return estatusRepository.findAll();
    }

    @Override
    public Optional<EstatusEntity> findById(Long id) {
        return estatusRepository.findById(id);
    }

    @Override
    public EstatusEntity save(EstatusEntity estatus) {
        return estatusRepository.save(estatus);
    }

    @Override
    public EstatusEntity update(Long id, EstatusEntity estatus) {
        estatus.setIdestatus(id);
        return estatusRepository.save(estatus);
    }

    @Override
    public void delete(Long id) {
        estatusRepository.deleteById(id);
    }
}
