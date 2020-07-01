package com.company;

//interface class met factory pattern.
public interface Kooi {
    //hier door vermijnd je code smell lange methode, in 1 methode vraag je alles aan.
    public int lengteCM();
    public int breedteCM();
    public int hoogteCM();
    public String voedingSchema();
}
