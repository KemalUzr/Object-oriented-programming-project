package com.company;

public class Main {

    public static void main(String[] args) {
        //vraagt alle informatie op circus.
        Circus circus = new Circus();
        circus.getAlles();
        System.out.println("");

        //vraagt de voedingschema van grootKooi(Singleton)
        voedingSchema.getInstance();
        System.out.println("");

        //vraag afmetingen van "kleinKooi".
        Kooi kooi = new kleinKooi();
        System.out.println("klein kooi: "+kooi.lengteCM() +"cm lang, "+kooi.breedteCM()+"cm breed en "+ kooi.lengteCM()+"cm hoog");
        System.out.println("");

        //haalt personeels gegevens van de kantoorwerknemer.
        Personeelslid personeel = new Kantoorwerknemer();
        personeel.personeelsBestand();
        System.out.println("");

        //haalt gegevens van de Buffalo.
        Dier dier = new Buffallo();
        dier.dierGegevens();
    }
}
