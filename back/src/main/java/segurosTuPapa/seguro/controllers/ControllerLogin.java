package segurosTuPapa.seguro.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import segurosTuPapa.seguro.entity.Login;
import segurosTuPapa.seguro.entity.User;
import segurosTuPapa.seguro.repository.Iuser;
import segurosTuPapa.seguro.service.Authentication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class ControllerLogin {
    private final Authentication authenticationService;

    @Autowired
    public ControllerLogin(Authentication authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    public List<Map<String,Object>> login(@RequestBody Login loginRequest ) {
        List data = new ArrayList<>();
        String token = "asdkljashjk123123as|12dUAO";

        if (authenticationService.authenticate(loginRequest.getCorreo(), loginRequest.getContraseña())) {
            data.add(Map.of("resultStatus",200,"data",true,"tokenSession",token));
        } else {
            data.add(Map.of("resultStatus",401,"errorMessage","Usuario no registrado"));
        }
        return data;
    }
}

