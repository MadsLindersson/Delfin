import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Member> members = new ArrayList<>();

    static {
        CompetetiveMember member2 = new CompetetiveMember("Flemming", 22, 3, true, true, false, 0,
                true, true, false, false, 0, 0, 0, 0, 0, 0, 0, 0);
        CompetetiveMember member3 = new CompetetiveMember("Glemming", 22, 4, true, true, false, 0,
                true, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0);
        CompetetiveMember member4 = new CompetetiveMember("Hemming", 22, 5, true, true, false, 0,
                true, true, false, true, 0, 0, 0, 0, 0, 0, 0, 0);
        CompetetiveMember member5 = new CompetetiveMember("Remming", 22, 6, true, true, false, 0,
                true, true, false, true, 0, 0, 0, 0, 0, 0, 0, 0);
        CompetetiveMember member6 = new CompetetiveMember("Yemming", 22, 7, true, true, false, 0,
                true, true, false, false, 0, 0, 0, 0, 0, 0, 0, 0);
        members.add(member2);
        members.add(member3);
        members.add(member4);
        members.add(member5);
        members.add(member6);
    }
    public static void main(String[] args) throws IOException {
        members.add(new Member("Henning", 18, 1, true, false, false, 0));
        members.add( new Member("Flemming", 20, 2, false, false, false,0));

        MainMenu.menu();


    }
}