package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircusTest {

    //Deze test kijkt door middel van Decsion coverage of de gegevens van de Circus kloppen.
    /*

    Ik maak een test om te kijken of de gegevens van de circus wel kloppen, er wordt gekeken naar de naam, aantal dieren en de locatie.
    Ik heb als beslissende conditie B gekozen, want als er zelfs maar 1 dier ontsnapt kan de show niet meer door.

    Decision coverage:
        Logische (A&&B&&C)
    	conditie A	    conditie B	conditie C	    Beslissing
    	A = the MAGIC	B = 3	    C = Den-Haag	Alle 3 de gegevens kloppen
Geval 1	Waar	        Waar	    Waar	        Waar
Geval 2 Waar 	        Onwaar	    Waar	        Onwaar

        Fysiek(A&&B&&C)
        conditie A	    conditie B	conditie C	    Beslissing
        A = the MAGIC	B = 3	    C = Den-Haag	Alle 3 de gegevens kloppen, dus de show kan beginnen
Geval 1	A = the MAGIC	B = 3	    C = Den-Haag	De show kan beginnen
Geval 2	A = the MAGIC	B = 2	    C = Den-Haag	De show kan niet beginnen

     */
    @Test
    public void LtestGegevensCircus() {
        Circus circus = new Circus();
        assertEquals("the MAGIC",circus.getNaam());
        assertEquals(3,circus.getAantalDieren());
        assertEquals("Den-Haag",circus.getLocatie());
    }

    @Test
    public void FtestGegevensCircus() {
        Circus circus = new Circus();
        assertEquals("the MAGIC",circus.getNaam());
        assertNotEquals(2,circus.getAantalDieren());
        assertEquals("Den-Haag",circus.getLocatie());
    }
}