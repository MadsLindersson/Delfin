public class ShowMembers {
    public static void showMembers() {
        for (Member member : Main.members) {
            System.out.println("Name: " + member.getName());
            System.out.println("Age: " + member.getAge());
            System.out.println("ID: " + member.getId());
            System.out.println("Status: " + (member.isStatus() ? "Active" : "Inactive"));
            System.out.println("Age Group: " + (member.isAgeGroup() ? "Over 18" : "Under 18"));
            System.out.println("Debt: " + (member.isDebt() ? "Yes" : "No"));

            if (member.isDebt()) {
                System.out.println("Debt Amount: " + member.getDebtAmount());
            }

            if (member instanceof CompetetiveMember) {
                CompetetiveMember competitiveMember = (CompetetiveMember) member;
                System.out.println("Crawl: " + (competitiveMember.isCrawl() ? "Yes" : "No"));
                System.out.println("Butterfly: " + (competitiveMember.isButterfly() ? "Yes" : "No"));
                System.out.println("Backcrawl: " + (competitiveMember.isBackcrawl() ? "Yes" : "No"));
                System.out.println("Breast: " + (competitiveMember.isBreast() ? "Yes" : "No"));

                // Print specific information only if the member participates in specefic team.
                if (competitiveMember.isCrawl()) {
                    System.out.println("Best Training Crawl Time: " + competitiveMember.getBestCrawlTime());
                    System.out.println("Competition Crawl Time: " + competitiveMember.getCompetitionCrawlTime());
                }

                if (competitiveMember.isButterfly()) {
                    System.out.println("Best Butterfly Time: " + competitiveMember.getBestButterflyTime());
                    System.out.println("Competition Butterfly Time: " + competitiveMember.getCompetitionButterflyTime());
                }

                if (competitiveMember.isBackcrawl()) {
                    System.out.println("Best Backcrawl Time: " + competitiveMember.getBestBackcrawlTime());
                    System.out.println("Competition Backcrawl Time: " + competitiveMember.getCompetitionBackcrawlTime());
                }

                if (competitiveMember.isBreast()) {
                    System.out.println("Best Breast Time: " + competitiveMember.getBestBreastTime());
                    System.out.println("Competition Breast Time: " + competitiveMember.getCompetitionBreastTime());
                }
            }

            System.out.println("-----------------------------");
        }
    }
}
