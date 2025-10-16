package jdc.edu.area_salud.rest;

import jdc.edu.area_salud.entity.MedicoEntity;
import jdc.edu.area_salud.repository.MedicoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoRest {
    private final MedicoRepository repository;

    public MedicoRest(MedicoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public List<MedicoEntity> listar() {
        return repository.findAll();
    }

    @GetMapping("/listby{id}")
    public MedicoEntity obtenerPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public MedicoEntity crear(@RequestBody MedicoEntity medico) {
        return repository.save(medico);
    }

    @PutMapping("/{id}")
    public MedicoEntity actualizar(@PathVariable Long id, @RequestBody MedicoEntity nuevosDatos) {
        return repository.findById(id).map(medico -> {
            medico.setNombres(nuevosDatos.getNombres());
            medico.setPrimerApellido(nuevosDatos.getPrimerApellido());
            medico.setSegundoApellido(nuevosDatos.getSegundoApellido());
            medico.setTelefono(nuevosDatos.getTelefono());
            medico.setEmail(nuevosDatos.getEmail());
            medico.setGenero(nuevosDatos.getGenero());
            medico.setCategoria(nuevosDatos.getCategoria());
            return repository.save(medico);
        }).orElse(null);
    }

    @DeleteMapping("/deleteby{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
