package segurosTuPapa.seguro.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import segurosTuPapa.seguro.model.Pqrs;
import segurosTuPapa.seguro.service.PqrsService;

@RestController
@RequestMapping("/api/pqrs")
public class PqrsController {

    private final PqrsService pqrsService;

    public PqrsController(PqrsService pqrsService) {
        this.pqrsService = pqrsService;
    }

    @PostMapping
    public ResponseEntity<Pqrs> createPqrs(@RequestBody Pqrs pqrs) {
        return ResponseEntity.ok(pqrsService.createPqrs(pqrs));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pqrs> getPqrsById(@PathVariable Long id) {
        return ResponseEntity.ok(pqrsService.getPqrsById(id));
    }

    @GetMapping
    public ResponseEntity<List<Pqrs>> getAllPqrs() {
        return ResponseEntity.ok(pqrsService.getAllPqrs());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pqrs> updatePqrs(@PathVariable Long id, @RequestBody Pqrs updatedPqrs) {
        return ResponseEntity.ok(pqrsService.updatePqrs(id, updatedPqrs));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePqrs(@PathVariable Long id) {
        pqrsService.deletePqrs(id);
        return ResponseEntity.noContent().build();
    }
}