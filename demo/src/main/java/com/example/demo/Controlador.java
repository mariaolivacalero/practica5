package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controlador {
    @GetMapping("/controlador")
    public String getInfo(){
        return "Hola Mundo";
    }

    @PostMapping("/controlador")
    public Contacto postInfo(@RequestBody Contacto contacto){
        return contacto;
    }

    
}
