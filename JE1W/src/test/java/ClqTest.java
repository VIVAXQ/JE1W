import org.junit.Test;

import static org.junit.Assert.*;

public class ClqTest {
    @Test
    public void res() throws Exception {
        Clq clq = new Clq();
        int data1 = 4;
        int[] data2 = {25,25,50,100};
        Boolean exp = true;
        assertEquals(exp,clq.res(data1,data2));
    }

}