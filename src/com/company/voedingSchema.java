package com.company;

//Longclass is hier ook vermeden.
public class voedingSchema {
    static private voedingSchema instance;

    private voedingSchema(){
        System.out.println(welkevoedingGrootKooi());
    }

    public static voedingSchema getInstance(){
        if(instance == null){
            instance = new voedingSchema();
        }
        return instance;
    }

//    private String kleinKooi ="Voeding schema kleine kooi voor de Kangaroo is: 10kg hooi om 11:00 en 10kg hooi om 17:00.";
//    private String middelKooi ="Voeding schema middel kooi voor de Leeuw is: 15kg vlees om 11:00 en 10kg vlees om 17:00.";
//    private String grootKooi ="Voeding schema groot kooi voor de Buffallo is: 25kg hooi om 11:00 en 20kg hooi om 17:00.";

//    public String welkeVoeding(){
//        //code smells, geen swtich statements.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("maak keuze uit kleinkooi, middelkooi of grootkooi.");
//        String keuzeVoedingSchema = scanner.nextLine();
//
// //code smell duplicate code vermededen door het gerbuiken van variablele kleinkooi, anders zou ik de zin veer moeten schrijven.
//        //code smell, geen switch statements/ lange if statements.
//        if (keuzeVoedingSchema.equals("kleinkooi")){ System.out.println(kleinKooi); }
//        else if (keuzeVoedingSchema.equals("middelkooi")){ System.out.println(middelKooi); }
//        else if (keuzeVoedingSchema.equals("grootkooi")){ System.out.println(grootKooi); }
//        return null;
//    }


    //Ik heb express commentaar van boven achtergelaten zodat u ziet wat ik voormalig fout deed.

    //Ik vermijd hier de codesmell dublicate code, omdat ik de voedingschema van groot kooi gelijk uit grootkooi pak.
    //eerst deed ik Sting grootKooi = "..." regel (19), wat dublicate code zou zijn aangezien ik al een String heb
    //in grootKooi met dezelfde tekst.
    public String welkevoedingGrootKooi(){
        grootKooi infoGrootKooi = new grootKooi();
        return infoGrootKooi.voedingSchema();
    }

}
