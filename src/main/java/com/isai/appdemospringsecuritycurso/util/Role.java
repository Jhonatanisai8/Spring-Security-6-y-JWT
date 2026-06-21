package com.isai.appdemospringsecuritycurso.util;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

public enum Role {
    CUSTOMER(Arrays.asList(Permiso.READ_ALL_PRODUCTOS)),
    ADMINISTRATOR(Arrays.asList(Permiso.READ_ALL_PRODUCTOS, Permiso.SAVE_ONE_PRODUCTO));

    private List<Permiso> permisos;

    Role(List<Permiso> permisos) {
        this.permisos = permisos;
    }


    public List<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }
}
