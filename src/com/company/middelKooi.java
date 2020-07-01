package com.company;

public class middelKooi implements Kooi {
    @Override
    public int lengteCM() {
        return 300;
    }

    @Override
    public int breedteCM() {
        return 300;
    }

    @Override
    public int hoogteCM() {
        return 200;
    }

    @Override
    public String voedingSchema() {
        return "Voeding schema middel kooi voor de Leeuw is: 15kg vlees om 11:00 en 10kg vlees om 17:00.";
    }
}
