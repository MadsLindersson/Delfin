import java.time.LocalDate;
import java.util.Scanner;

public class CreateMember {

    public static void createMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Member");
        System.out.println("2. Competitive Member");
        int answer = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
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
            System.out.println("Enter competitive member details:");
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

            // Initialize all swim team related fields to false or zero
            boolean crawl = false;
            boolean butterfly = false;
            boolean backcrawl = false;
            boolean breast = false;

            double bestTrainingCrawlTime = 0.0;
            LocalDate bestTrainingCrawlDate = null;
            String trainingCrawlPlace = "";

            double bestTrainingButterflyTime = 0.0;
            LocalDate bestTrainingButterflyDate = null;
            String trainingButterflyPlace = "";

            double bestTrainingBackcrawlTime = 0.0;
            LocalDate bestTrainingBackcrawlDate = null;
            String trainingBackcrawlPlace = "";

            double bestTrainingBreastTime = 0.0;
            LocalDate bestTrainingBreastDate = null;
            String trainingBreastPlace = "";

            double competitionCrawlTime = 0.0;
            LocalDate competitionCrawlDate = null;
            String competitionCrawlPlace = "";

            double competitionButterflyTime = 0.0;
            LocalDate competitionButterflyDate = null;
            String competitionButterflyPlace = "";

            double competitionBackcrawlTime = 0.0;
            LocalDate competitionBackcrawlDate = null;
            String competitionBackcrawlPlace = "";

            double competitionBreastTime = 0.0;
            LocalDate competitionBreastDate = null;
            String competitionBreastPlace = "";

            CompetitiveMember member = new CompetitiveMember(name, age, id, status, ageGroup, debt, debtAmount,
                    crawl, butterfly, backcrawl, breast,
                    bestTrainingCrawlTime, bestTrainingCrawlDate, trainingCrawlPlace,
                    bestTrainingButterflyTime, bestTrainingButterflyDate, trainingButterflyPlace,
                    bestTrainingBackcrawlTime, bestTrainingBackcrawlDate, trainingBackcrawlPlace,
                    bestTrainingBreastTime, bestTrainingBreastDate, trainingBreastPlace,
                    competitionCrawlTime, competitionCrawlDate, competitionCrawlPlace,
                    competitionButterflyTime, competitionButterflyDate, competitionButterflyPlace,
                    competitionBackcrawlTime, competitionBackcrawlDate, competitionBackcrawlPlace,
                    competitionBreastTime, competitionBreastDate, competitionBreastPlace);
            Main.members.add(member);
        }
        if (answer != 1 && answer != 2) {
            System.out.println("Wrong input");
        }

    }
}