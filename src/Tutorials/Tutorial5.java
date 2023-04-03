package Tutorials;

import java.util.Scanner;

public class Tutorial5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] pss = { "Rock", "Paper", "Scissor" };
        System.out.println("Hello user Let's play Rock,Paper,Stone");
        Scanner input = new Scanner(System.in);
        System.out.print("You start : ");
        String user = input.nextLine();

        int rand = (int) (Math.random() * (2 - 0 + 1) + 0);
        System.out.println("Computer : " + pss[rand]);
        switch (user.toLowerCase()) {
        case "rock":
            if (pss[rand] == "Rock") {
                System.out.println("Fair");
            } else if (pss[rand] == "Paper") {
                System.out.println("You Lose");
            } else {
                System.out.println("You win");
            }
            break;
        case "paper":
            if (pss[rand] == "Paper") {
                System.out.println("Fair");
            } else if (pss[rand] == "Scissor") {
                System.out.println("You Lose");
            } else {
                System.out.println("You win");
            }
            break;
        case "scissor":
            if (pss[rand] == "Scissor") {
                System.out.println("Fair");
            } else if (pss[rand] == "Rock") {
                System.out.println("You Lose");
            } else {
                System.out.println("You win");
            }
            break;
        }

    }

}
