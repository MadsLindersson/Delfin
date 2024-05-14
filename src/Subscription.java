import java.util.Scanner;

public final class Subscription {
    //Empty constructer
    private Subscription () {}

    public static Scanner input = new Scanner (System.in);
    public static final int passiveMember = 500;
    public static final int youthSwimmer = 1000;
    public static final int seniorSwimmer = 1600;
    public static final double over60Swimmer = 1600 * 0.75;

    //Returns the subscription rate for a specific member.
    public static double calculateMembersSubscription ()     {
        //Skal finde ID på medlemmet - getAge & getStatus - og så regne kontingentet
        System.out.println("Enter member ID number");
        int inputID = input.nextInt();

        for (Member member : Main.members)  {
            if(inputID == member.getId()) {
                if(member.isStatus()) {
                    if(member.getAge() < 18) {
                        return youthSwimmer;
                    }else if(member.getAge() >= 18 && member.getAge() < 60) {
                        return seniorSwimmer;
                    } else if (member.getAge() >= 60) {
                        return over60Swimmer;
                    }
                }else {
                    return passiveMember;
                }
            }
        }
        return 0;
    }


}
