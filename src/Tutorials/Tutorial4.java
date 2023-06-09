package Tutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tutorial4 {
    public static String firstCap(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        // Tutorial4(a)
        ArrayList<String> color = new ArrayList<String>();
        color.add("red");
        color.add("green");
        color.add("orange");
        color.add("white");
        color.add("black");
        System.out.println("Color Array list is " + color);

        // Tutorial4(b)
        ArrayList<String> swapColor = new ArrayList<String>();
        swapColor.add("Red");
        swapColor.add("Green");
        swapColor.add("Black");
        swapColor.add("White");
        swapColor.add("Pink");
        System.out.println("Test Color Array list is " + swapColor);
        System.out.println("Enter the number of two color:");
        String first = input.nextLine();
        String second = input.nextLine();

        int index1 = swapColor.indexOf(firstCap(first));
        int index2 = swapColor.indexOf(firstCap(second));
        Collections.swap(swapColor, index1, index2);
        System.out.print("After swapping : " + swapColor);
        input.close();

    }

}
