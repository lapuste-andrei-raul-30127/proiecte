package isp.lab1;


import java.util.logging.Logger;

/**
 * @author mihai.hulea
 */
public class MathBasicOperations {

    public static Logger LOG = Logger.getLogger( MathBasicOperations.class.getName() );

    /**
     * Add x and y.
     * @param x
     * @param y
     * @return result of the sum.
     */
    public static int add(int x, int y){
        return x + y;
    }

    public static int substract(int x, int y){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("It works!");
        LOG.info("It works!");
        System.out.println("Number of arguments received: "+args.length+" ");
        for(String arg:args)
            System.out.println("Argument: "+arg);
        System.out.printf("Result of adding %d with %d is: %d\n\n",10,23, MathBasicOperations.add(10,23));
    }
    public static int multiply(int x,int y){
        return x*y;  
        }
    }

