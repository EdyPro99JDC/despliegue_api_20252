package jdc.edu.area_salud.rest;

import jdc.edu.area_salud.entity.CitaEntity;
import jdc.edu.area_salud.repository.CitaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaRest {
    private final CitaRepository repository;

    public CitaRest(CitaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public List<CitaEntity> listar() {
        return repository.findAll();
    }

    @GetMapping("/listby{id}")
    public CitaEntity obtenerPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public CitaEntity crear(@RequestBody CitaEntity cita) {
        return repository.save(cita);
    }

    @PutMapping("/{id}")
    public CitaEntity actualizar(@PathVariable Long id, @RequestBody CitaEntity nuevosDatos) {
        return repository.findById(id).map(cita -> {
            cita.setTitulo(nuevosDatos.getTitulo());
            cita.setNota(nuevosDatos.getNota());
            cita.setFechaCita(nuevosDatos.getFechaCita());
            cita.setSintomas(nuevosDatos.getSintomas());
            cita.setMedicamentos(nuevosDatos.getMedicamentos());
            cita.setMedico(nuevosDatos.getMedico());
            cita.setPago(nuevosDatos.getPago());
            cita.setEstatus(nuevosDatos.getEstatus());
            return repository.save(cita);
        }).orElse(null);
    }

    @DeleteMapping("/deleteby{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
