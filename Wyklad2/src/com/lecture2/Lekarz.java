package com.lecture2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Lekarz {

    private String imie;
    private String nazwisko;
    private String pesel;
    private int pensja;
    private String stopien;
    private String email;
    private String telefon;
    private ArrayList<Wizyta> wizyty=new ArrayList<Wizyta>();

    public Lekarz(String imie, String nazwisko, String pesel, String telefon) {
        if(imie==null || nazwisko==null){
            throw new IllegalArgumentException("Imie i nazwisko muszą zostac podane");
        }
        //Regular Expressions

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.telefon = telefon;
    }

    public ArrayList<Wizyta> znajdzWizyty(Date dzien){
        ArrayList<Wizyta> znalezione=new ArrayList<>();
        for(int i=0; i<wizyty.size(); i++){
            //...
        }
        return znalezione;
    }

    public ArrayList<Wizyta> znajdzWizyty(Date odDnia, Date doDnie){
        //...
        return null;
    }

    public ArrayList<Wizyta> znajdzWizyty(String nazwiskoPacjenta){
        //...
        return null;
    }

    //....

    public void przypiszWizyte(Wizyta w){
        wizyty.add(w);
        //w.setLekarz(this);
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

    private void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getStopien() {
        return stopien;
    }

    public void setStopien(String stopien) {
        this.stopien = stopien;
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
