/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Asus
 */
public class Lab5_ex1 {
    public static void main(String[] args){
        Integer monitor = new Integer(1);
        Integer monitor2= new Integer(1);
    new ExecutionThread2(monitor ,2,4,8,11 ).start();
    new ExecutionThread(monitor ,monitor2,3,6,9,12 ).start();
    new ExecutionThread2(monitor2, 2,5,10,13 ).start();
        
    }
}
