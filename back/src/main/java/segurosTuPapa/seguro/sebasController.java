package segurosTuPapa.seguro;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


//Este controlador es de prueba se puede borrar luego

@RestController
@RequestMapping("/control")
public class sebasController {
    private List<User> users = new ArrayList<>();

    @GetMapping("/saludo/{nombre}")
    public ResponseEntity saludo(@PathVariable String nombre) {
        return ResponseEntity.ok(nombre);
    }

    @PostMapping("/endpoint")
    public ResponseEntity<String> handlePostRequest(@RequestBody String requestBody) {

        String responseBody = "¡Solicitud POST recibida!";
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> saludo() {
        users.add(new User("usuario1", "Usuario Uno", "juanseb1@hotmail.com"));
        users.add(new User("usuario2", "Usuario Dos","juanseb2@hotmail.com"));
        users.add(new User("usuario3", "Usuario Tres","juanse3@hotmail.com"));


//        return new ResponseEntity<>(users, HttpStatus.OK);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers() {
        users.add(new User("usuario1", "Usuario Uno", "juanseb1@hotmail.com"));
        users.add(new User("usuario2", "Usuario Dos","juanseb2@hotmail.com"));
        users.add(new User("usuario3", "Usuario Tres","juanse3@hotmail.com"));

//      return new ResponseEntity<>(users, HttpStatus.OK);
        return ResponseEntity.ok(users);
    }
}
