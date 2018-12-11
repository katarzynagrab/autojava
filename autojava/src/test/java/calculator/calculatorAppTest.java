package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calculatorAppTest {


    @Test
    public void addTwoPosistiveIntegers() {
        //arrange
        calculatorApp calc = new calculatorApp();

        //act
        int suma = calc.add (1, 2);

        //assert
        Assertions.assertEquals(3, suma, "Sprawdź, że dodawanie liczb całkowitych");
    }

    @Test
    public void addTwoPositiveDoubles () {
        //arrange
        calculatorApp calc = new calculatorApp();

        //act
        double suma = calc.add(1.2, 2.4);

        //assert
        Assertions.assertEquals(3.6, suma, 0.0000001, "Sprawdź, że dodawanie liczba zmiennoprzecinkowych działa");
    }

    @Test
    public void Divide () {
        //arrange
        calculatorApp calc = new calculatorApp();

        //act
        double divide = calc.divide(6, 3);

        //assert
        Assertions.assertEquals(2, divide, 0.0000001, "Sprawdź, że dzielenie działa");
    }
}