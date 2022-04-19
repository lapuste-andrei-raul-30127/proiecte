/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercitiu4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 *
 * @author Asus
 */
public class Finn extends Thread{
    List<Integer> list=new ArrayList<Integer>();
    int sleepTime;
    Exchanger<List<Integer>> exchanger;
    String nume;

    Finn(int sT, Exchanger<List<Integer>> exchanger,String nume){
        this.sleepTime=sT;
        this.exchanger=exchanger;
        this.nume=nume;
}

public void afisLista(){

System.out.println(this.nume+list);

}

    @Override
    public void run(){
    
    int noElem=(int)Math.round(Math.random()*3+1);
    for(int i=0;i<noElem;i++)
    {
    
    int elem=(int)Math.round(Math.random()*100);
    list.add(elem);
    }

this.afisLista();//afis lista inainte de schimb
try {
    Thread.sleep(this.sleepTime);//firul asteapta x ms
    //se face schimbul de obiecte
    this.list=exchanger.exchange(this.list);
    
     } catch (InterruptedException e) {
        e.printStackTrace();
    }
this.afisLista();//afis lista dupa schimb

    }
}
