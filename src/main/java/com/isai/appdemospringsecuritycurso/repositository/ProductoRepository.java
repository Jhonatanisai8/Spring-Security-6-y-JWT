package com.isai.appdemospringsecuritycurso.repositository;

import com.isai.appdemospringsecuritycurso.entitys.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository
        extends JpaRepository<Producto, Long> {

}
