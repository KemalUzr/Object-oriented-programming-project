package com.company;

public abstract class Dier {
    abstract String soort();
    abstract int lengte();
    abstract int KG();
    abstract char geslacht();

    //template pattern
    //hier door vermijnd je code smell lange methode, in 1 methode vraag je alles aan.
    public final void dierGegevens(){
        soort();
        lengte();
        KG();
        geslacht();
    }
}
