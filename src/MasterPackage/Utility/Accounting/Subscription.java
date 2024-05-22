package MasterPackage.Utility.Accounting;

import MasterPackage.LoadAndSave.LoadData;
import MasterPackage.LoadAndSave.SaveData;
import MasterPackage.Controller.Main;
import MasterPackage.Object.Member;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public final class Subscription {
    //Empty constructer
    private Subscription () {}

    public static int passiveMember;
    public static int youthSwimmer;
    public static int seniorSwimmer;
    public static double over60Swimmer;
    public static Scanner input = new Scanner (System.in);

    public static void showSubscriptionRates () {
        System.out.println();
        System.out.printf("""
                Current subsciption rates:
                Passive member:               %2d
                Swimmer under 18:             %2d
                Swimmer over 18 and under 60: %2d
                Swimmer over 60:              %2.2f""",passiveMember, youthSwimmer, seniorSwimmer, over60Swimmer);
        System.out.println();
        System.out.println();
    }

    public static void editSubscriptionRates () throws IOException {
        //Skal ændre i fields og kalde på SaveData.saveSubscriptionRatesInFile som gemmer dem i fil.
        Scanner input = new Scanner(System.in);
        System.out.println("""
                What subscription rate would you like to change?
                1. Passive members.
                2. Swimmers under 18.
                3. Swimmers over 18 and under 60.
                4. Swimmers over 60.""");
        int answer = input.nextInt();
        switch (answer) {
            case 1:
                System.out.printf("""
                        Current reate is %2d
                        Enter new rate.""", passiveMember);
                passiveMember = input.nextInt();
                break;
            case 2:
                System.out.printf("""
                        Current reate is %2d
                        Enter new rate.""", youthSwimmer);
                youthSwimmer = input.nextInt();
                break;
            case 3:
                System.out.printf("""
                        Current reate is %2d
                        Enter new rate.""", seniorSwimmer);
                seniorSwimmer = input.nextInt();
                break;
            case 4:
                System.out.printf("""
                        Current reate is %2f
                        Enter new rate.""", over60Swimmer);
                over60Swimmer = input.nextDouble();
                break;
            default:
                System.out.println("Wrong input");
        }
        SaveData.saveSubscriptionRatesInFile();
        LoadData.readSubscriptionRatesFromFile();
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
