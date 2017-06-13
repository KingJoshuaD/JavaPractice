package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /**
     * Created by King Joshua on 12-06-2017.
     */
    public static class practice1 {
        public static void main(String args[]){
            System.out.println("Hello World");
        }
    }

    /**
     * Created by King Joshua on 12-06-2017.
     */
    public static class practice2 {
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter your name : ");
            String name = scan.nextLine();

            System.out.println("Hello "+ name);
        }
    }

    /**
     * Created by King Joshua on 12-06-2017.
     */
    public static class practice3 {
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            String name;
            System.out.println("Please enter your name :");
            name=scan.nextLine();
                if(name.equals("Alice")){
                    System.out.println("Hello "+ name);
                }
                else if(name.equals("Bob")){
                    System.out.println("Hello " + name);
                }
                else{
                    System.out.println("Sorry You are not allowed");
                }

        }
    }

    /**
     * Created by King Joshua on 12-06-2017.
     */
    public static class practice4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a,b=0;
            System.out.println("Enter a number");
            a=scan.nextInt();
            for(int i=1 ; i<a;i++){
                b = b +i;
            }
            System.out.println(" The sum is "+ b);

        }

    }

    /**
     * Created by King Joshua on 12-06-2017.
     */
    public static class practice5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a, b = 0;
            System.out.println("Enter a number");
            a = scan.nextInt();
            for (int i = 0; i <a; i++) {

                b = b + i;
                do {
                    i++;
                } while (i % 3 == 1 && i % 5 ==1);
            }


            System.out.println(" The sum is "+b);}
    }

    /**
     * Created by King Joshua on 12-06-2017.
     */
    public static class practice6 {
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            int a, b=1;
            System.out.println("Enter the number");
            a = scan.nextInt();
            System.out.println(" select 1 for addition and 2 for product");
            int c = scan.nextInt();
            switch(c){
                case 1:
                    for(int i =2 ;i<a; i++){
                        b=b+i;

                    }
                    break;
                case 2:
                    for (int i=1; i<a ; i++){
                        b=b*i;

                }break;
                default:
                    break;
            }
            System.out.println("The final answer is" + b);

        }
    }

    /**
     * Created by King Joshua on 12-06-2017.
     */
    public static class practice7 {
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            int a = scan.nextInt();
            for(int i=0 ; i<=12 ; i++){
                System.out.println(a + "x" + i + "=" + (i*a));
            }
        }
    }

    /**
     * Created by King Joshua on 12-06-2017.
     */
    public static class practice8 {
        public static void main(String args[]) {


            //loop through the numbers one by one
            for(int i=1; i>0; i++){

                boolean isPrime = true;

                //check to see if the number is prime
                for(int j=2; j < i ; j++){

                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                // print the number
                if(isPrime)
                    System.out.println(i);
            }
        }
            }

    /**
     * Created by King Joshua on 12-06-2017.
     */
    public static class practice11 {
        public static void main(String args[]){
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int count=0;
            while(count <=20){
               if(year %4 == 0){
                   System.out.println(year);
                   count++;
                   year++;
               }
               else{
                   year++;
               }

            }
        }
    }
}
