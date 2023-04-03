package Tutorials;

import java.util.Scanner;

public class Tutorial6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password : ");
        String password = input.nextLine();
        int small = 0;
        int cap = 0;
        int digit = 0;

        char[] arr = password.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            if (Character.isUpperCase(arr[i])) {
                cap += 1;
            }
            if (Character.isLowerCase(arr[i])) {
                small += 1;
            }
            if (Character.isDigit(arr[i])) {
                digit += 1;
            }
        }
        if (arr.length <= 8) {
            System.out.println("Your password is weak");

        } else if (cap + small + digit < arr.length && cap != 0 && small != 0 && digit != 0) {
            System.out.println("Your password is strong");
        } else {
            System.out.println("Your password is weak");
            System.out.println("For you password strength insert fully capital,small,digit and special ");
        }

    }

}
