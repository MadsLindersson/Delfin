package MasterPackage.Utility.Results;

import MasterPackage.Object.CompetetiveMember;
import MasterPackage.Utility.Members.ShowCompMembers;

import java.util.Scanner;

public final class BestToWorstCompetitiveTimes  {

    private BestToWorstCompetitiveTimes () {}
    public static void printBestToWorstCompetitiveTimes ()   {
        Scanner input = new Scanner(System.in);
        boolean outerWhile = true;
        while(outerWhile) {
            System.out.println("""
                    1. Junior teams
                    2. Senior teams
                    0. Go back""");
            int answer = input.nextInt();

            switch (answer) {
                //Junior
                case 1:
                    boolean innerWhile = true;
                    while (innerWhile) {
                        System.out.println("""
                                1. Crawl
                                2. Butterfly
                                3. Backcrawl
                                4. Breast
                                0. Go back""");
                        int answerJunior = input.nextInt();
                        switch (answerJunior) {
                            case 1:
                                int temp = 1;
                                System.out.println("Junior crawl swimmers best to worst competitive times");
                                System.out.println("*---------------------------*");
                                for (CompetetiveMember member : ShowCompMembers.juniorCrawlList) {
                                    System.out.println(temp + ":");
                                    System.out.printf("""
                                            Name             : %s
                                            Age              : %d
                                            Disciplin        : Crawl
                                            Best time        : %2.2f sec
                                            Date of best time: %s
                                            Location         : %s
                                            *---------------------------*""", member.getName(), member.getAge(), member.getCompetitionCrawlTime(), member.getDateCrawl(), member.getPlaceCrawl());
                                    System.out.println();
                                    temp++;
                                }
                                break;
                            case 2:
                                int temp2 = 1;
                                System.out.println("Junior butterfly swimmers best to worst competitive times");
                                System.out.println("*---------------------------*");
                                for (CompetetiveMember member : ShowCompMembers.juniorButterflyList) {
                                    System.out.println(temp2 + ":");
                                    System.out.printf("""
                                            Name             : %s
                                            Age              : %d
                                            Disciplin        : Crawl
                                            Best time        : %2.2f sec
                                            Date of best time: %s
                                            Location         : %s
                                            *---------------------------*""", member.getName(), member.getAge(), member.getCompetitionButterflyTime(), member.getDateButterfly(), member.getPlaceButterfly());
                                    System.out.println();
                                    temp2++;
                                }
                                break;
                            case 3:
                                int temp3 = 1;
                                System.out.println("Junior backcrawl swimmers best to worst competitive times");
                                System.out.println("*---------------------------*");
                                for (CompetetiveMember member : ShowCompMembers.juniorBackcrawlList) {
                                    System.out.println(temp3 + ":");
                                    System.out.printf("""
                                            Name             : %s
                                            Age              : %d
                                            Disciplin        : Crawl
                                            Best time        : %2.2f sec
                                            Date of best time: %s
                                            Location         : %s
                                            *---------------------------*""", member.getName(), member.getAge(), member.getCompetitionBackcrawlTime(), member.getDateBackcrawl(), member.getPlaceBackcrawl());
                                    System.out.println();
                                    temp3++;
                                }
                                break;
                            case 4:
                                int temp4 = 1;
                                System.out.println("Junior breast swimmers best to worst competitive times");
                                System.out.println("*---------------------------*");
                                for (CompetetiveMember member : ShowCompMembers.juniorBreastList) {
                                    System.out.println(temp4 + ":");
                                    System.out.printf("""
                                            Name             : %s
                                            Age              : %d
                                            Disciplin        : Crawl
                                            Best time        : %2.2f sec
                                            Date of best time: %s
                                            Location         : %s
                                            *---------------------------*""", member.getName(), member.getAge(), member.getCompetitionBreastTime(), member.getDateBreast(), member.getPlaceBreast());
                                    System.out.println();
                                    temp4++;
                                }
                                break;
                            case 0:
                                innerWhile = false;
                                break;
                            default:
                                System.out.println("Wrong input");
                                break;
                        }
                    }
                    break;
                //Senior
                case 2:
                    boolean innerWhile2 = true;
                    while (innerWhile2) {
                        System.out.println("""
                                1. Crawl
                                2. Butterfly
                                3. Backcrawl
                                4. Breast
                                0. Go back""");
                        int answerJunior = input.nextInt();
                        switch (answerJunior) {
                            case 1:
                                int temp = 1;
                                System.out.println("Senior Crawl swimmers best to worst competitive times");
                                System.out.println("*---------------------------*");
                                for (CompetetiveMember member : ShowCompMembers.seniorCrawlList) {
                                    System.out.println(temp + ":");
                                    System.out.printf("""
                                            Name             : %s
                                            Age              : %d
                                            Disciplin        : Crawl
                                            Best time        : %2.2f sec
                                            Date of best time: %s
                                            Location         : %s
                                            *---------------------------*""", member.getName(), member.getAge(), member.getCompetitionCrawlTime(), member.getDateCrawl(), member.getPlaceCrawl());
                                    System.out.println();
                                    temp++;
                                }
                                break;
                            case 2:
                                int temp2 = 1;
                                System.out.println("Senior butterfly swimmers best to worst competitive times");
                                System.out.println("*---------------------------*");
                                for (CompetetiveMember member : ShowCompMembers.seniorButterflyList) {
                                    System.out.println(temp2 + ":");
                                    System.out.printf("""
                                            Name             : %s
                                            Age              : %d
                                            Disciplin        : Crawl
                                            Best time        : %2.2f sec
                                            Date of best time: %s
                                            Location         : %s
                                            *---------------------------*""", member.getName(), member.getAge(), member.getCompetitionButterflyTime(), member.getDateButterfly(), member.getPlaceButterfly());
                                    System.out.println();
                                    temp2++;
                                }
                                break;
                            case 3:
                                int temp3 = 1;
                                System.out.println("Senior backcrawl swimmers best to worst competitive times");
                                System.out.println("*---------------------------*");
                                for (CompetetiveMember member : ShowCompMembers.seniorBackcrawlList) {
                                    System.out.println(temp3 + ":");
                                    System.out.printf("""
                                            Name             : %s
                                            Age              : %d
                                            Disciplin        : Crawl
                                            Best time        : %2.2f sec
                                            Date of best time: %s
                                            Location         : %s
                                            *---------------------------*""", member.getName(), member.getAge(), member.getCompetitionBackcrawlTime(), member.getDateBackcrawl(), member.getPlaceBackcrawl());
                                    System.out.println();
                                    temp3++;
                                }
                                break;
                            case 4:
                                int temp4 = 1;
                                System.out.println("Senior breast swimmers best to worst competitive times");
                                System.out.println("*---------------------------*");
                                for (CompetetiveMember member : ShowCompMembers.seniorBreastList) {
                                    System.out.println(temp4 + ":");
                                    System.out.printf("""
                                            Name             : %s
                                            Age              : %d
                                            Disciplin        : Crawl
                                            Best time        : %2.2f sec
                                            Date of best time: %s
                                            Location         : %s
                                            *---------------------------*""", member.getName(), member.getAge(), member.getCompetitionBreastTime(), member.getDateBreast(), member.getPlaceBreast());
                                    System.out.println();
                                    temp4++;
                                }
                                break;
                            case 0:
                                innerWhile2 = false;
                                break;
                            default:
                                System.out.println("Wrong input");
                                break;
                        }
                    }
                case 0:
                    outerWhile = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
