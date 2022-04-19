/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer3;

/**
 *
 * @author Asus
 */
public class centru2 {
    public static void main(String[] args) {

Integer monitor = new Integer(1);

new ExecutionThread(monitor, 2, 4, 3, 6).start();

new ExecutionThread(monitor, 3, 5, 4, 7).start();

}
}
