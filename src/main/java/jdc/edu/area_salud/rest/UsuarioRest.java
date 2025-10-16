package jdc.edu.area_salud.rest;

import jdc.edu.area_salud.entity.UsuarioEntity;
import jdc.edu.area_salud.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRest {
    private final UsuarioRepository repository;

    public UsuarioRest(UsuarioRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/list")
    public List<UsuarioEntity> listar() {
        return repository.findAll();
    }


    @GetMapping("/listby{id}")
    public UsuarioEntity obtenerPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }


    @PostMapping("/create")
    public UsuarioEntity crear(@RequestBody UsuarioEntity usuario) {
        return repository.save(usuario);
    }


    @PutMapping("/{id}")
    public UsuarioEntity actualizar(@PathVariable Long id, @RequestBody UsuarioEntity nuevosDatos) {
        return repository.findById(id).map(usuario -> {
            usuario.setUsername(nuevosDatos.getUsername());
            usuario.setPassword(nuevosDatos.getPassword());
            usuario.setEstado(nuevosDatos.getEstado());
            return repository.save(usuario);
        }).orElse(null);
    }


    @DeleteMapping("/deleteby{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
