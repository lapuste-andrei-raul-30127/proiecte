/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercitiu4;

import java.util.List;
import java.util.concurrent.Exchanger;

/**
 *
 * @author Asus
 */
public class ExchangerTestSimple {
    public static void main(String args[]){
        Exchanger<List<Integer>> exchanger =new Exchanger<List<Integer>>();
        Finn f1=new Finn(1000,exchanger,"Duke");
        Finn f2=new Finn(5000,exchanger,"Wild Wings");
        f1.start(); 
        f2.start();

}

}
