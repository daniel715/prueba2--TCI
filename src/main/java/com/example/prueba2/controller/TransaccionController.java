package com.example.prueba2.controller;


import com.example.prueba2.entity.Transaccion;
import com.example.prueba2.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransaccionController {
    @Autowired
    private TransaccionService transaccionService;

    // Save operation
    @PostMapping("/transaccion")
    public Transaccion saveDepartment(
            @RequestBody Transaccion transaccion) {

        return transaccionService.saveTransaccion(transaccion);
    }

    @PutMapping("/transaccion/{id}")
    public Transaccion
    updateDepartment(@RequestBody Transaccion transaccion,
                     @PathVariable("id") Long transaccionId) {

        return transaccionService.updateTransaccion(
                transaccion, transaccionId);
    }
}
