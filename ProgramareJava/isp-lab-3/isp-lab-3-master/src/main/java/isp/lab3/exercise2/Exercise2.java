package isp.lab3.exercise2;

import java.util.Scanner;

public class Exercise2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ractangle n= new ractangle(6,8);
        String s=n.getColor() ;
        System.out.println("Culoarea este "+ s);
        System.out.println("Lungimea= "+ n.getLength());
        System.out.println("latimea "+ n.getWidth());
        System.out.println("Perimetru= "+ n.getPerimetru());
        System.out.println("Area "+ n.getArea());
        
        
    }


}
    
    
    
  

