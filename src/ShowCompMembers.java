import java.util.ArrayList;
import java.util.Scanner;

public final class ShowCompMembers {
    public static ArrayList<CompetetiveMember> juniorCrawlList = new ArrayList<>();
    public static ArrayList<CompetetiveMember> juniorButterflyList = new ArrayList<>();
    public static ArrayList<CompetetiveMember> juniorBackcrawlList = new ArrayList<>();
    public static ArrayList<CompetetiveMember> juniorBreastList = new ArrayList<>();

    public static ArrayList<CompetetiveMember> seniorCrawlList = new ArrayList<>();
    public static ArrayList<CompetetiveMember> seniorButterflyList = new ArrayList<>();
    public static ArrayList<CompetetiveMember> seniorBackcrawlList = new ArrayList<>();
    public static ArrayList<CompetetiveMember> seniorBreastList = new ArrayList<>();

    private ShowCompMembers() {}

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
                    0. Go back""");
            int choice1 = sc.nextInt();
            switch (choice1) {
                //Junior teams
                case 1:
                    boolean c1 = true;
                    while (c1) {
                        System.out.println("""
                                **Junior teams**
                                1. Crawl team
                                2. Butterfly team
                                3. Backcrawl team
                                4. Breast team
                                0. Go back""");
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
                                break;
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
                                break;
                            case 3:
                                for (CompetetiveMember member : juniorBackcrawlList) {
                                    if (member.isBackcrawl()) {
                                        System.out.println("Jr. Backcrawl team member:");
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
                                    if (member.isBreast()) {
                                        System.out.println("Jr. Breast team member:");
                                        System.out.println("Name: " + member.getName());
                                        System.out.println("Age: " + member.getAge());
                                        System.out.println("ID: " + member.getId());

                                        System.out.println("Best Training Crawl Time: " + member.getBestBreastTime());
                                        System.out.println("Competition Crawl Time: " + member.getCompetitionBreastTime());

                                        System.out.println("---------------------------------------");
                                    }
                                }
                                break;
                            case 0:
                                c1 = false;
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }
                //Senior teams
                case 2:
                    boolean c2 = true;
                    while (c2) {
                        System.out.println("""
                                **Senior teams**
                                1. Crawl team
                                2. Butterfly team
                                3. Backcrawl team
                                4. Breast team
                                0. Go back""");
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
                                    if (member.isBackcrawl()) {
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
                                    if (member.isBreast()) {
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
                            case 0:
                                c2 = false;
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}