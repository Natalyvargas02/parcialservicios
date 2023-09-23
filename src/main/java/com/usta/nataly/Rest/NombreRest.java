package com.usta.nataly.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NombreRest {

    @GetMapping("/nombre")
    private String Test(){
        return "Hola mi nombre es"+ " Nataly";
    }


}
