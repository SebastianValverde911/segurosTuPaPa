package segurosTuPapa.seguro.infraestructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import segurosTuPapa.seguro.aplication.User;
import segurosTuPapa.seguro.domain.Iuser;


import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class ControllerGetUsers {
    @Autowired
    private Iuser Iuser;

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return Iuser.findAll();
    }
}
