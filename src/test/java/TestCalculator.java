import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

@Test
    public void test1plus1()
    {
        ///AAA
        //arrange = organiser
        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 2 ;

        //act = action
        int returnedResult = calculator.add(arg1,arg2);
 //tettttts
        //Assert
        Assert.assertEquals(expectedResult, returnedResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)

    public void testMax()
    {
        ///AAA
        //arrange = organiser
        int arg1 = Integer.MAX_VALUE;
        int arg2 = 1;

        //act = action
        int returnedResult = calculator.add(arg1,arg2);


    }
    @Test
    public void faildTest()
    {

        int arg1 = 1;
        int arg2 = 1;
        int expectedResult = 3;

        //act = action
        int Result = calculator.add(arg1,arg2);
        Assert.assertEquals(expectedResult, Result);

    }


}
