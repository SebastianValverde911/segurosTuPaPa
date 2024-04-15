@Service
package segurosTuPapa.seguro.service.impl;

import org.springframework.stereotype.Service;

import segurosTuPapa.seguro.model.Pqrs;
import segurosTuPapa.seguro.repository.PqrsRepository;
import segurosTuPapa.seguro.service.PqrsService;

import java.util.List;
import java.util.Optional;

@Service
public class PqrsServiceImpl implements PqrsService {

    private final PqrsRepository pqrsRepository;

    public PqrsServiceImpl(PqrsRepository pqrsRepository) {
        this.pqrsRepository = pqrsRepository;
    }

    @Override
    public Pqrs createPqrs(Pqrs pqrs) {
        return pqrsRepository.save(pqrs);
    }

    @Override
    public Optional<Pqrs> getPqrsById(Long id) {
        return pqrsRepository.findById(id);
    }

    @Override
    public List<Pqrs> getAllPqrs() {
        return pqrsRepository.findAll();
    }

    @Override
    public Pqrs updatePqrs(Long id, Pqrs updatedPqrs) {
        return pqrsRepository.findById(id).map(pqrs -> {
            pqrs.setNombre(updatedPqrs.getNombre());
            pqrs.setCorreo(updatedPqrs.getCorreo());
            pqrs.setTipo(updatedPqrs.getTipo());
            pqrs.setMensaje(updatedPqrs.getMensaje());
            return pqrsRepository.save(pqrs);
        }).orElseThrow(() -> new RuntimeException("Pqrs no encontrado con id " + id));
    }

    @Override
    public void deletePqrs(Long id) {
        pqrsRepository.deleteById(id);
    }
}