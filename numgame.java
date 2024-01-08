import java.util.Scanner;

public class numgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 3;
        int finalscore = 0;
        boolean playagain = true;
        System.out.println("Welcome to the Number Game");
        System.out.println("\nYou will be having 3 chances to guess the number");
        while (playagain) {
            int rando = getrandN(1, 100);
            boolean guess = false;
            for (int i = 0; i < chances; i++) {
                System.out.println("Chance" + (i + 1) + "Enter the guessed number:");
                int user = sc.nextInt();
                if (user == rando) {
                    guess = true;
                    finalscore += 1;
                    System.out.println("You Won the Game");
                    break;
                } else if (user > rando) {
                    System.out.println("Too High Value");

                } else {
                    System.out.println("Tow Low Value\n");
                }

            }
            if (guess == false) {
                System.out.println("You Lost the Game");
                System.out.println("The number is:" + rando);
            }
            System.out.println("\nWanna Play Again:(y/n)");
            String pA = sc.next();
            playagain = pA.equalsIgnoreCase("y");

        }
        System.out.println("Hope you enjoyed it");
        System.out.println("Score:" + finalscore);
        sc.close();
    }

    public static int getrandN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }
}
