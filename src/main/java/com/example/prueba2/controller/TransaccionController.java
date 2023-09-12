package com.example.prueba2.controller;


import com.example.prueba2.entity.Transaccion;
import com.example.prueba2.service.TransaccionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransaccionController {
    @Autowired
    private TransaccionDao transaccionService;

    // Save operation
    @PostMapping("/transaccion")
    public void saveDepartment(
            @RequestBody Transaccion transaccion) {

        transaccionService.registrarTransaccion(transaccion);
    }

    @PutMapping("/transaccion/{id}")
    public Transaccion
    updateDepartment(@RequestBody Transaccion transaccion,
                     @PathVariable("id") Long transaccionId) {

        return transaccionService.modificarTransaccion(
                transaccion, transaccionId);
    }
}
