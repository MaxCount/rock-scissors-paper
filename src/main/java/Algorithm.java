import java.util.ArrayList;

public class Algorithm {

        static ArrayList<Integer> winningElements = new ArrayList<>();

        public static void selectWinner(int botChoice, int userChoice, int numberOfElements) {

            for (int i = 2; i <= userChoice; i+=2) {
                winningElements.add(userChoice - i);
            }

            for (int i = 0; i < numberOfElements-userChoice; i+=2) {
                winningElements.add((userChoice+1) + i);
            }

            boolean flag = false;
            for (Integer el: winningElements) {
                if (el == botChoice) {
                    flag = true;
                    break;
                }
            }

            if(flag)
                System.out.println("You win");
            else if (userChoice == botChoice)
                System.out.println("Draw");
            else
                System.out.println("You lose");
        }

    }