package segurosTuPapa.seguro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import segurosTuPapa.seguro.model.Pqrs;

@Repository
public interface PqrsRepository extends JpaRepository<Pqrs, Long> {
}
//Esta interfaz extiende de JpaRepository y proporciona los métodos básicos de CRUD para interactuar con la base de datos.
