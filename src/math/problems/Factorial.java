package math.problems;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if (n<1)
            return 1;
        return n* factorial(n-1);
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to factorial");
        System.out.println("you wanna try?");


        char answer = 0;
        int number,result;



        while (answer != 'y' || answer != 'n'){
            System.out.println("enter 'n' or 'y'");
            answer=sc.next().charAt(0);
            if (answer == 'y' || answer == 'n'){
                break;
            }
        }
        if (answer == 'y'){
            System.out.println("please enter number");

        }else if (answer == 'n'){
            System.out.println("ok bye");
        }
        number = sc.nextInt();
        result = factorial(number);
        System.out.printf("%d! = %d", number,result);
        System.out.println("do you wanna try again?");




    }


    }

