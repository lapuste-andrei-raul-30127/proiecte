package isp.lab4.exercise2;



import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FireAlarmTest {
    FireAlarm dd=new FireAlarm(false);
    
    @Test
    public void isActiveTest(){
    assertEquals("E nu activ",false,dd.isActive());
    }
    
     @Test
    public void setActiveTest(){
    dd.setActive();
    assertEquals("E activ",true,dd.isActive());
    }
}
