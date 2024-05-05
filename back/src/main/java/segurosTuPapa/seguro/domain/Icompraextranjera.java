package segurosTuPapa.seguro.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import segurosTuPapa.seguro.aplication.CompraExtranjera;

public interface Icompraextranjera extends JpaRepository<CompraExtranjera, Long>{
}
