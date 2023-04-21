package com.example.UDA.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @GetMapping("/saludar")
    public ResponseEntity<String> saludar(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body("Hola mundo");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
