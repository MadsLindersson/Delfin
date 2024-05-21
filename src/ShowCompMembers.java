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

    public ShowCompMembers() {
    }

    public static void sortCompMembers() {
        for (Member member : Main.members) {
            //Checker efter om member er over 18 år
            if (member instanceof CompetetiveMember) {
                if (member.isAgeGroup()) {
                    if (((CompetetiveMember) member).isCrawl()) {
                        seniorCrawlList.add((CompetetiveMember) member);
                    } if (((CompetetiveMember) member).isButterfly()) {
                        seniorButterflyList.add((CompetetiveMember) member);
                    } if (((CompetetiveMember) member).isBackcrawl()) {
                        seniorBackcrawlList.add((CompetetiveMember) member);
                    } if (((CompetetiveMember) member).isBreast()) {
                        seniorBreastList.add(((CompetetiveMember) member));
                    }
                } else {
                    if (((CompetetiveMember) member).isCrawl()) {
                        juniorCrawlList.add((CompetetiveMember) member);
                    } if (((CompetetiveMember) member).isButterfly()) {
                        juniorButterflyList.add((CompetetiveMember) member);
                    } if (((CompetetiveMember) member).isBackcrawl()) {
                        juniorBackcrawlList.add((CompetetiveMember) member);
                    } if (((CompetetiveMember) member).isBreast()) {
                        juniorBreastList.add((CompetetiveMember) member);
                        break;
                    }
                }
            }
        }
    }

    public static void listOfCompetetiveMembers() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("""
                    1. Junior teams
                    2. Senior teams
                    3. Go back""");
            int choice1 = sc.nextInt();
            switch (choice1) {
                //Junior teams
                case 1:
                    while (true) {
                        System.out.println("""
                                **Junior teams**
                                1. Crawl team
                                2. Butterfly team
                                3. Backcrawl team
                                4. Breast team
                                5. Go back""");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                for (CompetetiveMember member : juniorCrawlList) {
                                    if (member.isCrawl()) {
                                        System.out.println("jr. Crawl team member:");
                                        System.out.println("Name: " + member.getName());
                                        System.out.println("Age: " + member.getAge());
                                        System.out.println("ID: " + member.getId());

                                        System.out.println("Best Training Crawl Time: " + member.getBestCrawlTime());
                                        System.out.println("Competition Crawl Time: " + member.getCompetitionCrawlTime());

                                        System.out.println("---------------------------------------");
                                    }
                                }
                            case 2:
                                for (CompetetiveMember member : juniorButterflyList) {
                                    if (member.isButterfly()) {
                                        System.out.println("jr. Butterfly team member:");
                                        System.out.println("Name: " + member.getName());
                                        System.out.println("Age: " + member.getAge());
                                        System.out.println("ID: " + member.getId());

                                        System.out.println("Best Training Crawl Time: " + member.getBestButterflyTime());
                                        System.out.println("Competition Crawl Time: " + member.getCompetitionButterflyTime());

                                        System.out.println("---------------------------------------");
                                    }
                                }
                            case 3:
                                for (CompetetiveMember member : juniorBackcrawlList) {
                                    if (member.isCrawl()) {
                                        System.out.println("Jr. Backcrawl team member:");
                                        System.out.println("Name: " + member.getName());
                                        System.out.println("Age: " + member.getAge());
                                        System.out.println("ID: " + member.getId());

                                        System.out.println("Best Training Crawl Time: " + member.getBestBackcrawlTime());
                                        System.out.println("Competition Crawl Time: " + member.getCompetitionBackcrawlTime());

                                        System.out.println("---------------------------------------");
                                    }
                                }
                            case 4:
                                for (CompetetiveMember member : juniorBreastList) {
                                    if (member.isCrawl()) {
                                        System.out.println("Jr. Breast team member:");
                                        System.out.println("Name: " + member.getName());
                                        System.out.println("Age: " + member.getAge());
                                        System.out.println("ID: " + member.getId());

                                        System.out.println("Best Training Crawl Time: " + member.getBestBreastTime());
                                        System.out.println("Competition Crawl Time: " + member.getCompetitionBreastTime());

                                        System.out.println("---------------------------------------");
                                    }
                                }
                            case 5:
                                listOfCompetetiveMembers();
                            default:
                                System.out.println("Invalid choice");
                        }
                    }
                case 2:
                    System.out.println("""
                            **Senior teams**
                            1. Crawl team
                            2. Butterfly team
                            3. Backcrawl team
                            4. Breast team""");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            for (CompetetiveMember member : seniorCrawlList) {
                                if (member.isCrawl()) {
                                    System.out.println("Sr. Crawl team member:");
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
                            for (CompetetiveMember member : seniorButterflyList) {
                                if (member.isButterfly()) {
                                    System.out.println("Sr. Butterfly team member:");
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
                            for (CompetetiveMember member : seniorBackcrawlList) {
                                if (member.isCrawl()) {
                                    System.out.println("Sr. Backcrawl team member:");
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
                            for (CompetetiveMember member : seniorBreastList) {
                                if (member.isCrawl()) {
                                    System.out.println("Sr. Breast team member:");
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
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}