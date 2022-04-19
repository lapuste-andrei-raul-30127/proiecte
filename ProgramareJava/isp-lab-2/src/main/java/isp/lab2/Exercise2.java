package isp.lab2;

import java.util.Scanner;

public class Exercise2 {

    /**
     * This method should ask user to enter an int which represent
     * the number of points a team have
     *
     * @return the number of points entered by user
     */
    private static int readNumberOfPoints() {
        Scanner keybord = new Scanner(System.in);
        int x = keybord.nextInt();
        return x; 
    }

    /**
     * This method should return a message according with the specifications
     *
     * @param numberOfPoints the number of points entered by user
     * @return The appropriate message
     */
    public static String messageToUser(int numberOfPoints) {
       String s;
        switch (numberOfPoints) {
            case 49:  s= "CFR Cluj";
                     break;
            case 46:  s = "Universitatea Craiova";
                     break;
            case 43:  s = "FCSB";
                     break;
            case 42:  s = "FC Botosani";
                     break;
            case 40:  s = "Gaz Metan";
                     break;
            case 39:  s = "Astra Giurgiu";
                     break;
            default : s = "No team from Liga 1 has " + numberOfPoints +" points";
            
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("The message to show to user is:");
        System.out.println(messageToUser(readNumberOfPoints()));
    }
}
