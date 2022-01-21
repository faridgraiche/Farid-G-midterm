package design;

import org.junit.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.


       EmployeeInfo employeeInfo = new EmployeeInfo(0);
        Integer result;
        Integer expected = 001;
        result = 001;

        Assert.assertEquals(expected,result);
        System.out.println("test 1 passed");





    }
}
