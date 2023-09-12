package com.example.prueba2.repository;

import com.example.prueba2.entity.Transaccion;
import org.springframework.data.repository.CrudRepository;

public interface TransaccionRepository extends CrudRepository<Transaccion, Long> {
}
