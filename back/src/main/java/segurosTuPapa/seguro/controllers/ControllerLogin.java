package segurosTuPapa.seguro.controllers;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController()
@RequestMapping("/api")
public class ControllerLogin {

    @PostMapping("/login")
    public List<Map<String,Object>> login(@RequestParam String correo, @RequestParam String contra) {

        List data = new ArrayList<>();
        String token = "asdkljashjk123123as|12dUAO";

        //Aqui se valida si existe el usuario en la BD y dependiendo de lo que traiga la BD armamos la info y la retornamos
        if(correo.equals("j@hotmail.com")  && contra.equals("123")) {
            data.add(Map.of("resultStatus",200,"data",true,"tokenSession",token));
        } else {
            data.add(Map.of("resultStatus",401,"errorMessage","Usuario no registrado"));
        }

        return data;
    }
}
