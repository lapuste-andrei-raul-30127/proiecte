package isp.lab2;

import java.util.Scanner;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int[] v=new int[n];
        v[0]=1;
        v[1]=2;
        for(int i=2;i<n;i++)
            v[i]=v[i-1]*v[i-2];
        return v;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param v
     * @param n the length of teh generated vector
     * @param i
     * @return the generated vector
     */
    public static void generateRandomVectorRecursively(int[] v,int n,int i) {
        if(i<n)
        {
        v[i]=v[i-2]*v[i-1];
        generateRandomVectorRecursively(v,n,i+1);
        }
        
    }

    public static void main(String[] args) {
        // TODO: print the vectors
        int n;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n=keyboard.nextInt();
        int[] vector1=generateVector(n);
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + ", ");  
        }
        int[] vector2= new int[n];
        vector2[0]=1;
        vector2[1]=2;
        System.out.println();  
        generateRandomVectorRecursively(vector2,n,2);
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + ", ");  
        }
    }
}
