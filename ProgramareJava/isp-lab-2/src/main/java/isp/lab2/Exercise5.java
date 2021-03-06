package isp.lab2;

public class Exercise5 {

    /**
     * This method should generate an array that have 20 random numbers between -1000 and 1000
     *
     * @return the random numbers
     */
    public static int[] generateRandomNumbers() {
       int x=(int)(Math.random()*2000 -1000);
        int[] v=new int[20];
        for(int i=0;i<20;i++)
            {x=(int)(Math.random()*2000 -1000);
            v[i]=x;
            }
        return v; 
    }

    /**
     * This method should sort the given random numbers
     *
     * @param randomNumbers numbers generated random
     * @return sorted int array
     */
    public static int[] getSortedNumbers(int[] randomNumbers) {
        int h;
        for(int i=0;i<20;i++)
            for(int j=i+1;j<20;j++)
                if(randomNumbers[i]>randomNumbers[j])
                    {
                        h=randomNumbers[i];
                        randomNumbers[i]=randomNumbers[j];
                        randomNumbers[j]=h;
                    }
        return randomNumbers;
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        //display the sorted numbers
        System.out.println("The sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
           System.out.print(sortedNumbers[i] + ", ");
        }
    }
}
