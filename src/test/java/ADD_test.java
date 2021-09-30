import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ADD_test {

    ADD add;
    @Before
    public void setup(){
        add = new ADD();
    }

    @Test
    public void checkEmpty() throws Exception{
      String test1 = "";
      int testRes1 = add.printResult(test1);

      Assert.assertEquals(0,testRes1);
    }

    @Test
    public void returnSingleNum() throws Exception{
        String test2 = "1";
        int testRes2 = add.printResult(test2);

        Assert.assertEquals(1,testRes2);
    }
    @Test
    public void twoNumberSum() throws Exception{
        String test3 = "1,2";
        int testRes3 = add.printResult(test3);

        Assert.assertEquals(3,testRes3);
    }
    @Test
    public void newLinesBetweenTwoNumbers() throws Exception{
       String test4 = "1\n2";
       int testRes4 = add.printResult(test4);

       Assert.assertEquals(3,testRes4);
    }
    @Test
    public void newLineBetweenNumbers() throws Exception{
     String test5 = "1\n2,3";
     int testRes5 = add.printResult(test5);

     Assert.assertEquals(6,testRes5);
    }
    @Test(expected=Exception.class)
    public void testNegNum() throws Exception{
        String test6 = "-1,3"; // We can use either one number or more than one, but it should throw exception for at least one
        add.printResult(test6);

    }
}
