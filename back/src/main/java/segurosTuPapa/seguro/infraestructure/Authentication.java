package segurosTuPapa.seguro.infraestructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import segurosTuPapa.seguro.aplication.User;
import segurosTuPapa.seguro.domain.Iuser;

@Service
public class Authentication {
    private final Iuser userRepository;

    @Autowired
    public Authentication(Iuser userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String correo, String contraseña) {
        User user = userRepository.findByCorreo(correo);
        return user != null && user.getContraseña().equals(contraseña);
    }
}
