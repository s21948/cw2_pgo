package com.lecture2;

import java.util.ArrayList;
import java.util.Date;

public class Pacjent {

    private String imie;
    private String nazwisko;
    private String pesel;
    private String email;
    private String telefon;
    private ArrayList<Wpis> ksiazeczka=new ArrayList<>();

    public Pacjent(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public void dodajWpisDoKsiazeczki(String opis, String autor){
        Wpis w=new Wpis(autor, opis, new Date());
        ksiazeczka.add(w);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
