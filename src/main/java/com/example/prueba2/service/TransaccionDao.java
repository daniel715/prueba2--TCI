package com.example.prueba2.service;

import com.example.prueba2.entity.Transaccion;

public interface TransaccionDao {
    void registrarTransaccion (Transaccion transaccion);

    Transaccion modificarTransaccion (Transaccion transaccion, Long transaccionId);

}
