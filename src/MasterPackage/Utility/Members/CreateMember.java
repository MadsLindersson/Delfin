package MasterPackage.Utility.Members;

import MasterPackage.Object.CompetetiveMember;
import MasterPackage.Controller.Main;
import MasterPackage.Object.Member;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateMember {

    public static void createMember() {
        //LUK IKKE
        String boolAnswers;
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

                System.out.print("Activity status (y/n)?: ");
                boolean status;
                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        status = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        status = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }

                System.out.print("Age group (y/n)?: ");
                boolean ageGroup;
                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        ageGroup = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        ageGroup = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }

                System.out.print("Debt (y/n)?: ");
                boolean debt;

                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        debt = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        debt = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }

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

                System.out.print("Activity status (y/n)?: ");
                boolean status;
                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        status = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        status = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }

                System.out.print("Age group (y/n)?: ");
                boolean ageGroup;
                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        ageGroup = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        ageGroup = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }

                System.out.print("Debt (y/n)?: ");
                boolean debt;
                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        debt = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        debt = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }


                System.out.print("Debt amount: ");
                double debtAmount = scanner.nextDouble();

                System.out.print("Are they on the crawl team? (y/n): ");
                boolean crawl;
                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        crawl = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        crawl = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }

                System.out.print("Are they on the butterfly team? (y/n): ");
                boolean butterfly;
                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        butterfly = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        butterfly = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }

                System.out.print("Are they on the backcrawl team? (y/n): ");
                boolean backcrawl;
                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        backcrawl = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        backcrawl = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }

                System.out.print("Are they on the breast team? (y/n): ");
                boolean breast;
                while (true) {
                    boolAnswers = scanner.next().trim().toLowerCase();
                    if (boolAnswers.equals("y")) {
                        breast = true;
                        break;
                    } else if (boolAnswers.equals("n")) {
                        breast = false;
                        break;
                    } else {
                        System.out.println("Invalid input, please answer y/n");
                    }
                }

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
            //Scanner.close lukker ALT system in og gør at programmet crasher - https://stackoverflow.com/questions/13042008/java-util-nosuchelementexception-scanner-reading-user-input
            //scanner.close();
        }
        System.out.println("Member was created successfully.\n");
    }
}