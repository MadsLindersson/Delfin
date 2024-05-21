public class CompetetiveMember extends Member {
    private boolean crawl;

    private boolean butterfly;

    private boolean backcrawl;

    private boolean breast;

    private double bestCrawlTime;

    private double bestButterflyTime;

    private double bestBackcrawlTime;

    private double bestBreastTime;

    private double competitionCrawlTime;

    private double competitionButterflyTime;

    private double competitionBackcrawlTime;

    private double competitionBreastTime;


    public CompetetiveMember(String name, int age, int id, boolean status, boolean ageGroup, boolean debt, double debtAmount, boolean crawl, boolean butterfly, boolean backcrawl, boolean breast, double bestCrawlTime, double bestButterflyTime, double bestBackcrawlTime, double bestBreastTime, double competitionCrawlTime, double competitionButterflyTime, double competitionBackcrawlTime, double competitionBreastTime) {
        super(name, age, id, status, ageGroup, debt, debtAmount);
        this.crawl = crawl;
        this.butterfly = butterfly;
        this.backcrawl = backcrawl;
        this.breast = breast;
        this.bestCrawlTime = bestCrawlTime;
        this.bestButterflyTime = bestButterflyTime;
        this.bestBackcrawlTime = bestBackcrawlTime;
        this.bestBreastTime = bestBreastTime;
        this.competitionCrawlTime = competitionCrawlTime;
        this.competitionButterflyTime = competitionButterflyTime;
        this.competitionBackcrawlTime = competitionBackcrawlTime;
        this.competitionBreastTime = competitionBreastTime;
    }

    public boolean isCrawl() {
        return crawl;
    }

    public void setCrawl(boolean crawl) {
        this.crawl = crawl;
    }

    public boolean isButterfly() {
        return butterfly;
    }

    public void setButterfly(boolean butterfly) {
        this.butterfly = butterfly;
    }

    public boolean isBackcrawl() {
        return backcrawl;
    }

    public void setBackcrawl(boolean backcrawl) {
        this.backcrawl = backcrawl;
    }

    public boolean isBreast() {
        return breast;
    }

    public void setBreast(boolean breast) {
        this.breast = breast;
    }

    public double getBestCrawlTime() {
        return bestCrawlTime;
    }

    public void setBestCrawlTime(double bestCrawlTime) {
        this.bestCrawlTime = bestCrawlTime;
    }

    public double getBestButterflyTime() {
        return bestButterflyTime;
    }

    public void setBestButterflyTime(double bestButterflyTime) {
        this.bestButterflyTime = bestButterflyTime;
    }

    public double getBestBackcrawlTime() {
        return bestBackcrawlTime;
    }

    public void setBestBackcrawlTime(double bestBackcrawlTime) {
        this.bestBackcrawlTime = bestBackcrawlTime;
    }

    public double getBestBreastTime() {
        return bestBreastTime;
    }

    public void setBestBreastTime(double bestBreastTime) {
        this.bestBreastTime = bestBreastTime;
    }

    public double getCompetitionCrawlTime() {
        return competitionCrawlTime;
    }

    public void setCompetitionCrawlTime(double competitionCrawlTime) {
        this.competitionCrawlTime = competitionCrawlTime;
    }

    public double getCompetitionButterflyTime() {
        return competitionButterflyTime;
    }

    public void setCompetitionButterflyTime(double competitionButterflyTime) {
        this.competitionButterflyTime = competitionButterflyTime;
    }

    public double getCompetitionBackcrawlTime() {
        return competitionBackcrawlTime;
    }

    public void setCompetitionBackcrawlTime(double competitionBackcrawlTime) {
        this.competitionBackcrawlTime = competitionBackcrawlTime;
    }

    public double getCompetitionBreastTime() {
        return competitionBreastTime;
    }

    public void setCompetitionBreastTime(double competitionBreastTime) {
        this.competitionBreastTime = competitionBreastTime;
    }
}