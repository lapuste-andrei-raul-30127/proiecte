/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer1;

/**
 *
 * @author Asus
 */
public class Fus extends Thread {
    Resursa res;
    Fus(Resursa res){
        this.res=res;
    }
    @Override
    public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.println(this.getName()+" am scris "+i);
            res.set(i);
        }
    }
    
}
