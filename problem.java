package com.minhaj;

import java.util.Scanner;

public class problem {

    public static void main(String[] args) {

//        Problem ----->>>>1
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter three number:");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//        int max = Math.max(num3,(Math.max(num1,num2)));
//
//
//        System.out.println("Maximum value is :" + max);

//        if(num1> num2 && num1>num3){
//            System.out.println(num1);
//        }
//        else if(num2> num1 && num2>num3){
//            System.out.println(num2);
//        } else if (num3>num1 && num3>num2) {
//            System.out.println(num3);
//
//        }
//        else {
//            System.out.println("In given numbers two or more than two is  same");
//        }

//        Problem ----->>2

//        Scanner input = new Scanner(System.in);
//        System.out.println("Checking the starting letter is Capital or not:");
//        char firstLetter = input.next().trim().charAt(0);
//        if(firstLetter <= 'a'){
//            System.out.println("Its starting with a upper case");
//        }
//        else{
//            System.out.println("Its starting with Lower case ");
//        }

//        Problem ------->>>>>>> 3


//        Scanner input = new Scanner(System.in);
//        System.out.print("Term:");
//        int reqTerm = input.nextInt();
//        int temp = 0;
//        int preFib = 0;
//        int fib = 1;
//        int term = 2;
//        while(term<=reqTerm){
////            System.out.print(preFib +"  ");
//            temp = fib;
//            fib = fib + preFib;
//            preFib = temp;
//            term++;
//
//
//        }
//        System.out.println(fib);


//        Problem -->>> 4

//        Scanner input = new Scanner(System.in);
        
//        System.out.println("Enter the number: ");
//        int number = input.nextInt();
//        int count = 0;
//
//        while(number >0){
//            if(number % 10 == 3){
//                count++;
//
//
//            }
//            number /=10;
//        }
//        System.out.printf("3 Occurred in %d time",count);
        
        
//        Problem ---->>>5


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int numb = input.nextInt();
        int reverse= 0;

        while(numb>0){
            reverse = reverse*10 + (numb%10);

            numb /=10;

    }
        System.out.println(reverse);


    

    }
}
