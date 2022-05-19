package com.example.webservice.entities;

public class Contacto {
    public int id;
    public String name;
    public String number;
    public String imagen;

    public Contacto(int id, String name, String number, String imagen) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
