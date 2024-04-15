package segurosTuPapa.seguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistroController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/registrarte")
    public String registrarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario); //Es uno de los metodos de jpa para guardar objetos en nuestra bd, pero para eso hay que instalar la dependencia
        return ResponseEntity.ok();
    }
}
