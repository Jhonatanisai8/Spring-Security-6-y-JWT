package com.isai.appdemospringsecuritycurso.controllers;

import com.isai.appdemospringsecuritycurso.entitys.Producto;
import com.isai.appdemospringsecuritycurso.repositository.ProductoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoRepository productoRepository;

    @GetMapping
    public ResponseEntity<List<Producto>> getAll() {
        List<Producto> productos = productoRepository.findAll();
        if (!productos.isEmpty()) {
            return ResponseEntity.ok(productos);
        }
        return ResponseEntity.noContent().build();
    }


    @PostMapping
    public ResponseEntity<Producto> crearUnProducto(
            @RequestBody @Valid Producto producto) {
        return ResponseEntity.status(
                HttpStatus.CREATED).body(
                productoRepository.save(producto));
    }


}
