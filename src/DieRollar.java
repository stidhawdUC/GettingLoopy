import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean userFinished = false;
        System.out.println("Welcome to the Die Rollar.\nLet's roll some dice:");
    do{


        int die1, die2, die3, rollSum; // no need to declare!
        int rollNum = 0;
        boolean rollsDone = false;
        do
        {
            rollNum++;
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            rollSum = die1 + die2 + die3;
            System.out.printf("\n" + "Roll %3d", rollNum);
            System.out.printf(" |%2d %2d %2d | %3d", die1, die2, die3, rollSum);
            if((die1 == die2) && (die1 == die3)) rollsDone = true;
        }while(!rollsDone);
        //"post-game" of the program
        boolean inputReceived = false;
        System.out.println("\nIt's a triple! Took " + rollNum + " rolls." +
                "\nReset roll count and continue? [Y/N]:");
        do {
            String userResponse = in.nextLine();
            if (userResponse.equalsIgnoreCase("Y")) {
                System.out.println("Re-rolling...");
                inputReceived = true;
            } else if (userResponse.equalsIgnoreCase("N"))
            {
                userFinished = true;
                inputReceived = true;
            }
            else System.out.println("Please enter [Y] or [N]:");
        }while(!inputReceived);
    }while(!userFinished);
        System.out.println("Goodbye!");
    }
}