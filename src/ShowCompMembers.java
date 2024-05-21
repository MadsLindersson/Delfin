import java.util.ArrayList;
import java.util.Scanner;

public class ShowCompMembers {
    private static ArrayList<CompetetiveMember> juniorCrawlList = new ArrayList<>();
    private static ArrayList<CompetetiveMember> juniorButterflyList = new ArrayList<>();
    private static ArrayList<CompetetiveMember> juniorBackcrawlList = new ArrayList<>();
    private static ArrayList<CompetetiveMember> juniorBreastList = new ArrayList<>();

    private static ArrayList<CompetetiveMember> seniorCrawlList = new ArrayList<>();
    private static ArrayList<CompetetiveMember> seniorButterflyList = new ArrayList<>();
    private static ArrayList<CompetetiveMember> seniorBackcrawlList = new ArrayList<>();
    private static ArrayList<CompetetiveMember> seniorBreastList = new ArrayList<>();

    public ShowCompMembers() {}

    public static void sortCompMembers() {
        for (Member member : Main.members) {
            switch (4) {
                case 1:
                    if (((CompetetiveMember) member).isCrawl()) {
                        juniorCrawlList.add((CompetetiveMember) member);
                    } else if (((CompetetiveMember) member).isButterfly()) {
                        juniorButterflyList.add((CompetetiveMember) member);
                    } else if (((CompetetiveMember) member).isBackcrawl()) {
                        juniorBackcrawlList.add((CompetetiveMember) member);
                    } else if (((CompetetiveMember) member).isBreast()) {
                        juniorBreastList.add((CompetetiveMember) member);
                        break;
                    }
            }
        }
    }

    public static void listOfCompetetiveMembers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1. Crawl team
                2. Butterfly team
                3. Backcrawl team
                4. Breast team""");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (CompetetiveMember member : juniorCrawlList) {
                    if (member.isCrawl()) {
                        System.out.println("Crawl team member:");
                        System.out.println("Name: " + member.getName());
                        System.out.println("Age: " + member.getAge());
                        System.out.println("ID: " + member.getId());

                        System.out.println("Best Training Crawl Time: " + member.getBestCrawlTime());
                        System.out.println("Competition Crawl Time: " + member.getCompetitionCrawlTime());

                        System.out.println("---------------------------------------");
                    }
                }
                break;
            case 2:
                for (CompetetiveMember member : juniorButterflyList) {
                    if (member.isButterfly()) {
                        System.out.println("Butterfly team member:");
                        System.out.println("Name: " + member.getName());
                        System.out.println("Age: " + member.getAge());
                        System.out.println("ID: " + member.getId());

                        System.out.println("Best Training Crawl Time: " + member.getBestButterflyTime());
                        System.out.println("Competition Crawl Time: " + member.getCompetitionButterflyTime());

                        System.out.println("---------------------------------------");
                    }
                }
                break;
            case 3:
                for (CompetetiveMember member : juniorBackcrawlList) {
                    if (member.isCrawl()) {
                        System.out.println("Backcrawl team member:");
                        System.out.println("Name: " + member.getName());
                        System.out.println("Age: " + member.getAge());
                        System.out.println("ID: " + member.getId());

                        System.out.println("Best Training Crawl Time: " + member.getBestBackcrawlTime());
                        System.out.println("Competition Crawl Time: " + member.getCompetitionBackcrawlTime());

                        System.out.println("---------------------------------------");
                    }
                }
                break;
            case 4:
                for (CompetetiveMember member : juniorBreastList) {
                    if (member.isCrawl()) {
                        System.out.println("Breast team member:");
                        System.out.println("Name: " + member.getName());
                        System.out.println("Age: " + member.getAge());
                        System.out.println("ID: " + member.getId());

                        System.out.println("Best Training Crawl Time: " + member.getBestBreastTime());
                        System.out.println("Competition Crawl Time: " + member.getCompetitionBreastTime());

                        System.out.println("---------------------------------------");
                    }
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}