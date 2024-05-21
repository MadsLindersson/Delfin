import java.util.ArrayList;

public class AssignCoach {
    public static ArrayList<Coach> coaches = new ArrayList<>();

    public static void showAssignedCoach() {
        Coach coach1 = new Coach("John Swimth", 101, true, false, false, false);
        coaches.add(coach1);
        Coach coach2 = new Coach("Alice Johnson", 102, false, true, false, false);
        coaches.add(coach2);
        Coach coach3 = new Coach("David Brown", 103, false, false, true, false);
        coaches.add(coach3);
        Coach coach4 = new Coach("Emma Davis", 104, false, false, false, true);
        coaches.add(coach4);
        for (Coach coach : coaches) {
            System.out.println("Coach " + coach.getCoachName() + " teaches: ");
            for (Member member : Main.members) {
                if (member instanceof CompetetiveMember) {
                    CompetetiveMember competitiveMember = (CompetetiveMember) member;
                    if (coach.isCoachCrawl() && competitiveMember.isCrawl()) {
                        System.out.println("Competetive Swimmer: " + competitiveMember.getName());
                    }
                    if (coach.isCoachButterfly() && competitiveMember.isButterfly()) {
                        System.out.println("Competetive Swimmer: " + competitiveMember.getName());
                    }
                    if (coach.isCoachBackcrawl() && competitiveMember.isBackcrawl()) {
                        System.out.println("Competetive Swimmer: " + competitiveMember.getName());
                    }
                    if (coach.isCoachBreast() && competitiveMember.isBreast()) {
                        System.out.println("Competetive Swimmer: " + competitiveMember.getName());
                    }
                }
            }
            // Add spacing after printing all swimmers for a coach
            System.out.println(); // Empty line
        }
    }
}