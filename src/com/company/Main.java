package com.company;

public class Main {

    public static void main(String[] args) {
        //vraagt alle informatie op circus.
        com.company.Circus circus = new com.company.Circus();
        circus.getAlles();

        //vraagt informatie op van wat de voedingschema per kooi is met de bijhoorende dier.
        voedingSchema voedingSchema = new voedingSchema();
        voedingSchema.welkeVoeding();

        //haalt personeels gegevens van de kantoorwerknemer.
        Personeel personeel = new Kantoorwerknemer();
        personeel.personeelsBestand();


    }
}