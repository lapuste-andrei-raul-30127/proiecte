package isp.lab8.carparkaccess;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class CarParkingAccessApp {
    
    
    
    public static int main(String[] args) {
        
        try{  
        BufferedReader br=new BufferedReader(new FileReader(".\\AccessLog.txt"));
        
        int x;
        String s,s1,s2;
        List<PastLogs> Arhiva=new ArrayList<PastLogs>();
        while(null!=(s=br.readLine())){
            s1=br.readLine();
            s2=br.readLine();
            Arhiva.add(new PastLogs(s,s1,s2));
        }
        br.close();
        
        
        
        
        ParkingManagmentSystem mgg=new ParkingManagmentSystem(6);
        Scanner keyboard=new Scanner(System.in);
        
        
        while(true)
        {
            System.out.print("1.Parcheaza masina 2.Afiseaza masini parcate 3.Paraseste parcarea 4.Arhiva 5.Istoric masina 6.Masini unice 7.Save:");
            x=keyboard.nextInt();
            switch(x){
                case 1:{
                    System.out.print("Numar masina:");
                    s=keyboard.next();
                    s+=keyboard.nextLine();
                    mgg.enterParkingLot(new Car(s));
                    break;
                       }
                case 2:{mgg.parcare();break;}
                
                case 3:{System.out.print("Numar masina:");
                        s=keyboard.next();
                        s+=keyboard.nextLine();
                        PastLogs t=null;
                        t=mgg.existParkedCar(new Car(s));
                        if(t!=null)
                            Arhiva.add(t);
                       break;
                        }
                case 4:{
                    Arhiva.forEach(i -> {
                        System.out.println(i.car+" "+i.time+" "+i.Cost);
                });
                    break;}
                case 5:{
                    System.out.print("Numar masina:");
                    s=keyboard.next();
                    s+=keyboard.nextLine();
                    for(PastLogs i:Arhiva){
                           if(i.car.equals(s)){
                               System.out.println(i.car+" "+i.time+" "+i.Cost);
                           }
                       }
                }
                case 6:{
                    for(PastLogs i:Arhiva){
                        x=Arhiva.indexOf(i);
                        if(x==Arhiva.lastIndexOf(i) && x>=0)
                            System.out.println(i.car+" "+i.time+" "+i.Cost);
                       }
                }
                case 7:{
                    BufferedWriter f=new BufferedWriter(new FileWriter(".\\AccessLog.txt"));///daca adaugam true in FileWriter nu se vor mai sterge elementele din fisier
                       for(PastLogs i:Arhiva){
                           if(i!=null){
                               i.SaveData(f);
                           }
                       }
                       f.close();
                       break;}
                default:{return 0;}
            }
            
            
        }
        
        }catch(Exception e){
            System.out.println("Fisierul nu a putut fi gasit/deschis");
            return 0;
        }
        
        
        
    }
        
}
