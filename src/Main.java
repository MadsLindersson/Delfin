import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) {


        Member member = new Member("Henning", 17, 1, true, true, false, 0);
        members.add(member);

        MainMenu.menu(input);
    }
}