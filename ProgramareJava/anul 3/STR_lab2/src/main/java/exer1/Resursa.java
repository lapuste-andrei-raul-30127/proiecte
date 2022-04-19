
package exer1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Resursa {
    int r;

    /**
     *
     * @param a
     */
    synchronized public void set(int a)
        {this.r=a;
        try {
            wait(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Resursa.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    /**
     *
     * @return
     */
    synchronized public int get()
        {
        try {
            wait(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Resursa.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        return r;
        }
}
