package jdc.edu.area_salud.services.impl;

import jdc.edu.area_salud.entity.CitaEntity;
import jdc.edu.area_salud.repository.CitaRepository;
import jdc.edu.area_salud.services.CitaService;

import java.util.List;
import java.util.Optional;

public class CitaServiceImpl implements CitaService {

    private CitaRepository citaRepository;

    @Override
    public List<CitaEntity> findAll() {
        return citaRepository.findAll();
    }

    @Override
    public Optional<CitaEntity> findById(Long id) {
        return citaRepository.findById(id);
    }

    @Override
    public CitaEntity save(CitaEntity cita) {
        return citaRepository.save(cita);
    }

    @Override
    public CitaEntity update(Long id, CitaEntity cita) {
        cita.setIdcita(id);
        return citaRepository.save(cita);
    }

    @Override
    public void delete(Long id) {
        citaRepository.deleteById(id);
    }
}
