package isp.lab3.exercise4;
import java.lang.Math;

public class MyPoint {
    private int x,y,z;
    public MyPoint(){
        x=y=z=0;
    }
    public MyPoint(int x1,int y1,int z1){
        this.x=x1;
        this.y=y1;
        this.z=z1;
    }
    public void setXYZ(int x1,int y1,int z1){
        this.x=x1;
        this.y=y1;
        this.z=z1;
    }
    
    public int getX(){
        return this.x;
    }
    public void setX(int x1){
        this.x=x1;
    }
    
    public int getY(){
        return this.y;
    }
    public void setY(int y1){
        this.y=y1;
    }
    
    public int getZ(){
        return this.z;
    }
    public void setZ(int z1){
        this.z=z1;
    }
     
    public double distance(MyPoint m){
        return Math.sqrt( Math.pow(this.getX()-m.getX(),2) + Math.pow(this.getY()-m.getY(),2) + Math.pow(this.getZ()-m.getZ(),2));
    }
    
    public void tostring(){
        System.out.println('('+this.x+','+this.y+','+this.z+')');
    }
}
