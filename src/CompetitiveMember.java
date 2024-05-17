import java.time.LocalDate;

public class CompetitiveMember extends Member {
    private boolean crawl;
    private boolean butterfly;
    private boolean backcrawl;
    private boolean breast;

    private double bestTrainingCrawlTime;
    private LocalDate bestTrainingCrawlDate;
    private String trainingCrawlPlace;

    private double bestTrainingButterflyTime;
    private LocalDate bestTrainingButterflyDate;
    private String trainingButterflyPlace;

    private double bestTrainingBackcrawlTime;
    private LocalDate bestTrainingBackcrawlDate;
    private String trainingBackcrawlPlace;

    private double bestTrainingBreastTime;
    private LocalDate bestTrainingBreastDate;
    private String trainingBreastPlace;

    private double competitionCrawlTime;
    private LocalDate competitionCrawlDate;
    private String competitionCrawlPlace;

    private double competitionButterflyTime;
    private LocalDate competitionButterflyDate;
    private String competitionButterflyPlace;

    private double competitionBackcrawlTime;
    private LocalDate competitionBackcrawlDate;
    private String competitionBackcrawlPlace;

    private double competitionBreastTime;
    private LocalDate competitionBreastDate;
    private String competitionBreastPlace;

    public CompetitiveMember(String name, int age, int id, boolean status, boolean ageGroup, boolean debt, double debtAmount,
                             boolean crawl, boolean butterfly, boolean backcrawl, boolean breast, double bestTrainingCrawlTime, LocalDate bestTrainingCrawlDate, String trainingCrawlPlace, double bestTrainingButterflyTime, LocalDate bestTrainingButterflyDate, String trainingButterflyPlace, double bestTrainingBackcrawlTime, LocalDate bestTrainingBackcrawlDate, String trainingBackcrawlPlace, double bestTrainingBreastTime, LocalDate bestTrainingBreastDate, String trainingBreastPlace, double competitionCrawlTime, LocalDate competitionCrawlDate, String competitionCrawlPlace, double competitionButterflyTime, LocalDate competitionButterflyDate, String competitionButterflyPlace, double competitionBackcrawlTime, LocalDate competitionBackcrawlDate, String competitionBackcrawlPlace, double competitionBreastTime, LocalDate competitionBreastDate, String competitionBreastPlace) {
        super(name, age, id, status, ageGroup, debt, debtAmount);
        this.crawl = crawl;
        this.butterfly = butterfly;
        this.backcrawl = backcrawl;
        this.breast = breast;
    }

    // is methods
    public boolean isCrawl() {
        return crawl;
    }

    public boolean isButterfly() {
        return butterfly;
    }

    public boolean isBackcrawl() {
        return backcrawl;
    }

    public boolean isBreast() {
        return breast;
    }

    // Training getters and setters
    public double getBestTrainingCrawlTime() {
        return bestTrainingCrawlTime;
    }

    public void setBestTrainingCrawlTime(double bestTrainingCrawlTime, LocalDate date, String place) {
        this.bestTrainingCrawlTime = bestTrainingCrawlTime;
        this.bestTrainingCrawlDate = date;
        this.trainingCrawlPlace = place;
    }

    public LocalDate getBestTrainingCrawlDate() {
        return bestTrainingCrawlDate;
    }

    public String getTrainingCrawlPlace() {
        return trainingCrawlPlace;
    }

    public double getBestTrainingButterflyTime() {
        return bestTrainingButterflyTime;
    }

    public void setBestTrainingButterflyTime(double bestTrainingButterflyTime, LocalDate date, String place) {
        this.bestTrainingButterflyTime = bestTrainingButterflyTime;
        this.bestTrainingButterflyDate = date;
        this.trainingButterflyPlace = place;
    }

    public LocalDate getBestTrainingButterflyDate() {
        return bestTrainingButterflyDate;
    }

    public String getTrainingButterflyPlace() {
        return trainingButterflyPlace;
    }

    public double getBestTrainingBackcrawlTime() {
        return bestTrainingBackcrawlTime;
    }

    public void setBestTrainingBackcrawlTime(double bestTrainingBackcrawlTime, LocalDate date, String place) {
        this.bestTrainingBackcrawlTime = bestTrainingBackcrawlTime;
        this.bestTrainingBackcrawlDate = date;
        this.trainingBackcrawlPlace = place;
    }

    public LocalDate getBestTrainingBackcrawlDate() {
        return bestTrainingBackcrawlDate;
    }

    public String getTrainingBackcrawlPlace() {
        return trainingBackcrawlPlace;
    }

    public double getBestTrainingBreastTime() {
        return bestTrainingBreastTime;
    }

    public void setBestTrainingBreastTime(double bestTrainingBreastTime, LocalDate date, String place) {
        this.bestTrainingBreastTime = bestTrainingBreastTime;
        this.bestTrainingBreastDate = date;
        this.trainingBreastPlace = place;
    }

    public LocalDate getBestTrainingBreastDate() {
        return bestTrainingBreastDate;
    }

    public String getTrainingBreastPlace() {
        return trainingBreastPlace;
    }

    // Competition getters and setters
    public double getCompetitionCrawlTime() {
        return competitionCrawlTime;
    }

    public void setCompetitionCrawlTime(double competitionCrawlTime, LocalDate date, String place) {
        this.competitionCrawlTime = competitionCrawlTime;
        this.competitionCrawlDate = date;
        this.competitionCrawlPlace = place;
    }

    public LocalDate getCompetitionCrawlDate() {
        return competitionCrawlDate;
    }

    public String getCompetitionCrawlPlace() {
        return competitionCrawlPlace;
    }

    public double getCompetitionButterflyTime() {
        return competitionButterflyTime;
    }

    public void setCompetitionButterflyTime(double competitionButterflyTime, LocalDate date, String place) {
        this.competitionButterflyTime = competitionButterflyTime;
        this.competitionButterflyDate = date;
        this.competitionButterflyPlace = place;
    }

    public LocalDate getCompetitionButterflyDate() {
        return competitionButterflyDate;
    }

    public String getCompetitionButterflyPlace() {
        return competitionButterflyPlace;
    }

    public double getCompetitionBackcrawlTime() {
        return competitionBackcrawlTime;
    }

    public void setCompetitionBackcrawlTime(double competitionBackcrawlTime, LocalDate date, String place) {
        this.competitionBackcrawlTime = competitionBackcrawlTime;
        this.competitionBackcrawlDate = date;
        this.competitionBackcrawlPlace = place;
    }

    public LocalDate getCompetitionBackcrawlDate() {
        return competitionBackcrawlDate;
    }

    public String getCompetitionBackcrawlPlace() {
        return competitionBackcrawlPlace;
    }

    public double getCompetitionBreastTime() {
        return competitionBreastTime;
    }

    public void setCompetitionBreastTime(double competitionBreastTime, LocalDate date, String place) {
        this.competitionBreastTime = competitionBreastTime;
        this.competitionBreastDate = date;
        this.competitionBreastPlace = place;
    }

    public LocalDate getCompetitionBreastDate() {
        return competitionBreastDate;
    }

    public String getCompetitionBreastPlace() {
        return competitionBreastPlace;
    }
}