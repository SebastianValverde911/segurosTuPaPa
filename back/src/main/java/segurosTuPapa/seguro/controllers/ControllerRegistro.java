package segurosTuPapa.seguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import segurosTuPapa.seguro.entity.User;
import segurosTuPapa.seguro.repository.Iuser;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class ControllerRegistro {
    @Autowired
    private Iuser Iuser;

    @PostMapping("/registry")
    public User getUsers(@RequestBody User user) {
        return Iuser.save(user);
    }
}
