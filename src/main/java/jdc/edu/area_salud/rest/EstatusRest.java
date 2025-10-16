package jdc.edu.area_salud.rest;

import jdc.edu.area_salud.entity.EstatusEntity;
import jdc.edu.area_salud.repository.EstatusRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estatus")
public class EstatusRest {
    private final EstatusRepository repository;

    public EstatusRest(EstatusRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public List<EstatusEntity> listar() {
        return repository.findAll();
    }

    @GetMapping("/listby{id}")
    public EstatusEntity obtenerPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public EstatusEntity crear(@RequestBody EstatusEntity estatus) {
        return repository.save(estatus);
    }

    @PutMapping("/{id}")
    public EstatusEntity actualizar(@PathVariable Long id, @RequestBody EstatusEntity nuevosDatos) {
        return repository.findById(id).map(estatus -> {
            estatus.setNombreEstatus(nuevosDatos.getNombreEstatus());
            return repository.save(estatus);
        }).orElse(null);
    }

    @DeleteMapping("/deleteby{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
