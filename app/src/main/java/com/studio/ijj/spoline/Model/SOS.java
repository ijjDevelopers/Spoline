package com.studio.ijj.spoline.Model;

/**
 * Created by Iván Cózar on 16/02/2016.
 */
public class SOS {

    private Usuario usuario;
    private long Localizacion;
    private static final String MENSAJE = "¡SOS!, HA OCURRIDO UN ACCIDENTE, SE PRECISA AYUDA URGENTE";

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public long getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(long localizacion) {
        Localizacion = localizacion;
    }

    public static String getMENSAJE() {
        return MENSAJE;
    }
}
