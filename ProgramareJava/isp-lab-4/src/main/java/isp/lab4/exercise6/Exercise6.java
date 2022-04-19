package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] arg){
        ComissionEmployee ex1= new ComissionEmployee("Ellan","Sting",23,40);
        ComissionEmployee ex11= new ComissionEmployee("Ellan","Sting",23,40);
        
        HourlyEmployee ex2= new HourlyEmployee("Fillip","Stan",2300,36);
        HourlyEmployee ex22= new HourlyEmployee("Fillip","Stan",2300,36);
        
        SalariedEmployee ex3= new SalariedEmployee("Andrei","Dragomir",3000);
        SalariedEmployee ex33= new SalariedEmployee("Andrei","Dragomir",3000);
        
        System.out.println(ex1.getFirstName() + " "+ex1.PaymentAmount());
        System.out.println(ex2.getFirstName() + " "+ex2.PaymentAmount());
        System.out.println(ex3.getFirstName() + " "+ex3.PaymentAmount());
         
        Employee[] v={ex1,ex11,ex2,ex22,ex3,ex33};
        double s;
        s = 0;
        for(int i=0;i<6;i++)
            s=s+v[i].PaymentAmount();
        System.out.println("Salariul total:"+s);
    }
}
