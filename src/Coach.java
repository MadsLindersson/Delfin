public class Coach {

    String coachName;

    int coachId;

    boolean coachCrawl;

    boolean coachButterfly;

    boolean coachBackcrawl;

    boolean coachBreast;

    public Coach(String coachName, int coachId, boolean coachCrawl,
                 boolean coachButterfly, boolean coachBackcrawl, boolean coachBreast) {
        this.coachName = coachName;
        this.coachId = coachId;
        this.coachCrawl = coachCrawl;
        this.coachButterfly = coachButterfly;
        this.coachBackcrawl = coachBackcrawl;
        this.coachBreast = coachBreast;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public boolean isCoachCrawl() {
        return coachCrawl;
    }

    public void setCoachCrawl(boolean coachCrawl) {
        this.coachCrawl = coachCrawl;
    }

    public boolean isCoachButterfly() {
        return coachButterfly;
    }

    public void setCoachButterfly(boolean coachButterfly) {
        this.coachButterfly = coachButterfly;
    }

    public boolean isCoachBackcrawl() {
        return coachBackcrawl;
    }

    public void setCoachBackcrawl(boolean coachBackcrawl) {
        this.coachBackcrawl = coachBackcrawl;
    }

    public boolean isCoachBreast() {
        return coachBreast;
    }

    public void setCoachBreast(boolean coachBreast) {
        this.coachBreast = coachBreast;
    }


}