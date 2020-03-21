package com.lecture2;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*
        Wizyta w1=new Wizyta(new Date(2020, 4, 10, 12, 20), 110); //konstruktor domyslny
        //w1.data=new Date(2020, 4, 10, 12, 20);
        //w1.numerGabinetu=220;

        Date d=w1.getDate();
        System.out.println("Data wizyty "+w1.getDate());
        d.setDate(20);
        System.out.println("Data wizyty "+w1.getDate());

        int nr=w1.getNumerGabinetu();
        System.out.println("Numer gabinetu "+w1.getNumerGabinetu()); //110
        nr=120;
        System.out.println("Numer gabinetu "+w1.getNumerGabinetu()); //110
         */

        //Kolekcje - ArrayList<T>
        /*
        ArrayList<String> lista=new ArrayList<String>();
        lista.add("Anna");
        lista.add("Jan");
        //...
        System.out.println(lista.get(0)); // Anna
         */

        Wizyta w1=new Wizyta(new Date(2020, 4, 10, 12, 20), 110); //konstruktor domyslny

        Lekarz l1=new Lekarz("Jan", "Kowalski", "890402323", "455-232-442");
        l1.setImie("Andrzej");

        //Przypisz wizyte do lekarz
        w1.setLekarz(l1);
        l1.przypiszWizyte(w1);

        //Lekarz od razu przypisany
        Wizyta w2=new Wizyta(new Date(2020, 4, 11, 12, 20), 120, l1);
        l1.przypiszWizyte(w2);

        Pacjent p1=new Pacjent("Andrzej", "Malewski", "8904034322");
        //Wpis wpis1=new Wpis("Kowalski", "Cos sie stalo", new Date());
        p1.dodajWpisDoKsiazeczki("Wyrwanie zeba", "Kowalski");

        //Powiazanie pacjenta p1 z wizyta w1
        w1.setPacjent(p1);
    }
}
