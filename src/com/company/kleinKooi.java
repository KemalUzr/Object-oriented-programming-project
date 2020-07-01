package com.company;

public class kleinKooi implements Kooi {
    @Override
    public int lengteCM() {
        return 250;
    }

    @Override
    public int breedteCM() {
        return 250;
    }

    @Override
    public int hoogteCM() {
        return 200;
    }

    @Override
    public String voedingSchema() {
        return "Voeding schema kleine kooi voor de Kangaroo is: 10kg hooi om 11:00 en 10kg hooi om 17:00.";
    }
}
