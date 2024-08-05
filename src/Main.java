public class Main {
    public static void main(String[] args) {

        //pt1
        for(int x = 0; x < 31; x++)
        {
            if(x == 15) System.out.println("");
            System.out.printf(" " + x);
        }

        System.out.println("\n");
        for(int x = 30; x > -1; x--)
        {
            if(x == 15) System.out.println("");
            System.out.printf(" " + x);
        }

        System.out.println("\n");
        for(int x = 0; x < 19; x = x + 3)
        {
            System.out.printf(" " + x);
        }

        System.out.println("\n");
        for(int x = 10; x > -1; x = x - 2)
        {
            System.out.printf(" " + x);
        }

        //pt2
        System.out.println("\n");
        for(int x = 0; x <5; x++)
        {
            for(int y = 0; y < (x+1); y++) System.out.print("*");
            System.out.println("");
        }
        System.out.println("\n");
        for(int x = 4; x > -1; x--)
        {
            for(int y = 0; y < (x+1); y++) System.out.print("*");
            System.out.println("");
        }
        System.out.println("\n");
        for(int x = 0; x <5; x++)
        {
            for(int y = 0; y < 5; y++) System.out.print("*");
            System.out.println("");
        }
    }
}