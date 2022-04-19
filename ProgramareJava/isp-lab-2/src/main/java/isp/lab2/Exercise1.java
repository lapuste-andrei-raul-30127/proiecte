package isp.lab2;

import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
        int n=2+(int)(Math.random()*8);
        System.out.println("n="+n);
        int v[]=new int[n];
        for(int i=0;i<n;i++){
            Scanner keybord = new Scanner(System.in);
            System.out.println("enter an integer");
            v[i] = keybord.nextInt();
        }
        return v;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        int s=0;
        for(int i=0;i<userNumbers.length;i++)
            s=s+userNumbers[i];
        return s/userNumbers.length;
            
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
