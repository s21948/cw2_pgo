package com.lecture2;

import java.util.Date;

public class Wizyta {

    //public, private
    private Date data;
    private int numerGabinetu;
    private Lekarz lekarz;
    private Pacjent pacjent;

    public Wizyta(Date data, int numerGabinetu){
        setData(data);
        setNrGabinetu(numerGabinetu);
    }

    //Przeciazania - overloading
    public Wizyta(Date data, int numerGabinetu, Lekarz lekarz){
        this.lekarz=lekarz;
        setData(data);
        setNrGabinetu(numerGabinetu);
    }

    private void setData(Date data){
        if(data==null){
            throw new IllegalArgumentException("Data jest wymagana");
        }

        this.data=data;
    }

    private void setNrGabinetu(int nrGabinetu){
        if(numerGabinetu<=0){
            throw new IllegalArgumentException("Numer gabinetu musi byc wiekszy od zera");
        }

        this.numerGabinetu=nrGabinetu;
    }

    //public typ getNazwaPola
    public Date getDate(){
        return (Date)data.clone();
    }

    public int getNumerGabinetu(){
        return numerGabinetu;
    }

    public Lekarz getLekarz() {
        return lekarz;
    }

    public void setLekarz(Lekarz lekarz) {
        this.lekarz = lekarz;
    }

    public Pacjent getPacjent() {
        return pacjent;
    }

    public void setPacjent(Pacjent pacjent) {
        this.pacjent = pacjent;
    }
}
