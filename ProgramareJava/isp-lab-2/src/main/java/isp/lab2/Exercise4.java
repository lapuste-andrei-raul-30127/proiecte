package isp.lab2;

public class Exercise4 {

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
     * This method should get the first(by position) odd number from the given array
     *
     * @param someNumbers the given int array
     * @return first odd number from the array
     */
    public static int firstOdd(int[] someNumbers) {
        int x=-1;
        for(int i=0;i<someNumbers.length;i++)
            if(someNumbers[i]%2==1)
            {x=i;break;}
        return x;
    }

    /**
     * This method should get the first(by position) even number from the given array
     *
     * @param someNumbers the given int array
     * @return first even number from the array
     */
    public static int firstEven(int[] someNumbers) {
        int x=-1;
        for(int i=0;i<someNumbers.length;i++)
            if(someNumbers[i]%2==0)
            { x=i;
             break;}
        return x;
    }

    /**
     * This method should get the first(by position) prime number from the given array
     *
     * @param someNumbers the given int array
     * @return first prime number from the array
     */
    public static int firstPrime(int[] someNumbers) {
        int x=-1;
        for(int i=0;i<someNumbers.length;i++)
            if(isPrimeNumber(someNumbers[i])==true)
            {x= i;
            break;
            }
        return x;
        
    }

    /**
     * Don't forget to also display the position of ech number
     */
    public static void main(String[] args) {
        int[] someNumbers = new int[]{15, 18, 13, 22, 21, 11, 57, 141, 563, 16};

        System.out.println("First odd number: " + someNumbers[firstOdd(someNumbers)]);
        System.out.println("First even number: " + someNumbers[firstEven(someNumbers)]);
        System.out.println("First prime number: " + someNumbers[firstPrime(someNumbers)]);
    }
}
