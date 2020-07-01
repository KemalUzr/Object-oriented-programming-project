package com.company;

public class Leeuw extends Dier {
    @Override
    public String soort() {
        String soort = "transvaal leeuw";
        System.out.println("soort: "+soort);
        return soort;
    }

    @Override
    public int lengte() {
        int lengte = 173;
        System.out.println("lengte: "+lengte+"CM");
        return lengte;
    }

    @Override
    public int KG() {
        int KG = 181;
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
