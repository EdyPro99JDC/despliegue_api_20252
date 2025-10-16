package jdc.edu.area_salud.services.impl;

import jdc.edu.area_salud.entity.PacienteEntity;
import jdc.edu.area_salud.repository.PacienteRepository;
import jdc.edu.area_salud.services.PacienteService;

import java.util.List;
import java.util.Optional;

public class PacienteServiceImpl implements PacienteService {
    private PacienteRepository pacienteRepository;


    @Override
    public List<PacienteEntity> findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<PacienteEntity> findById(Long id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public PacienteEntity save(PacienteEntity paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public PacienteEntity update(Long id, PacienteEntity paciente) {
        paciente.setIdpaciente(id);
        return pacienteRepository.save(paciente);
    }

    @Override
    public void delete(Long id) {
        pacienteRepository.deleteById(id);
    }
}
