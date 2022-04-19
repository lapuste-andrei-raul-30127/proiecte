package isp.lab3.exercise3;

public class Exercise3 {
     public static void main(String[] args) {
        vehicul n= new vehicul("Bugati","Chiron",39,'D');
        vehicul m= new vehicul("Bugati","Chiron",380,'D');
        System.out.println("Model= "+ n.getModel());
        System.out.println("Type= "+ n.getType());
        System.out.println("Speed= "+ n.getSpeed());
        System.out.println("Fuel= "+ n.getFuel());
        
        if(m.getModel().equals(n.getModel()) && m.getType().equals(n.getType()) &&  m.getSpeed()==n.getSpeed() && m.getFuel()==n.getFuel())
            System.out.println("Sunt egale");
        else System.out.println("Nu sunt egale");
    }
}
