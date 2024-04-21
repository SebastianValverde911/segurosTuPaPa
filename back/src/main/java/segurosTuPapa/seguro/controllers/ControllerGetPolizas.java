package segurosTuPapa.seguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import segurosTuPapa.seguro.entity.Polizas;
import segurosTuPapa.seguro.repository.Ipoliza;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class ControllerGetPolizas {
    @Autowired
    private Ipoliza Ipoliza;

    @GetMapping("/getPolizas")
    public List<Polizas> getPolizas() {
        return Ipoliza.findAll();
    }
}
