package Tutorials;

import java.util.Scanner;

public class Tutorial6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password : ");
        String password = input.nextLine();
        boolean small = false;
        boolean cap = false;
        boolean digit = false;
        boolean special = false;

        char[] arr = password.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            if (Character.isUpperCase(arr[i])) {
                cap = true;
            } else if (Character.isLowerCase(arr[i])) {
                small = true;
            } else if (Character.isDigit(arr[i])) {
                digit = true;
            } else {
                special = true;
            }
        }
        if (arr.length <= 8) {
            System.out.println("Your password is weak");

        } else if (cap == true && small == true && digit == true && special == true) {
            System.out.println("Your password is strong");
        } else {
            System.out.println("Your password is weak");
            System.out.println("For you password strength insert fully capital,small,digit and special ");
        }
        input.close();

    }

}
