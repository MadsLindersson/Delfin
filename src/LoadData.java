import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class LoadData {

    //Empty constructer - Private so no instances of the class can be made.
    private LoadData () {}

    public static Scanner readFile;

    static {
        try {
            readFile = new Scanner(new File("Members.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Scanner readFile2;

    static {
        try {
            readFile2 = new Scanner(new File("CompetitiveMembers.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadDataFromFiles () {

        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            Scanner readLine = new Scanner (line);
            String name = readLine.next();
            int age = readLine.nextInt();
            int ID = readLine.nextInt();
            boolean status = readFile.nextBoolean();
            boolean ageGroup = readLine.nextBoolean();
            Boolean debt = readLine.nextBoolean();
            double debtAmount = readLine.nextDouble();
            Member member = new Member(name, age, ID, status, ageGroup, debt, debtAmount);
        }
    }
}
