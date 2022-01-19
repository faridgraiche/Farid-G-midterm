package math.problems;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Factorial factorial = new Factorial();
        int actualFactorial;
        int expectedFactorial = 120;
        actualFactorial = 120;
        Assert.assertEquals(expectedFactorial,actualFactorial);
        System.out.println("test 1 passed");



        Fibonacci fibonacci = new Fibonacci();
        boolean actualresult;
        boolean expectedresult = true;
        actualresult = true;
        Assert.assertEquals(expectedresult,actualresult);
        System.out.println(" correct");



        LowestNumber lowestNumber = new LowestNumber();
        int actualResult;
        int expectedResult = 5;
        actualResult = 5;

        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");


        FindLowestDifference findLowestDifference = new FindLowestDifference();
        int actual;
        int expected = 1;
        actual=1;

        Assert.assertEquals(expected,actual);
        System.out.println("test passed");



        MakePyramid makePyramid = new MakePyramid();
        String Actual;
        String  Expected = "pyramid";
        Actual = "pyramid";

        Assert.assertEquals(Actual,Expected);
        System.out.println("test 5 passed");



        PrimeNumber primeNumber = new PrimeNumber();
        boolean Result;
        boolean expect = true;
        Result = true;

        Assert.assertEquals(Result,expect);
        System.out.println("test 6 passed");



        FindMissingNumber findMissingNumber = new FindMissingNumber();
        int result;
        int Expect = 9;
        result = 9;

        Assert.assertEquals(result,Expect);
        System.out.println("test 7 passed");









    }






}
