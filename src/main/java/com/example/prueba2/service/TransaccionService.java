package com.example.prueba2.service;

import com.example.prueba2.entity.Transaccion;

public interface TransaccionService {
    Transaccion saveTransaccion(Transaccion transaccion);

    Transaccion updateTransaccion(Transaccion transaccion, Long transaccionId);

}
