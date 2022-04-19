
package exer1;


public class Fisc extends Thread{
    Resursa res;
    public Fisc(Resursa res){
        this.res=res;
    }
    @Override
    public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.println(this.getName()+" am citit "+res.get());
        }
    }
}
