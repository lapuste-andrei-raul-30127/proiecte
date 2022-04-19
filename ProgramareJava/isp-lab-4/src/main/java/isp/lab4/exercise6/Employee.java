/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab4.exercise6;

/**
 *
 * @author Asus
 */
public class Employee {
    private String firstName;
    private String lastName;
    
    public Employee(String fN,String lN){
        this.firstName=fN;
        this.lastName=lN;
    }
    /**
     *
     * @return
     */
    public double PaymentAmount(){return 0;};
    
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
}
