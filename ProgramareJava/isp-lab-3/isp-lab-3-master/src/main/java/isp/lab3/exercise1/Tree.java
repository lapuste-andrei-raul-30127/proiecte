package isp.lab3.exercise1;


public class Tree{
    public int height;
    public Tree(){
        this.height=15;
    }
    public void grow(int m){
        if(m>=1)
            this.height=this.height+m;
    }

    
    public String tostring(){
        return this.height + "";
    }
}
