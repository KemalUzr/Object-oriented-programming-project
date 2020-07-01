package com.company;

//interface class
public interface Kooi {
    //hier door vermijnd je code smell large class, want ik implementeer de methodes niet in DEZE class.
    //ik vermijd duplicate code omdat, de subclasses van kooi hun eigen implentaties hebben.
    public int lengteCM();
    public int breedteCM();
    public int hoogteCM();
    public String voedingSchema();
}
