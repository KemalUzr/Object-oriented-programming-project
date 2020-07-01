package com.company;
//Long class wordt hier vermeden omdat de class Kangoeroe een extends is van class Dier.


public class Kangoeroe extends Dier {
    @Override
    public String soort() {
        String soort = "Rode reuzenkangoeroe";
        System.out.println("soort: "+soort);
        return soort;
    }

    @Override
    public int lengte() {
        int lengte = 142;
        System.out.println("lengte: "+lengte+"CM");
        return lengte;
    }

    @Override
    public int KG() {
        int KG = 43;
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
