import java.io.FileNotFoundException;
import java.util.Scanner;

public final class Subscription {
    //Empty constructer
    private Subscription () {}

    public static int passiveMember;
    public static int youthSwimmer;
    public static int seniorSwimmer;
    public static double over60Swimmer;
    public static Scanner input = new Scanner (System.in);

    public static void editSubscriptionRates () {
        //Skal ændre i fields og kalde på SaveData.saveSubscriptionRatesInFile som gemmer dem i fil.
    }

    //Returns the subscription rate for a specific member.
    public static double calculateMembersSubscription () throws FileNotFoundException {
        LoadData.readSubscriptionRatesFromFile();
        System.out.println("Enter member ID number");
        int inputID = input.nextInt();

        for (Member member : Main.members)  {
            if(inputID == member.getId()) {
                if(member.isStatus() && member.getAge() < 18) {
                    return youthSwimmer;
                }else if(member.isStatus() && member.getAge() >= 18 && member.getAge() < 60) {
                    return seniorSwimmer;
                } else if (member.isStatus() && member.getAge() >= 60) {
                    return over60Swimmer;
                }
            }else {
                return passiveMember;
            }
        }
        return 0;
    }

    public static void showYearlySum(){
        int sum = 0;
        int activeMemberCount = 0;
        int passiveMemberCount = 0;
        int youthSwimmerCount = 0;
        int seniorSwimmerCount = 0;
        int over60SwimmerCount = 0;

        //Itererer gennem members array og laver sum på alle members
        for (Member member : Main.members) {
            if(member.isStatus() && member.getAge() < 18) {
                sum += youthSwimmer;
                youthSwimmerCount++;
                activeMemberCount++;
            }else if(member.isStatus() && member.getAge() >= 18 && member.getAge() < 60) {
                sum += seniorSwimmer;
                seniorSwimmerCount++;
                activeMemberCount++;
            } else if (member.isStatus() && member.getAge() >= 60) {
                sum += (int) over60Swimmer;
                over60SwimmerCount++;
                seniorSwimmerCount++;
                activeMemberCount++;
            }
            else sum += passiveMember;
            passiveMemberCount++;
        }
        //Iterer gennem array for at tjekke efter aktive og passive members
        /*for (Member member : Main.members) {
            if(member.isStatus()) {
                activeMemberCount++;

            }else if(!member.isStatus()) passiveMemberCount++;
        }*/


        System.out.println("Current yearly membership fee is: " + sum + " DKK" + "\nActive members: " + activeMemberCount +
                "\nPassive members: " + passiveMemberCount + "\nYouth swimmers: " + youthSwimmerCount +
                "\nSenior swimmers: " + seniorSwimmerCount + "\nOver60 swimmers: " + over60SwimmerCount);
    }
}
