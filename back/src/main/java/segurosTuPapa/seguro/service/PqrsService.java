package segurosTuPapa.seguro.service;

import segurosTuPapa.seguro.model.Pqrs;

import java.util.List;
import java.util.Optional;

public interface PqrsService {

    Pqrs createPqrs(Pqrs pqrs);

    Optional<Pqrs> getPqrsById(Long id);

    List<Pqrs> getAllPqrs();

    Pqrs updatePqrs(Long id, Pqrs updatedPqrs);

    void deletePqrs(Long id);
}