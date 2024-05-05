package segurosTuPapa.seguro.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import segurosTuPapa.seguro.aplication.CompraPoliza;

public interface Icomprapoliza extends JpaRepository<CompraPoliza, Long> {
}
