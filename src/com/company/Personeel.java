package com.company;

public abstract class Personeel {
    abstract void naam();
    abstract void persooneelID();
    abstract void talen();
    abstract void adres();
    abstract void Email();
    abstract void telefoon();

    //template pattern
    //hier door vermijnd je code smell lange methode, in 1 methode vraag je alles aan.
    public final void personeelsBestand(){
        naam();
        persooneelID();
        talen();
        adres();
        Email();
        telefoon();
    }
}
