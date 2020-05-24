package com.company;


import java.util.Scanner;

public class voedingSchema {
    private String kleinKooi ="Voeding schema kleine kooi voor de Kangaroo is: 10kg hooi om 11:00 en 10kg hooi om 17:00.";
    private String middelKooi ="Voeding schema middel kooi voor de Leeuw is: 15kg vlees om 11:00 en 10kg vlees om 17:00.";
    private String grootKooi ="Voeding schema groot kooi voor de Buffallo is: 25kg hooi om 11:00 en 20kg hooi om 17:00.";

    public String welkeVoeding(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("maak keuze uit kleinkooi, middelkooi of grootkooi.");
        String keuzeVoedingSchema = scanner.nextLine();

//code smell duplicate code vermededen door het gerbuiken van variablele kleinkooi, anders zou ik de zin veer moeten schrijven.
        if (keuzeVoedingSchema.equals("kleinkooi")){ System.out.println(kleinKooi); }
        else if (keuzeVoedingSchema.equals("middelkooi")){ System.out.println(middelKooi); }
        else if (keuzeVoedingSchema.equals("grootkooi")){ System.out.println(grootKooi); }
        return null;
    }
}
