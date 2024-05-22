package MasterPackage.Utility.Results;

import MasterPackage.Object.CompetetiveMember;
import MasterPackage.Controller.Main;
import MasterPackage.Object.Member;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegisterCompetitionResults {
    public static void registerCompetitionResults() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("List of competitive members");

            for (Member member : Main.members) {
                if (member instanceof CompetetiveMember) {
                    CompetetiveMember competitiveMember = (CompetetiveMember) member;
                    System.out.println("Name: " + member.getName() + " - Member ID: " + member.getId());
                }
            }

            System.out.print("Enter the member ID to update competition results: ");
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

            System.out.println("Select the competition to update:");
            System.out.println("1. Crawl");
            System.out.println("2. Butterfly");
            System.out.println("3. Backcrawl");
            System.out.println("4. Breast");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    if (selectedMember.isCrawl()) {
                        System.out.print("Enter competition crawl time: ");
                        double competitionCrawlTime = scanner.nextDouble();
                        selectedMember.setCompetitionCrawlTime(competitionCrawlTime);
                        scanner.nextLine(); // Consume newline left-over
                        System.out.println("Enter the date the time was acquired: ");
                        String crawlDate = scanner.nextLine();
                        selectedMember.setDateCrawlCompetetive(crawlDate);
                        System.out.println("Enter the place the time was acquired: ");
                        String crawlPlace = scanner.nextLine();
                        selectedMember.setPlaceCrawl(crawlPlace);
                    } else {
                        System.out.println("Crawl is not applicable for this member.");
                    }
                    break;
                case 2:
                    if (selectedMember.isButterfly()) {
                        System.out.print("Enter competition butterfly time: ");
                        double competitionButterflyTime = scanner.nextDouble();
                        selectedMember.setCompetitionButterflyTime(competitionButterflyTime);
                        scanner.nextLine(); // Consume newline left-over
                        System.out.println("Enter the date the time was acquired: ");
                        String butterflyDate = scanner.nextLine();
                        selectedMember.setDateButterflyCompetetive(butterflyDate);
                        System.out.println("Enter the place the time was acquired: ");
                        String butterflyPlace = scanner.nextLine();
                        selectedMember.setPlaceButterfly(butterflyPlace);
                    } else {
                        System.out.println("Butterfly is not applicable for this member.");
                    }
                    break;
                case 3:
                    if (selectedMember.isBackcrawl()) {
                        System.out.print("Enter competition backcrawl time: ");
                        double competitionBackcrawlTime = scanner.nextDouble();
                        selectedMember.setCompetitionBackcrawlTime(competitionBackcrawlTime);
                        scanner.nextLine(); // Consume newline left-over
                        System.out.println("Enter the date the time was acquired: ");
                        String backcrawlDate = scanner.nextLine();
                        selectedMember.setDateBackcrawlCompetetive(backcrawlDate);
                        System.out.println("Enter the place the time was acquired: ");
                        String backcrawlPlace = scanner.nextLine();
                        selectedMember.setPlaceBackcrawl(backcrawlPlace);
                    } else {
                        System.out.println("Backcrawl is not applicable for this member.");
                    }
                    break;
                case 4:
                    if (selectedMember.isBreast()) {
                        System.out.print("Enter competition breast time: ");
                        double competitionBreastTime = scanner.nextDouble();
                        selectedMember.setCompetitionBreastTime(competitionBreastTime);
                        scanner.nextLine(); // Consume newline left-over
                        System.out.println("Enter the date the time was acquired: ");
                        String breastDate = scanner.nextLine();
                        selectedMember.setDateBreastCompetetive(breastDate);
                        System.out.println("Enter the place the time was acquired: ");
                        String breastPlace = scanner.nextLine();
                        selectedMember.setPlaceBreast(breastPlace);
                    } else {
                        System.out.println("Breast is not applicable for this member.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid competition style.");
            }

            System.out.println("Competition results updated for member: " + selectedMember.getName());
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