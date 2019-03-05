package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int digitToDisplay = (number % 10);
        //System.out.println(digitToDisplay);
        switch (digitToDisplay){
            case 0:
                System.out.println("zero");
                break;
            case  1:
            System.out.println("one");
            break;
            case  2:
                System.out.println("two");
                break;
            case  3:
                System.out.println("three");
                break;

            case  4:
                System.out.println("four");
                break;
            case  5:
                System.out.println("five");
                break;
            case  6:
                System.out.println("six");
                break;
            case  7:
                System.out.println("seven");
                break;
            case  8:
                System.out.println("eigth");
                break;
            case  9:
                System.out.println("nine");
                break;
            case  10:
                System.out.println("ten");
                break;
        }
    }
}
