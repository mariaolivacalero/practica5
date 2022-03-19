package com.example.demo;

public class Contacto {
    private String nombre;
    private String mail;

    public Contacto(String nombre, String mail){
        this.setNombre(nombre);
        this.setMail(mail);
    }



    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getMail(){
        return mail;
    }

    public void setMail(String mail){
        this.mail= mail;
    }

}