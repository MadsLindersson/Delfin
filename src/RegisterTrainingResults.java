import java.util.Scanner;

public class RegisterTrainingResults {
    public static void registerTrainingResults() {
        Scanner scanner = new Scanner(System.in);
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

        if (selectedMember.isCrawl()) {
            System.out.print("Enter best training crawl time: ");
            double bestTrainingCrawlTime = scanner.nextDouble();
            selectedMember.setBestCrawlTime(bestTrainingCrawlTime);
            System.out.print("Enter the date the time was acquired: ");
            String crawlDate = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setDateCrawl(crawlDate);
        }

        if (selectedMember.isButterfly()) {
            System.out.print("Enter best training butterfly time: ");
            double bestTrainingButterflyTime = scanner.nextDouble();
            selectedMember.setBestButterflyTime(bestTrainingButterflyTime);
            System.out.println("Enter the date the time was acquired: ");
            String butterflyDate = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setDateButterfly(butterflyDate);
        }

        if (selectedMember.isBackcrawl()) {
            System.out.print("Enter best training backcrawl time: ");
            double bestTrainingBackcrawlTime = scanner.nextDouble();
            selectedMember.setBestBackcrawlTime(bestTrainingBackcrawlTime);
            System.out.println("Enter the date the time was acquired: ");
            String backcrawlDate = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setDateBackcrawl(backcrawlDate);
        }

        if (selectedMember.isBreast()) {
            System.out.print("Enter best training breast time: ");
            double bestTrainingBreastTime = scanner.nextDouble();
            selectedMember.setBestBreastTime(bestTrainingBreastTime);
            System.out.println("Enter the date the time was acquired: ");
            String breastDate = scanner.nextLine();
            scanner.nextLine(); // Consume newline left-over
            selectedMember.setDateBreast(breastDate);
        }

        System.out.println("Training results updated for member: " + selectedMember.getName());
    }
}