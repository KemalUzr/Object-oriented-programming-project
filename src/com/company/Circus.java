package com.company;

public class Circus {
    private String naam = "the MAGIC";
    private int aantalDieren = 3;
    private String locatie = "Den-Haag";

    public String getNaam() {
        System.out.println(naam);
        return naam;
    }

    public int getAantalDieren() {
        System.out.println(aantalDieren);
        return aantalDieren;
    }

    public String getLocatie() {
        System.out.println(locatie);
        return locatie;
    }

    //code smell long method vermeden door getAlles te gebruiken, anders zou je 1 voor 1 de gegevens moeten aanvragen.
    public String getAlles() {
        String alles = "naam: "+naam +" aantal dieren: "+ aantalDieren +" en locatie is: "+ locatie+".";
        System.out.println(alles);
        return alles;
    }
}
