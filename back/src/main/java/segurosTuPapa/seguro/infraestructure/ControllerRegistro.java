package segurosTuPapa.seguro.infraestructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import segurosTuPapa.seguro.aplication.User;
import segurosTuPapa.seguro.domain.Iuser;

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
