package com.studio.ijj.spoline.Model;

/**
 * Created by Iván Cózar on 16/02/2016.
 */
public class Amigo {

    private int ID_amigo;
    private int Telefono;
    private String Nombre;
    private String Email;


    public int getID_amigo() {
        return ID_amigo;
    }

    public void setID_amigo(int ID_amigo) {
        this.ID_amigo = ID_amigo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
