package com.studio.ijj.spoline.Model;

/**
 * Created by Iván Cózar on 16/02/2016.
 */
public class Usuario {

    private int ID_user;
    private String Nombre;
    private String Email;
    private String Password;

    public Usuario() {
    }

    public Usuario (int id,String n, String e, String p){
        ID_user=id;
        Nombre=n;

        Email=e;
        Password=p;
    }

    public Usuario (String n, String e, String p){
        Nombre=n;
        Email=e;
        Password=p;
    }

    public int getID_user() {
        return ID_user;
    }

    public void setID_user(int ID_user) {
        this.ID_user = ID_user;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
