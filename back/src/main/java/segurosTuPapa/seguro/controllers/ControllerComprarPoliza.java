package segurosTuPapa.seguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import segurosTuPapa.seguro.entity.CompraPoliza;
import segurosTuPapa.seguro.repository.Icomprapoliza;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class ControllerComprarPoliza {
    @Autowired
    Icomprapoliza Icomprapoliza;

    @PostMapping("/comprapoliza")
    public CompraPoliza compraPoliza(@RequestBody CompraPoliza compraPoliza) {
        return Icomprapoliza.save(compraPoliza);
    }

    @GetMapping("/getFacturas/{id}")
    public CompraPoliza getFacturas(@PathVariable long id){
        return Icomprapoliza.findById(id).get();
    }
}
