package segurosTuPapa.seguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import segurosTuPapa.seguro.entity.User;
import segurosTuPapa.seguro.repository.Iuser;


import java.util.ArrayList;
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
