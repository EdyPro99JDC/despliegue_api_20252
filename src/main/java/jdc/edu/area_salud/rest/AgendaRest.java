package jdc.edu.area_salud.rest;

import jdc.edu.area_salud.entity.AgendaEntity;
import jdc.edu.area_salud.repository.AgendaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agenda")
public class AgendaRest {
    private final AgendaRepository repository;

    public AgendaRest(AgendaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listar")
    public List<AgendaEntity> listar() {
        return repository.findAll();
    }

    @GetMapping("/listby{id}")
    public AgendaEntity obtenerPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public AgendaEntity crear(@RequestBody AgendaEntity agenda) {
        return repository.save(agenda);
    }

    @PutMapping("/{id}")
    public AgendaEntity actualizar(@PathVariable Long id, @RequestBody AgendaEntity nuevosDatos) {
        return repository.findById(id).map(agenda -> {
            agenda.setCita(nuevosDatos.getCita());
            agenda.setPaciente(nuevosDatos.getPaciente());
            return repository.save(agenda);
        }).orElse(null);
    }

    @DeleteMapping("/deleteby{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
