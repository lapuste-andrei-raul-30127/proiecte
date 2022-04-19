package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mihai.hulea
 */
public class TreeTest {

    @Test
    public void testgrow() {
        Tree t= new Tree();
        assertEquals("t should be 15  ", 15, t.height);
        t.grow(5);
        assertEquals("t should be 20 ", 20, t.height);      

    }
    @Test
    public void testtostring(){
       Tree t = new Tree();
       String s=t.tostring();
       assertEquals("t should be 15 , t is :", "15", s);
       
    }

   
    

}
