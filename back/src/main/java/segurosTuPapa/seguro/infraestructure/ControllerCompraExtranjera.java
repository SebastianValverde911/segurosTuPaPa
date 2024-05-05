package segurosTuPapa.seguro.infraestructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import segurosTuPapa.seguro.aplication.CompraExtranjera;
import segurosTuPapa.seguro.domain.Icompraextranjera;

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
