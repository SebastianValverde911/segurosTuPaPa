package segurosTuPapa.seguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import segurosTuPapa.seguro.entity.CompraExtranjera;
import segurosTuPapa.seguro.entity.CompraPoliza;
import segurosTuPapa.seguro.repository.Icompraextranjera;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class ControllerCompraExtranjera {

    @Autowired
    Icompraextranjera IcompraExtranjera;

    @PostMapping("/compraextranjera")
    public CompraExtranjera compraExtranjera(@RequestBody CompraExtranjera compraExtranjera) {
        return IcompraExtranjera.save(compraExtranjera);
    }
}
