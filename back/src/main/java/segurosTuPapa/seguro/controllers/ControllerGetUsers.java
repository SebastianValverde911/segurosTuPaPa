package segurosTuPapa.seguro.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import segurosTuPapa.seguro.User;


import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class ControllerGetUsers {
    private List<User> users = new ArrayList<>();

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers() {
        users.add(new User("usuario1", "Usuario Uno", "juanseb1@hotmail.com"));
        users.add(new User("usuario2", "Usuario Dos","juanseb2@hotmail.com"));
        users.add(new User("usuario3", "Usuario Tres","juanse3@hotmail.com"));

//      return new ResponseEntity<>(users, HttpStatus.OK);
        return ResponseEntity.ok(users);
    }
}
