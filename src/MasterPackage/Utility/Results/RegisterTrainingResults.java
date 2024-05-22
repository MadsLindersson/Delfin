package MasterPackage.Utility.Results;

import MasterPackage.Object.CompetetiveMember;
import MasterPackage.Controller.Main;
import MasterPackage.Object.Member;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegisterTrainingResults {
    public static void registerTrainingResults() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("List of competitive members");

            for (Member member : Main.members) {
                if (member instanceof CompetetiveMember) {
                    CompetetiveMember competitiveMember = (CompetetiveMember) member;
                    System.out.println("Name: " + member.getName() + " - Member ID: " + member.getId());
                }
            }

            System.out.print("Enter the member ID to update training results: ");
            int memberId = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            CompetetiveMember selectedMember = null;
            for (Member member : Main.members) {
                if (member instanceof CompetetiveMember && member.getId() == memberId) {
                    selectedMember = (CompetetiveMember) member;
                    break;
                }
            }

            if (selectedMember == null) {
                System.out.println("No competitive member found with the given ID.");
                return;
            }

            System.out.println("Updating training results for: " + selectedMember.getName());

            System.out.println("Select the training to update:");
            System.out.println("1. Crawl");
            System.out.println("2. Butterfly");
            System.out.println("3. Backcrawl");
            System.out.println("4. Breast");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    if (selectedMember.isCrawl()) {
                        System.out.print("Enter best training crawl time: ");
                        double bestTrainingCrawlTime = scanner.nextDouble();
                        selectedMember.setBestCrawlTime(bestTrainingCrawlTime);
                        scanner.nextLine(); // Consume newline left-over
                        System.out.print("Enter the date the time was acquired: ");
                        String crawlDate = scanner.nextLine();
                        selectedMember.setDateCrawl(crawlDate);
                    } else {
                        System.out.println("Crawl is not applicable for this member.");
                    }
                    break;
                case 2:
                    if (selectedMember.isButterfly()) {
                        System.out.print("Enter best training butterfly time: ");
                        double bestTrainingButterflyTime = scanner.nextDouble();
                        selectedMember.setBestButterflyTime(bestTrainingButterflyTime);
                        scanner.nextLine(); // Consume newline left-over
                        System.out.print("Enter the date the time was acquired: ");
                        String butterflyDate = scanner.nextLine();
                        selectedMember.setDateButterfly(butterflyDate);
                    } else {
                        System.out.println("Butterfly is not applicable for this member.");
                    }
                    break;
                case 3:
                    if (selectedMember.isBackcrawl()) {
                        System.out.print("Enter best training backcrawl time: ");
                        double bestTrainingBackcrawlTime = scanner.nextDouble();
                        selectedMember.setBestBackcrawlTime(bestTrainingBackcrawlTime);
                        scanner.nextLine(); // Consume newline left-over
                        System.out.print("Enter the date the time was acquired: ");
                        String backcrawlDate = scanner.nextLine();
                        selectedMember.setDateBackcrawl(backcrawlDate);
                    } else {
                        System.out.println("Backcrawl is not applicable for this member.");
                    }
                    break;
                case 4:
                    if (selectedMember.isBreast()) {
                        System.out.print("Enter best training breast time: ");
                        double bestTrainingBreastTime = scanner.nextDouble();
                        selectedMember.setBestBreastTime(bestTrainingBreastTime);
                        scanner.nextLine(); // Consume newline left-over
                        System.out.print("Enter the date the time was acquired: ");
                        String breastDate = scanner.nextLine();
                        selectedMember.setDateBreast(breastDate);
                    } else {
                        System.out.println("Breast is not applicable for this member.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid training style.");
            }

            System.out.println("Training results updated for member: " + selectedMember.getName());
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