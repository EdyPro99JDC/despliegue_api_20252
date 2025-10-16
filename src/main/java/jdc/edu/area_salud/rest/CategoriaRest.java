package jdc.edu.area_salud.rest;

import jdc.edu.area_salud.entity.CategoriaEntity;
import jdc.edu.area_salud.repository.CategoriaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaRest {
    private final CategoriaRepository repository;

    public CategoriaRest(CategoriaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public List<CategoriaEntity> listar() {
        return repository.findAll();
    }

    @GetMapping("/listby{id}")
    public CategoriaEntity obtenerPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public CategoriaEntity crear(@RequestBody CategoriaEntity categoria) {
        return repository.save(categoria);
    }

    @PutMapping("/{id}")
    public CategoriaEntity actualizar(@PathVariable Long id, @RequestBody CategoriaEntity nuevosDatos) {
        return repository.findById(id).map(categoria -> {
            categoria.setNombrecategoria(nuevosDatos.getNombrecategoria());
            categoria.setNombrecategoria(nuevosDatos.getNombrecategoria());
            return repository.save(categoria);
        }).orElse(null);
    }

    @DeleteMapping("/deleteby{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
