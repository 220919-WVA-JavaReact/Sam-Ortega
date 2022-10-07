import com.revature.TheHighest;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestIntTest {

    static TheHighest aa;

    @BeforeClass
    public static void setUp(){
        aa = new TheHighest();
    }

    @Test
    public void highestIntPositiveTest(){

        int[] a = {10, 32, 7, 13, 6};

       Assert.assertEquals(32, aa.highestInt(a));
    }
}
