/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class FileService {
    String fileName;
    BufferedReader in;
    PrintWriter out;
    
    public FileService(String fname){
        this.fileName = fname;
    try {
     out = new PrintWriter(new FileWriter(fileName, true));
     in = new BufferedReader(new FileReader(fileName));
     
        } catch (Exception e) { e.printStackTrace();}
    }
    
    public synchronized void write(String msg){

Date date = new Date(System.currentTimeMillis());

out.println("Date: " + date);

out.println("Message: " + msg);

out.flush();
        }
}
