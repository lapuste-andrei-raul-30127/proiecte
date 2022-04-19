package isp.lab3.exercise2;

public class ractangle {
    private int l=2;
    private int h=1;
    private String color="red";
    
    public ractangle(){
        this.l=2;
        this.h=1;
        this.color="red";
    }
    public ractangle(int a,int b){
        this.l=a;
        this.h=b;
    }
    public ractangle(int a,int b,String k){
        this.l=a;
        this.color=k;
        this.h=b;
    }
    
    public int getLength(){
        return this.l;
    }
    public int getWidth(){
        return this.h;
    }
    public String getColor(){
        return this.color;
    }
    public int getPerimetru(){
        return this.l*2+this.h*2;
    }
    public int getArea(){
        return this.l*this.h;
    }
    
}
