import org.junit.Test;

import static org.junit.Assert.*;

public class ClqTest2 {
    @Test
    public void res() throws Exception {
        Clq clq = new Clq();
        int data1 = 2;
        int[] data2 = {50,100};
        Boolean exp = false;
        assertEquals(exp,clq.res(data1,data2));
    }

}