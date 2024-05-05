package segurosTuPapa.seguro.infraestructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import segurosTuPapa.seguro.aplication.CompraPoliza;
import segurosTuPapa.seguro.domain.Icomprapoliza;

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
