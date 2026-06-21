package com.isai.appdemospringsecuritycurso.repositository;

import com.isai.appdemospringsecuritycurso.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository
        extends JpaRepository<Usuario, Long> {
}
