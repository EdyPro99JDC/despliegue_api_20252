package jdc.edu.area_salud.services.impl;

import jdc.edu.area_salud.entity.AgendaEntity;
import jdc.edu.area_salud.repository.AgendaRepository;
import jdc.edu.area_salud.services.AgendaService;

import java.util.List;
import java.util.Optional;

public class AgendaServiceImpl implements AgendaService {
    private AgendaRepository agendaRepository;

    @Override
    public List<AgendaEntity> findAll() {
        return agendaRepository.findAll();
    }

    @Override
    public Optional<AgendaEntity> findById(Long id) {
        return agendaRepository.findById(id);
    }

    @Override
    public AgendaEntity save(AgendaEntity agenda) {
        return agendaRepository.save(agenda);
    }

    @Override
    public AgendaEntity update(Long id, AgendaEntity agenda) {
        //agenda.set
        return agendaRepository.save(agenda);
    }

    @Override
    public void delete(Long id) {
        agendaRepository.deleteById(id);
    }
}
