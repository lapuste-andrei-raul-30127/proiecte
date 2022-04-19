package isp.lab3;
import isp.lab3.exercise4.MyPoint;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author Asus
 */
public class MyPointTest {
    
    MyPoint i= new MyPoint(5,1,6);
        MyPoint j= new MyPoint(1,5,8);
    
    @Test
    public void testdistance() {
       
        assertEquals("distanta este 6.0 ooX  ", 6.000 , i.distance(j));
       
    }
    
}
