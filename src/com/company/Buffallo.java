package com.company;
//hier heb ik large class vermeden omdat ik in 'Dier' mijn template methode heb staan, waardoor ik het niet opnieuw in buffalo hoef te schrijven.
//Hier implementeer ik de methodes uit dier.
public class Buffallo extends Dier {
    @Override
    public String soort() {
        String soort = "water buffalo";
        System.out.println("soort: "+soort);
        return soort;
    }

    @Override
    public int lengte() {
        int lengte = 260;
        System.out.println("lengte: "+lengte+"CM");
        return lengte;
    }

    @Override
    public int KG() {
        int KG = 367;
        System.out.println("gewicht: "+KG+"KG");
        return KG;
    }

    @Override
    public char geslacht() {
        char geslacht = 'M';
        System.out.println("geslacht: "+geslacht);
        return geslacht;
    }
}
