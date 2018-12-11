package kalkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class KalkulatorAppTest {


    @Test
    public void addTwoPosistiveIntegers() {
        //arrange
        KalkulatorApp kalkulatorek = new KalkulatorApp();

        //act
        int suma = kalkulatorek.add (1, 2);

        //assert
        Assertions.assertEquals(3, suma, "Sprawdź, że dodawanie liczb całkowitych");
    }

    @Test
    public void addTwoPositiveDoubles () {
        //arrange
        KalkulatorApp kalkulatorek = new KalkulatorApp();

        //act
        double suma = kalkulatorek.add(1.2, 2.4);

        //assert
        Assertions.assertEquals(3.6, suma, 0.0000001, "Sprawdź, że dodawanie liczba zmiennoprzecinkowych działa");
    }

    @Test
    public void Divide () {
        //arrange
        KalkulatorApp kalkulatorek = new KalkulatorApp ();

        //act
        double divide = kalkulatorek.divide(6, 3);

        //assert
        Assertions.assertEquals(2, divide, 0.0000001, "Sprawdź, że dzielenie działa");
    }
}