package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Enter the first of two integers to be averaged.");
        int n2 = ap.nextInt("Enter the second integer.");

        double average = (n1+n2)/2.0;
        System.out.println("The average of "+n1+" and "+n2+" is "+average+".");
    }
}
