package MasterPackage.Utility.Members;

import MasterPackage.Object.CompetetiveMember;
import MasterPackage.Controller.Main;
import MasterPackage.Object.Member;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateMember {

    public static void createMember() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("1. Member");
            System.out.println("2. Competitive Member");
            int answer = scanner.nextInt();
            scanner.nextLine();

            if (answer == 1) {
                System.out.println("Enter member details:");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("New member ID: ");
                int id = scanner.nextInt();
                System.out.print("Activity status (true/false)?: ");
                boolean status = scanner.nextBoolean();
                System.out.print("Age group (true for senior)?: ");
                boolean ageGroup = scanner.nextBoolean();
                System.out.print("Debt (true/false)?: ");
                boolean debt = scanner.nextBoolean();
                System.out.print("Debt amount: ");
                double debtAmount = scanner.nextDouble();

                Member member = new Member(name, age, id, status, ageGroup, debt, debtAmount);
                Main.members.add(member);
            } else if (answer == 2) {
                System.out.println("Enter competitive member details:");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("New member ID: ");
                int id = scanner.nextInt();
                System.out.print("Activity status (true/false)?: ");
                boolean status = scanner.nextBoolean();
                System.out.print("Age group (true for senior)?: ");
                boolean ageGroup = scanner.nextBoolean();
                System.out.print("Debt (true/false)?: ");
                boolean debt = scanner.nextBoolean();
                System.out.print("Debt amount: ");
                double debtAmount = scanner.nextDouble();
                System.out.print("Are they on the crawl team? (true/false): ");
                boolean crawl = scanner.nextBoolean();
                System.out.print("Are they on the butterfly team? (true/false): ");
                boolean butterfly = scanner.nextBoolean();
                System.out.print("Are they on the backcrawl team? (true/false): ");
                boolean backcrawl = scanner.nextBoolean();
                System.out.print("Are they on the breast team? (true/false): ");
                boolean breast = scanner.nextBoolean();

                double bestTrainingCrawlTime = 0.0;
                double bestButterflyTime = 0.0;
                double bestBackcrawlTime = 0.0;
                double bestBreastTime = 0.0;
                double competitionCrawlTime = 0.0;
                double competitionButterflyTime = 0.0;
                double competitionBackcrawlTime = 0.0;
                double competitionBreastTime = 0.0;
                String dateCrawl = null; // Date of the best time during training
                String dateButterfly = null;
                String dateBackcrawl = null;
                String dateBreast = null;
                String dateCrawlCompetetive = null; // Date of the best time at a competition
                String dateButterflyCompetetive = null;
                String dateBackcrawlCompetetive = null;
                String dateBreastCompetetive = null;
                String placeCrawl = null; // The place where the best time during a competition was acquired.
                String placeButterfly = null;
                String placeBackcrawl = null;
                String placeBreast = null;

                CompetetiveMember member = new CompetetiveMember(name, age, id, status, ageGroup, debt, debtAmount, crawl, butterfly, backcrawl, breast,
                        bestTrainingCrawlTime, bestButterflyTime, bestBackcrawlTime, bestBreastTime, competitionCrawlTime, competitionButterflyTime,
                        competitionBackcrawlTime, competitionBreastTime, dateCrawl, dateButterfly, dateBackcrawl, dateBreast, dateCrawlCompetetive,
                        dateButterflyCompetetive, dateBackcrawlCompetetive, dateBreastCompetetive, placeCrawl, placeButterfly, placeBackcrawl, placeBreast);
                Main.members.add(member);
            } else {
                System.out.println("Wrong input. Please select 1 or 2.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type.");
            scanner.nextLine(); // Clear the buffer
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}