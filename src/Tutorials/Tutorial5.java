package Tutorials;

import java.util.Scanner;

public class Tutorial5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(
                "Hello user Let's play Rock,Paper,Stone\nEnter 0 for 'Rock' , 1 for 'Paper' , 2 for 'Scissor'");
        Scanner input = new Scanner(System.in);
        System.out.print("You start : ");
        int user = input.nextInt();
        int rand = (int) (Math.random() * (2 - 0 + 1) + 0);
        System.out.println("Computer : " + rand);
        if ((user == 0 && rand == 0) || (user == 1 && rand == 1) || (user == 2 && rand == 2)) {
            System.out.println("Fair");
        } else if ((user == 0 && rand == 1) || (user == 1 && rand == 2) || (user == 2 && rand == 0)) {
            System.out.println("Computer win");
        } else if ((user == 0 && rand == 2) || (user == 1 && rand == 0) || (user == 2 && rand == 1)) {
            System.out.println("You win");
        }
        input.close();

    }

}
