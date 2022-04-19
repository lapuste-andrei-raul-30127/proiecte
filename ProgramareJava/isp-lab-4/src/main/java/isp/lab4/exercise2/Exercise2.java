package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] arg){
        FireAlarm dd=new FireAlarm(false);
        System.out.println(dd.toString());
        dd.setActive();
        System.out.println(dd.toString());
    }
}
