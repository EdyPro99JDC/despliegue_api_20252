package jdc.edu.area_salud.rest;

import jdc.edu.area_salud.entity.PacienteEntity;
import jdc.edu.area_salud.entity.UsuarioEntity;
import jdc.edu.area_salud.repository.PacienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteRest {
    private final PacienteRepository repository;

    public PacienteRest(PacienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public List<PacienteEntity> listar() {
        return repository.findAll();
    }

    @GetMapping("/listby{id}")
    public PacienteEntity obtenerPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public PacienteEntity crear(@RequestBody PacienteEntity paciente) {
        return repository.save(paciente);
    }

    @PutMapping("/{id}")
    public PacienteEntity actualizar(@PathVariable Long id, @RequestBody PacienteEntity nuevosDatos) {
        return repository.findById(id).map(paciente -> {
            paciente.setNombres(nuevosDatos.getNombres());
            paciente.setPrimerApellido(nuevosDatos.getPrimerApellido());
            paciente.setSegundoApellido(nuevosDatos.getSegundoApellido());
            paciente.setDocumento(nuevosDatos.getDocumento());
            paciente.setFechanacimiento(nuevosDatos.getFechanacimiento());
            paciente.setMedicamentos(nuevosDatos.getMedicamentos());
            paciente.setAlergias(nuevosDatos.getAlergias());
            return repository.save(paciente);
        }).orElse(null);
    }

    @DeleteMapping("/deleteby{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
