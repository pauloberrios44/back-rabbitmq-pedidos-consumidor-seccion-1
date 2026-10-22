package com.pcfactory.pedidos.consumidor.repository;

import com.pcfactory.pedidos.consumidor.entity.VentaProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaProductoRepository
        extends JpaRepository<VentaProducto, Long> {
}
