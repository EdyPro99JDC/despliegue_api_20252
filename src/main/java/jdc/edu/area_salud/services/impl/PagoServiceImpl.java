package jdc.edu.area_salud.services.impl;

import jdc.edu.area_salud.entity.PagoEntity;
import jdc.edu.area_salud.repository.PagoRepository;
import jdc.edu.area_salud.services.PagoService;

import java.util.List;
import java.util.Optional;

public class PagoServiceImpl implements PagoService {
    private PagoRepository pagoRepository;


    @Override
    public List<PagoEntity> findAll() {
        return pagoRepository.findAll();
    }

    @Override
    public Optional<PagoEntity> findById(Long id) {
        return pagoRepository.findById(id);
    }

    @Override
    public PagoEntity save(PagoEntity pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public PagoEntity update(Long id, PagoEntity pago) {
        pago.setIdpago(id);
        return pagoRepository.save(pago);
    }

    @Override
    public void delete(Long id) {
        pagoRepository.deleteById(id);
    }
}
