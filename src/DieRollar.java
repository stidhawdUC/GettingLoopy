import java.util.Random;
public class DieRollar {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        System.out.println("Welcome to the Die Rollar.\nLet's roll some dice:");


        int die1, die2, die3, rollNum, rollSum; // no need to declare!
        boolean rollsDone = false;
        do
        {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
        }while(!rollsDone);
    }
}