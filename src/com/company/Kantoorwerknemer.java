package com.company;

public class Kantoorwerknemer extends Personeel{
    @Override
    void naam() {
        System.out.println("naam: Gert de Berg");
    }

    @Override
    void persooneelID() {
        System.out.println("personeelsID: 73452");
    }

    @Override
    void talen() {
        System.out.println("talen: Nederlands en Engels");
    }

    @Override
    void adres() {
        System.out.println("straat: Amsterdamseweg1");
    }

    @Override
    void Email() {
        System.out.println("E-mail: Gertdeberg@gmail.com");
    }

    @Override
    void telefoon() {
        System.out.println("telefoon: 0683695475");
    }
}
