package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test//Annotation
    void add_shouldReturn7_whenCalledWith5And2() {
        //Test besteht normalerweise aus den folgenden 3 Schritten:
        //GIVEN -> Bekannter Wert
        int a = 5;
        int b = 2;
        int expected = 7;

        //WHEN -> Tatsächlicher Methodenaufruf
        int actual = Main.add(a, b);
        //THEN -> Vergleich Erwartung mit Realität
        assertEquals(expected, actual);
    }

    @Test//Annotation
    void add_shouldReturn10_whenCalledWith5And5() {
        //Test besteht normalerweise aus den folgenden 3 Schritten:
        //GIVEN -> Bekannter Wert
        int a = 5;
        int b = 5;
        int expected = 10;

        //WHEN -> Tatsächlicher Methodenaufruf
        int actual = Main.add(a, b);
        //THEN -> Vergleich Erwartung mit Realität
        assertEquals(expected, actual);
    }

    @Test//Annotation
    void add_shouldReturn4_whenCalledWith2And2() {
        //Kompakte Schreibweise:
        assertEquals(4, Main.add(2, 2));
    }
}