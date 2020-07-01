package com.company;

public class grootKooi implements Kooi {
    @Override
    public int lengteCM() {
        return 400;
    }

    @Override
    public int breedteCM() {
        return 400;
    }

    @Override
    public int hoogteCM() {
        return 300;
    }

    @Override
    public String voedingSchema() {
        return "Voeding schema groot kooi voor de Buffallo is: 25kg hooi om 11:00 en 20kg hooi om 17:00.";
    }
}
