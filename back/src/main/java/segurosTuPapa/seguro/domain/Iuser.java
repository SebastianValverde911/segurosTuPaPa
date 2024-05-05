package segurosTuPapa.seguro.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import segurosTuPapa.seguro.aplication.User;

public interface Iuser extends JpaRepository<User, Long>{
    User findByCorreo(String correo);
}
