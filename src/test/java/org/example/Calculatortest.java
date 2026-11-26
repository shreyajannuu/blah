
package org.example;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Calculatortest {

    Calculator obj = new Calculator();

    @Test
    public void testAddition() {

        int result = obj.add(10, 5);

        Reporter.log("Addition Result: " + result, true);

        Assert.assertEquals(result, 15);
    }

    @Test
    public void testMultiplication() {

        int result = obj.multiply(4, 5);

        Reporter.log("Multiplication Result: " + result, true);

        Assert.assertEquals(result, 20);
    }
}
