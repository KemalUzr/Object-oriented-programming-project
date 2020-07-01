package com.company;

public class Trainer extends Personeelslid {
    @Override
    void naam() {
        System.out.println("naam: Anna Koning");
    }

    @Override
    void persooneelID() {
        System.out.println("personeelsID: 24562");
    }

    @Override
    void talen() {
        System.out.println("talen: Nederlands, Spaans en Engels");
    }

    @Override
    void adres() {
        System.out.println("straat: Rotterdamseweg1");
    }

    @Override
    void Email() {
        System.out.println("E-mail: Annakoning@gmail.com");
    }

    @Override
    void telefoon() {
        System.out.println("telefoon: 0684675326");
    }
}
