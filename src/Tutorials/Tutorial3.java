package Tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tutorial3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        // Tutorial3(a)
//        System.out.print("For ques(a) Enter the number of elements : ");
//        int index=input.nextInt();
//        int[] array=new int[index];
//        System.out.println("Enter the numbers of array");
//        int sum=0;
//        for(int i=0;i<index;i++) {
//            array[i]=input.nextInt();
//            sum+=array[i];
//        }
//        System.out.println("Average number is : "+(double)sum/index);

        // Tutorial3(b)
        System.out.print("For ques(b) Enter the number of elements : ");
        int noOfElements = input.nextInt();
        int[] arrayList = new int[noOfElements];
        System.out.println("Enter the numbers of array");
        for (int i = 0; i < noOfElements; i++) {
            arrayList[i] = input.nextInt();
        }
        System.out.print("The numbers are : ");
        for (int i = 0; i < noOfElements; i++) {
            System.out.print(arrayList[i] + " ");
        }
        System.out.println();
        boolean search = false;
        int newIndex = noOfElements - 1;
        int[] newArray = new int[newIndex];
        System.out.print("Enter the number you want to remove : ");
        int searchNum = input.nextInt();
        for (int i = 0, j = 0; i < noOfElements; i++) {
            if (searchNum == arrayList[i]) {
                search = true;
                continue;

            }
            newArray[j++] = arrayList[i];
        }
        if (search == false) {
            System.out.println("Your number is not in this array. ");
        } else {
            System.out.print("The new array is : " + Arrays.toString(newArray));

        }
        // Tutorial3(c)
        ArrayList<String> blackpink = new ArrayList<String>();
        blackpink.add("Lisa");
        blackpink.add("Jennie");
        blackpink.add("Rose");
        blackpink.add("Jisoo");
        System.out.println(blackpink);
        String[] bp = blackpink.toArray(new String[0]);
        for (String s : bp) {
            System.out.print(s + " ");
        }

    }

}
