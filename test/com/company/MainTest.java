package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void checkName(){
        String naam = "the MAGIC";
        Circus circus = new Circus();
        assertEquals(naam,circus.getNaam());
    }
    @Test
    public void checkAantalDieren(){
        Circus circus = new Circus();
        assertEquals(3,circus.getAantalDieren());
    }
    @Test
    public void checkLocatie() {
        String locatie = "Den-Haag";
        Circus circus = new Circus();
        assertEquals(locatie, circus.getLocatie());
    }
}