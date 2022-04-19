
package exer1;

public class centru {
    public static void main(String[] args) {
            Resursa res=new Resursa();
            Fus fs=new Fus(res);
            Fisc fc=new Fisc(res);
            fs.start();
            fc.start();
    }
}
