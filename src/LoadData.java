import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;

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
            Scanner readLine = new Scanner(line).useDelimiter(",");
            String name = readLine.next();
            int age = readLine.nextInt();
            int ID = readLine.nextInt();
            boolean status = parseBoolean(readLine.next());
            boolean ageGroup = parseBoolean(readLine.next());
            boolean debt = parseBoolean(readLine.next());
            double debtAmount = parseDouble(readLine.next());
            Main.members.add(new Member(name, age, ID, status, ageGroup, debt, debtAmount));
        }

        while (readFile2.hasNextLine()) {
            String line = readFile2.nextLine();
            Scanner readLine = new Scanner (line).useDelimiter(",");
            String name = readLine.next();
            int age = readLine.nextInt();
            int ID = readLine.nextInt();
            boolean status = parseBoolean(readLine.next());
            boolean ageGroup = parseBoolean(readLine.next());
            boolean debt = parseBoolean(readLine.next());
            double debtAmount = parseDouble(readLine.next());
            boolean crawl = parseBoolean(readLine.next());
            boolean butterfly = parseBoolean(readLine.next());
            boolean backcrawl = parseBoolean(readLine.next());
            boolean breast = parseBoolean(readLine.next());
            double bestTrainingCrawlTime = parseDouble(readLine.next());
            double bestButterflyTime = parseDouble(readLine.next());
            double bestBackcrawlTime = parseDouble(readLine.next());
            double bestBreastTime = parseDouble(readLine.next());
            double competitioncrawlTime = parseDouble(readLine.next());
            double competitionButterflyTime = parseDouble(readLine.next());
            double competitionBackcrawlTime = parseDouble(readLine.next());
            double competitionBreastTime = parseDouble(readLine.next());
            Main.members.add(new CompetetiveMember(name, age, ID, status, ageGroup, debt, debtAmount, crawl, butterfly,
                    backcrawl,breast,bestTrainingCrawlTime, bestButterflyTime,bestBackcrawlTime,bestBreastTime,competitioncrawlTime,competitionButterflyTime,
                    competitionBackcrawlTime, competitionBreastTime));
        }
    }

    public static int returnPassiveMemberRate () {
        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            Scanner readLine = new Scanner(line).useDelimiter(",");
            int passiveSubscription = readLine.nextInt();
            int youthSwimmer = readLine.nextInt();
            int seniorSwimmer = readLine.nextInt();
            double over60Swimmer = parseDouble(readLine.next());
            return passiveSubscription;
        }
    }
    public static int returnYouthMemberRate () {
        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            Scanner readLine = new Scanner(line).useDelimiter(",");
            int passiveSubscription = readLine.nextInt();
            int youthSwimmer = readLine.nextInt();
            int seniorSwimmer = readLine.nextInt();
            double over60Swimmer = parseDouble(readLine.next());

            return youthSwimmer;
        }
    }
    public static int returnSeniorRate () {
        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            Scanner readLine = new Scanner(line).useDelimiter(",");
            int passiveSubscription = readLine.nextInt();
            int youthSwimmer = readLine.nextInt();
            int seniorSwimmer = readLine.nextInt();
            double over60Swimmer = parseDouble(readLine.next());

            return seniorSwimmer;
        }
    }
    public static double returnOver60Rate () {
        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            Scanner readLine = new Scanner(line).useDelimiter(",");
            int passiveSubscription = readLine.nextInt();
            int youthSwimmer = readLine.nextInt();
            int seniorSwimmer = readLine.nextInt();
            double over60Swimmer = parseDouble(readLine.next());

            return over60Swimmer;
        }
    }
}
