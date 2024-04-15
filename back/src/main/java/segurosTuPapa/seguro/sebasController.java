package segurosTuPapa.seguro;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayLi


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistroController {

    @PostMapping("/registro")
    public String registrarUsuario(@RequestBody Usuario usuario) {
        String email = usuario.getEmail();
        String contrasena = usuario.getContrasena();

        // Aquí puedes hacer lo que necesites con el email y la contraseña
        // Por ejemplo, puedes guardarlos en una base de datos

        return "Usuario registrado correctamente";
    }
}
