import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Member> members = new ArrayList<>();

    static {
        CompetetiveMember member2 = new CompetetiveMember("Flemming", 22, 2, true, true, false, 0,
                true, true, false, false, 0, 0, 0, 0, 0, 0, 0, 0);
        members.add(member2);
    }
    public static void main(String[] args) throws IOException {

        MainMenu.menu();
    }
}