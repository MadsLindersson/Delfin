import java.util.Comparator;

public class CompetetiveMember extends Member implements Comparator {
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

        private String dateCrawl; //Date of the best time during training

        private String dateButterfly;

        private String dateBackcrawl;

        private String dateBreast;

        private String dateCrawlCompetetive; //Date of the best time at a competetion

        private String dateButterflyCompetetive;

        private String dateBackcrawlCompetetive;

        private String dateBreastCompetetive;

        private String placeCrawl; //The place of where the best time during a competetion was acquired.

        private String placeButterfly;

        private String placeBackcrawl;

        private String placeBreast;

    public CompetetiveMember(String name, int age, int id, boolean status, boolean ageGroup, boolean debt,
                             double debtAmount, boolean crawl, boolean butterfly, boolean backcrawl, boolean breast,
                             double bestCrawlTime, double bestButterflyTime, double bestBackcrawlTime,
                             double bestBreastTime, double competitionCrawlTime, double competitionButterflyTime,
                             double competitionBackcrawlTime, double competitionBreastTime,
                             String dateCrawl, String dateButterfly, String dateBackcrawl,
                             String dateBreast, String dateCrawlCompetetive, String dateButterflyCompetetive,
                             String dateBackcrawlCompetetive, String dateBreastCompetetive, String placeCrawl,
                             String placeButterfly, String placeBackcrawl, String placeBreast) {
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
        this.dateCrawl = dateCrawl;
        this.dateButterfly = dateButterfly;
        this.dateBackcrawl = dateBackcrawl;
        this.dateBreast = dateBreast;
        this.dateCrawlCompetetive = dateCrawlCompetetive;
        this.dateButterflyCompetetive = dateButterflyCompetetive;
        this.dateBackcrawlCompetetive = dateBackcrawlCompetetive;
        this.dateBreastCompetetive = dateBreastCompetetive;
        this.placeCrawl = placeCrawl;
        this.placeButterfly = placeButterfly;
        this.placeBackcrawl = placeBackcrawl;
        this.placeBreast = placeBreast;
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

    public String getDateCrawl() {
        return dateCrawl;
    }

    public void setDateCrawl(String dateCrawl) {
        this.dateCrawl = dateCrawl;
    }

    public String getDateButterfly() {
        return dateButterfly;
    }

    public void setDateButterfly(String dateButterfly) {
        this.dateButterfly = dateButterfly;
    }

    public String getDateBackcrawl() {
        return dateBackcrawl;
    }

    public void setDateBackcrawl(String dateBackcrawl) {
        this.dateBackcrawl = dateBackcrawl;
    }

    public String getDateBreast() {
        return dateBreast;
    }

    public void setDateBreast(String dateBreast) {
        this.dateBreast = dateBreast;
    }

    public String getDateCrawlCompetetive() {
        return dateCrawlCompetetive;
    }

    public void setDateCrawlCompetetive(String dateCrawlCompetetive) {
        this.dateCrawlCompetetive = dateCrawlCompetetive;
    }

    public String getDateButterflyCompetetive() {
        return dateButterflyCompetetive;
    }

    public void setDateButterflyCompetetive(String dateButterflyCompetetive) {
        this.dateButterflyCompetetive = dateButterflyCompetetive;
    }

    public String getDateBackcrawlCompetetive() {
        return dateBackcrawlCompetetive;
    }

    public void setDateBackcrawlCompetetive(String dateBackcrawlCompetetive) {
        this.dateBackcrawlCompetetive = dateBackcrawlCompetetive;
    }

    public String getDateBreastCompetetive() {
        return dateBreastCompetetive;
    }

    public void setDateBreastCompetetive(String dateBreastCompetetive) {
        this.dateBreastCompetetive = dateBreastCompetetive;
    }

    public String getPlaceCrawl() {
        return placeCrawl;
    }

    public void setPlaceCrawl(String placeCrawl) {
        this.placeCrawl = placeCrawl;
    }

    public String getPlaceButterfly() {
        return placeButterfly;
    }

    public void setPlaceButterfly(String placeButterfly) {
        this.placeButterfly = placeButterfly;
    }

    public String getPlaceBackcrawl() {
        return placeBackcrawl;
    }

    public void setPlaceBackcrawl(String placeBackcrawl) {
        this.placeBackcrawl = placeBackcrawl;
    }

    public String getPlaceBreast() {
        return placeBreast;
    }

    public void setPlaceBreast(String placeBreast) {
        this.placeBreast = placeBreast;
    }

    public String toString(){
        return getName() + ", " + getId() + ", " + getBestCrawlTime() + ", " + getBestBackcrawlTime() + ", " +
                getBestBreastTime() + ", " + getBestButterflyTime();
    }

    @Override
    public int compare(Object o1, Object o2) {

        return 0;
    }
}
