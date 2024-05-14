import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Member> members = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MainMenu.menu(input);
    }
}