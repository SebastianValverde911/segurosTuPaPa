package segurosTuPapa.seguro.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import segurosTuPapa.seguro.aplication.Polizas;

public interface Ipoliza extends JpaRepository<Polizas, Long> {
}
