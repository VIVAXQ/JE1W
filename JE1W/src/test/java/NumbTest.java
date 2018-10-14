import static org.junit.Assert.*;

public class NumbTest {
    @org.junit.Test
    public void set() throws Exception {
        Numb numb = new Numb();
        int[] data = {1,2,3,4,5,6,7,8,9,0};
        String res1=numb.set(data);
        String res2=numb.Way1;
        String exp="(123) 456-7890";
        assertEquals(exp,res1);
    }
}