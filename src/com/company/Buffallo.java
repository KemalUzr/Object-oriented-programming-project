package com.company;

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
