import java.time.LocalDate;
import java.util.Scanner;

public class RegisterTrainingResults {
    public static void registerTrainingResults() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of competitive members");

        for (Member member : Main.members) {
            if (member instanceof CompetitiveMember) {
                CompetitiveMember competitiveMember = (CompetitiveMember) member;
                System.out.println("Name: " + member.getName() + " - Member ID: " + member.getId());
            }
        }

        System.out.print("Enter the member ID to update results: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        CompetitiveMember selectedMember = null;
        for (Member member : Main.members) {
            if (member instanceof CompetitiveMember && member.getId() == memberId) {
                selectedMember = (CompetitiveMember) member;
                break;
            }
        }

        if (selectedMember == null) {
            System.out.println("No competitive member found with the given ID.");
            return;
        }

        System.out.println("Updating results for: " + selectedMember.getName());

        System.out.print("Enter '1' to update training results or '2' to update competition results: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        switch (choice) {
            case 1:
                updateTrainingResults(scanner, selectedMember);
                break;
            case 2:
                updateCompetitionResults(scanner, selectedMember);
                break;
            default:
                System.out.println("Invalid choice. Please enter '1' for training results or '2' for competition results.");
                break;
        }

        System.out.println("Results updated for member: " + selectedMember.getName());
    }

    private static void updateTrainingResults(Scanner scanner, CompetitiveMember selectedMember) {
        System.out.println("Enter training results:");

        System.out.print("Enter the date of training (YYYY-MM-DD): ");
        LocalDate trainingDate = LocalDate.parse(scanner.nextLine());

        if (selectedMember.isCrawl()) {
            System.out.print("Enter best training crawl time: ");
            double bestTrainingCrawlTime = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter place for best training crawl time: ");
            String crawlPlace = scanner.nextLine();
            selectedMember.setBestTrainingCrawlTime(bestTrainingCrawlTime, trainingDate, crawlPlace);
        }

        if (selectedMember.isButterfly()) {
            System.out.print("Enter best training butterfly time: ");
            double bestTrainingButterflyTime = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter place for best training butterfly time: ");
            String butterflyPlace = scanner.nextLine();
            selectedMember.setBestTrainingButterflyTime(bestTrainingButterflyTime, trainingDate, butterflyPlace);
        }

        if (selectedMember.isBackcrawl()) {
            System.out.print("Enter best training backcrawl time: ");
            double bestTrainingBackcrawlTime = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter place for best training backcrawl time: ");
            String backcrawlPlace = scanner.nextLine();
            selectedMember.setBestTrainingBackcrawlTime(bestTrainingBackcrawlTime, trainingDate, backcrawlPlace);
        }

        if (selectedMember.isBreast()) {
            System.out.print("Enter best training breast time: ");
            double bestTrainingBreastTime = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter place for best training breast time: ");
            String breastPlace = scanner.nextLine();
            selectedMember.setBestTrainingBreastTime(bestTrainingBreastTime, trainingDate, breastPlace);
        }
    }

    private static void updateCompetitionResults(Scanner scanner, CompetitiveMember selectedMember) {
        System.out.println("Enter competition results:");

        System.out.print("Enter the date of competition (YYYY-MM-DD): ");
        LocalDate competitionDate = LocalDate.parse(scanner.nextLine());

        if (selectedMember.isCrawl()) {
            System.out.print("Enter competition crawl time: ");
            double competitionCrawlTime = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter place for competition crawl time: ");
            String crawlPlace = scanner.nextLine();
            selectedMember.setCompetitionCrawlTime(competitionCrawlTime, competitionDate, crawlPlace);
        }

        if (selectedMember.isButterfly()) {
            System.out.print("Enter competition butterfly time: ");
            double competitionButterflyTime = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter place for competition butterfly time: ");
            String butterflyPlace = scanner.nextLine();
            selectedMember.setCompetitionButterflyTime(competitionButterflyTime, competitionDate, butterflyPlace);
        }

        if (selectedMember.isBackcrawl()) {
            System.out.print("Enter competition backcrawl time: ");
            double competitionBackcrawlTime = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter place for competition backcrawl time: ");
            String backcrawlPlace = scanner.nextLine();
            selectedMember.setCompetitionBackcrawlTime(competitionBackcrawlTime, competitionDate, backcrawlPlace);
        }

        if (selectedMember.isBreast()) {
            System.out.print("Enter competition breast time: ");
            double competitionBreastTime = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter place for competition breast time: ");
            String breastPlace = scanner.nextLine();
            selectedMember.setCompetitionBreastTime(competitionBreastTime, competitionDate, breastPlace);
        }
    }
}
