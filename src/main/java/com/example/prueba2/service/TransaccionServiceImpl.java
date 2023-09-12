package com.example.prueba2.service;

import com.example.prueba2.entity.Transaccion;
import com.example.prueba2.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TransaccionServiceImpl implements TransaccionDao {

    @Autowired
    private TransaccionRepository transaccionRepository;

    @Override
    public void registrarTransaccion(Transaccion transaccion) {
        transaccionRepository.save(transaccion);
    }

    @Override
    public Transaccion modificarTransaccion(Transaccion transaccion, Long transaccionId) {
        Transaccion depDB = transaccionRepository.findById(transaccionId).get();

        if (Objects.nonNull(transaccion.getEstado()) && !"".equalsIgnoreCase(transaccion.getEstado())) {
            depDB.setEstado(transaccion.getEstado());
        }

        if (Objects.nonNull(transaccion.getFechaRegistro())) {
            depDB.setFechaRegistro(transaccion.getFechaRegistro());
        }

        if (Objects.nonNull(transaccion.getNombreDocumento()) && !"".equalsIgnoreCase(transaccion.getNombreDocumento())) {
            depDB.setNombreDocumento(transaccion.getNombreDocumento());
        }
        return transaccionRepository.save(depDB);
    }
}
