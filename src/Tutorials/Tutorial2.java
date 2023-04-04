package Tutorials;

import java.util.Scanner;

public class Tutorial2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        // Tutorial2(a)
        System.out.print("Input number : ");
        int num = input.nextInt();
        var result = (num < 0) ? "negative" : "positive";
        System.out.println("Your number is " + result);

        // Tutorial2(b)
        System.out.print("Input the 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Input the 2nd number : ");
        int num2 = input.nextInt();
        System.out.print("Input the 3rd number : ");
        int num3 = input.nextInt();
        int gtnum = num1;
        if (num2 > gtnum) {
            gtnum = num2;
        }
        if (num3 > gtnum) {
            gtnum = num3;
        }
        System.out.println("The greatest is " + gtnum);

        // Tutorial2(c)
        System.out.print("Enter year : ");
        int year = input.nextInt();
        var leapyear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "leap year" : "not leap year";
        System.out.println(year + " is " + leapyear);
        input.close();
    }

}
