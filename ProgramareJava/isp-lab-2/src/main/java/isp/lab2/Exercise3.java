package isp.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        if(number <2)
            return false;
        else if(number==2)
            return true;
        else if(number%2==0)
            return false;
        else
            for(int i=3; i<number/2; i=i+2){
                if(number%i==0){
                    return false;             
                }
            }
        return true;
    }
    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
        int sum=0;
        while(number!=0){
            sum=sum+number%10;
            number=number/10;
        }
        return sum;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
        //i=sourceIndex; j=targetIndex;
        int []arr;
        arr = new int [b-a];
        int j;
        j=0;
            for(int i=a; i<=b; i++){
            if(isPrimeNumber(i)==true){
                arr[j++]=i;
                }
            }
            int []newArr;
            newArr = new int[j];
            System.arraycopy(arr, 0, newArr, 0, j);
        return newArr;
    }
    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
        public static double calculateGeometricMean(int[] primeNumbers) {
            double prod;
            prod=1.0;
            for(int i=0; i<primeNumbers.length; i++){
                prod=prod*primeNumbers[i];
            }
            double media=Math.pow(prod,(double)1.0/primeNumbers.length);
            return media;
        }
    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        int num;
        num=0;
        for(int i=0; i<primeNumbers.length; i++){
            if(calculateSumOfDigits(primeNumbers[i])%2==0){
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int a;
        int b;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a=keyboard.nextInt();
        System.out.println("Enter value of b: ");
        b=keyboard.nextInt();
        System.out.println(Arrays.toString(getPrimeNumbersFromInterval(a,b)));
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
