import java.util.ArrayList;
import java.util.Scanner;

public class CreateMember {

    public static void createMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Member");
        System.out.println("2. Competetive Member");
        int answer = scanner.nextInt();
        scanner.nextLine();
        if (answer == 1) {
            System.out.println("Enter member details:");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Age: ");
            int age = scanner.nextInt();
            System.out.println("New member ID: ");
            int id = scanner.nextInt();
            System.out.println("Activity status?: ");
            boolean status = scanner.nextBoolean();
            System.out.println("Agegroup (True for senior): ");
            boolean ageGroup = scanner.nextBoolean();
            System.out.println("Debt: ");
            boolean debt = scanner.nextBoolean();
            System.out.println("Debt amount: ");
            double debtAmount = scanner.nextDouble();
            Member member = new Member(name, age, id, status, ageGroup, debt, debtAmount);
            Main.members.add(member);
        }
        if (answer == 2) {
            System.out.println("Enter competetive member details:");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Age: ");
            int age = scanner.nextInt();
            System.out.println("New member ID: ");
            int id = scanner.nextInt();
            System.out.println("Activity status?: ");
            boolean status = scanner.nextBoolean();
            System.out.println("Agegroup (True for senior): ");
            boolean ageGroup = scanner.nextBoolean();
            System.out.println("Debt: ");
            boolean debt = scanner.nextBoolean();
            System.out.println("Debt amount: ");
            double debtAmount = scanner.nextDouble();
            System.out.println("Are they on the crawl team?");
            boolean crawl = scanner.nextBoolean();
            System.out.println("Are they on the butterfly team?");
            boolean butterfly = scanner.nextBoolean();
            System.out.println("Are they on the backcrawl team?");
            boolean backcrawl = scanner.nextBoolean();
            System.out.println("Are they on the breast team?");
            boolean breast = scanner.nextBoolean();
            double bestTrainingCrawlTime = 0.0;
            double bestButterflyTime = 0.0;
            double bestBackcrawlTime = 0.0;
            double bestBreastTime = 0.0;
            double competitionCrawlTime = 0.0;
            double competitionButterflyTime = 0.0;
            double competitionBackcrawlTime = 0.0;
            double competitionBreastTime = 0.0;

            CompetetiveMember competetiveMember = new CompetetiveMember(name, age, id,  status, ageGroup, debt, debtAmount, crawl, butterfly, backcrawl, breast,
                    bestTrainingCrawlTime, bestButterflyTime, bestBackcrawlTime, bestBreastTime, competitionCrawlTime, competitionButterflyTime
                    , competitionBackcrawlTime, competitionBreastTime);
            Main.members.add(competetiveMember);
        }
        if (answer != 1 && answer != 2) {
            System.out.println("Wrong input");
        }

    }
}