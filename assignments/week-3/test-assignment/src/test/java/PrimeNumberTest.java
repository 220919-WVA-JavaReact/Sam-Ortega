import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import com.revature.PrimeNumber;


public class PrimeNumberTest {
    static PrimeNumber num;

    @BeforeClass
    public static void setUp(){
        num = new PrimeNumber();
    }

    @Test
    public void isPrimeNumberTest(){
        System.out.println("Testing Prime Number Test");
        Assert.assertTrue("That is a not prime number",num.isPrime(2));
    }

}
