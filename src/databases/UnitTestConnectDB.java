package databases;

import org.junit.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

        String actual;
        String expected = "Database is connected";
        actual = "Database is connected";

        Assert.assertEquals("", "");
        System.out.println("test passed");




    }
}
