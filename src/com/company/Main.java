package com.company;

public class Main {

    public static void main(String[] args) {
        //vraagt alle informatie op circus.
        com.company.Circus circus = new com.company.Circus();
        circus.getAlles();

        //haalt personeels gegevens van de kantoorwerknemer.
        Personeel personeel = new Kantoorwerknemer();
        personeel.personeelsBestand();

        //haalt gegevens van de Buffalo.
        Dier dier = new Buffallo();
        dier.dierGegevens();

        //vraag afmetingen van "kleinKooi".
        Kooi kooi = new kleinKooi();
        System.out.println("klein kooi: "+kooi.lengteCM() +"cm lang, "+kooi.breedteCM()+"cm breed en "+ kooi.lengteCM()+"cm hoog");

        //vraagt informatie op van wat de voedingschema per kooi is met de bijhoorende dier.
        voedingSchema voedingSchema = new voedingSchema();
        voedingSchema.welkeVoeding();

    }
}