import java.util.ArrayList;
import java.util.Scanner;
public class User {

    private int choiceUser;

    public int choice(ArrayList<String> elements) {
        System.out.print("Input Your element: ");
        Scanner scanner = new Scanner(System.in);
        String choiceUserStr = scanner.nextLine();

        choiceUser = elements.indexOf(choiceUserStr);
        return choiceUser;
    }

}

