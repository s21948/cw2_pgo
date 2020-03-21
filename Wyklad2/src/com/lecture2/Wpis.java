package com.lecture2;

import java.util.Date;

public class Wpis {

    private String autor;
    private String opis;
    private Date data;

    public Wpis(String autor, String opis, Date data) {
        this.autor = autor;
        this.opis = opis;
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public String getOpis() {
        return opis;
    }

    public Date getData() {
        return data;
    }
}

