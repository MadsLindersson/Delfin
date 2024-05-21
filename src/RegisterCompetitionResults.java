import java.util.Scanner;

public class RegisterCompetitionResults {
    public static void registerCompetitionResults() {
        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Updating competition results for: " + selectedMember.getName());

        if (selectedMember.isCrawl()) {
            System.out.print("Enter competition crawl time: ");
            double competitionCrawlTime = scanner.nextDouble();
            selectedMember.setCompetitionCrawlTime(competitionCrawlTime);
            System.out.println("Enter the date the time was acquired");
            String crawlDate = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setDateCrawlCompetetive(crawlDate);
            System.out.println("Enter the place the time was acquired");
            String crawlPlace = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setPlaceCrawl(crawlPlace);
        }

        if (selectedMember.isButterfly()) {
            System.out.print("Enter competition butterfly time: ");
            double competitionButterflyTime = scanner.nextDouble();
            selectedMember.setCompetitionButterflyTime(competitionButterflyTime);
            System.out.println("Enter the date the time was acquired");
            String butterflyDate = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setDateButterflyCompetetive(butterflyDate);
            System.out.println("Enter the place the time was acquired");
            String butterflyPlace = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setPlaceButterfly(butterflyPlace);
        }

        if (selectedMember.isBackcrawl()) {
            System.out.print("Enter competition backcrawl time: ");
            double competitionBackcrawlTime = scanner.nextDouble();
            selectedMember.setCompetitionBackcrawlTime(competitionBackcrawlTime);
            System.out.println("Enter the date the time was acquired");
            String backcrawlDate = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setDateBackcrawlCompetetive(backcrawlDate);
            System.out.println("Enter the place the time was acquired");
            String backcrawlPlace = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setPlaceBackcrawl(backcrawlPlace);
        }

        if (selectedMember.isBreast()) {
            System.out.print("Enter competition breast time: ");
            double competitionBreastTime = scanner.nextDouble();
            selectedMember.setCompetitionBreastTime(competitionBreastTime);
            System.out.println("Enter the date the time was acquired");
            String breastDate = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setDateBreastCompetetive(breastDate);
            System.out.println("Enter the place the time was acquired");
            String breastPlace = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setPlaceBreast(breastPlace);
        }

        System.out.println("Competition results updated for member: " + selectedMember.getName());
    }
}