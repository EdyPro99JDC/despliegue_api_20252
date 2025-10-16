package jdc.edu.area_salud.rest;

import jdc.edu.area_salud.entity.PagoEntity;
import jdc.edu.area_salud.repository.PagoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pago")
public class PagoRest {

    private final PagoRepository repository;

    public PagoRest(PagoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public List<PagoEntity> listar() {
        return repository.findAll();
    }

    @GetMapping("/listby{id}")
    public PagoEntity obtenerPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public PagoEntity crear(@RequestBody PagoEntity pago) {
        return repository.save(pago);
    }

    @PutMapping("/{id}")
    public PagoEntity actualizar(@PathVariable Long id, @RequestBody PagoEntity nuevosDatos) {
        return repository.findById(id).map(pago -> {
            pago.setTipoPago(nuevosDatos.getTipoPago());
            return repository.save(pago);
        }).orElse(null);
    }

    @DeleteMapping("/deleteby{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
