package jdc.edu.area_salud.services.impl;

import jdc.edu.area_salud.entity.MedicoEntity;
import jdc.edu.area_salud.repository.MedicoRepository;
import jdc.edu.area_salud.services.MedicoService;

import java.util.List;
import java.util.Optional;

public class MedicoServiceImpl implements MedicoService {
    private MedicoRepository medicoRepository;

    @Override
    public List<MedicoEntity> findAll() {
        return medicoRepository.findAll();
    }

    @Override
    public Optional<MedicoEntity> findById(Long id) {
        return medicoRepository.findById(id);
    }

    @Override
    public MedicoEntity save(MedicoEntity medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public MedicoEntity update(Long id, MedicoEntity medico) {
        medico.setIdmedico(id);
        return medicoRepository.save(medico);
    }

    @Override
    public void delete(Long id) {
        medicoRepository.deleteById(id);
    }
}
