package com.company;

public class Schoonmaker extends Personeel {
    @Override
    void naam() {
        System.out.println("naam: Jan de Jong");
    }

    @Override
    void persooneelID() {
        System.out.println("personeelsID: 62453");
    }

    @Override
    void talen() {
        System.out.println("talen: Nederlands");
    }

    @Override
    void adres() {
        System.out.println("straat: Haagseweg1");
    }

    @Override
    void Email() {
        System.out.println("E-mail: Jandejong@gmail.com");
    }

    @Override
    void telefoon() {
        System.out.println("telefoon: 0659983872");
    }

}
