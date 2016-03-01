package com.studio.ijj.spoline.Model;

import java.io.File;

/**
 * Created by Iván Cózar on 16/02/2016.
 */
public class Ruta {

    private int ID_ruta;
    private String Descripcion;
    private File pathFileRuta;
    private int Duracion;
    private int Velocidad_media;
    private int Velocidad_maxima;
    private int Distancia;
    private long [] Zona;

    public int getID_ruta() {
        return ID_ruta;
    }

    public void setID_ruta(int ID_ruta) {
        this.ID_ruta = ID_ruta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public File getPathFileRuta() {
        return pathFileRuta;
    }

    public void setPathFileRuta(File pathFileRuta) {
        this.pathFileRuta = pathFileRuta;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public int getVelocidad_media() {
        return Velocidad_media;
    }

    public void setVelocidad_media(int velocidad_media) {
        Velocidad_media = velocidad_media;
    }

    public int getVelocidad_maxima() {
        return Velocidad_maxima;
    }

    public void setVelocidad_maxima(int velocidad_maxima) {
        Velocidad_maxima = velocidad_maxima;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int distancia) {
        Distancia = distancia;
    }

    public long[] getZona() {
        return Zona;
    }

    public void setZona(long[] zona) {
        Zona = zona;
    }
}
