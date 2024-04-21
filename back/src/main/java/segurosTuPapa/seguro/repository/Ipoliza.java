package segurosTuPapa.seguro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import segurosTuPapa.seguro.entity.Polizas;

public interface Ipoliza extends JpaRepository<Polizas, Long> {
}
