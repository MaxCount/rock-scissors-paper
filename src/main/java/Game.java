import javax.lang.model.util.Elements;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;
public class Game {

    public void run () throws NoSuchAlgorithmException {

        System.out. print("Input elements(For example: stone scissors paper):  ");

        ArrayList<String> elements = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String stringElements = scan.nextLine();
        String[] s = stringElements.split(" ");

        for (int i = 0; i < s.length; i++) {
            elements.add(s[i]);
        }

        Bot bot = new Bot();

        User user = new User();

        System.out.println(Generator.generateHash(Generator.generateKey(), "   ") + "   key: " + Generator.generateKey());
        System.out.println("Computer made his choice");



        Algorithm.selectWinner(bot.getChoiceBot(), user.choice(elements), elements.size());
        System.out.println("Computer's element is: " + elements.get(bot.getChoiceBot()));
    }
}

