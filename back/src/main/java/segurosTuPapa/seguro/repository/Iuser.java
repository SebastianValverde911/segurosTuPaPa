package segurosTuPapa.seguro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import segurosTuPapa.seguro.entity.User;

public interface Iuser extends JpaRepository<User, Long>{
    User findByCorreo(String correo);
}
