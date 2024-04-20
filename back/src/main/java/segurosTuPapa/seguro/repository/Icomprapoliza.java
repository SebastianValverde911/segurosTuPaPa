package segurosTuPapa.seguro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import segurosTuPapa.seguro.entity.CompraPoliza;

public interface Icomprapoliza extends JpaRepository<CompraPoliza, Long> {
}
