package MasterPackage.LoadAndSave;

import MasterPackage.Object.CompetetiveMember;
import MasterPackage.Controller.Main;
import MasterPackage.Object.Member;
import MasterPackage.Utility.Accounting.Subscription;

import java.io.*;

public final class SaveData {
       /* public static BufferedWriter output;

    static {
        try {
            output = new BufferedWriter(new FileWriter("Members.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static BufferedWriter output2;

    static {
        try {
            output2 = new BufferedWriter(new FileWriter("CompetitiveMembers.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/

    private SaveData () {}

    public static void saveSubscriptionRatesInFile () throws IOException {
        //Skal hive fat i Subscription fields og gemme dem i fil. 500,1000,1600,1200
        BufferedWriter saveSub = new BufferedWriter(new FileWriter("SubscriptionRates.txt"));
        saveSub.write(Subscription.passiveMember+",");
        saveSub.write(Subscription.youthSwimmer+",");
        saveSub.write(Subscription.seniorSwimmer+",");
        saveSub.flush();
    }

    //Writes the arraylist to 2 seperate files, 1 for members and one for competitive members.
    public static void saveDataInFile () throws IOException {
         BufferedWriter output;

         {
            try {
                output = new BufferedWriter(new FileWriter("Members.txt"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
         BufferedWriter output2;

         {
            try {
                output2 = new BufferedWriter(new FileWriter("CompetitiveMembers.txt"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        for(Member member : Main.members)   {
            //Prints competitive member obj's to file.
            if (member instanceof CompetetiveMember) {
                output2.write(member.getName() + ",");
                output2.write(member.getAge() + ",");
                output2.write(member.getId() + ",");
                output2.write(member.isStatus() + ",");
                output2.write(member.isAgeGroup() + ",");
                output2.write(member.isDebt() + ",");
                output2.write(member.getDebtAmount() + ",");
                output2.write(((CompetetiveMember) member).isCrawl() + ",");
                output2.write(((CompetetiveMember) member).isButterfly() + ",");
                output2.write(((CompetetiveMember) member).isBackcrawl() + ",");
                output2.write(((CompetetiveMember) member).isBreast() + ",");
                output2.write(((CompetetiveMember) member).getBestCrawlTime() + ",");
                output2.write(((CompetetiveMember) member).getBestButterflyTime() + ",");
                output2.write(((CompetetiveMember) member).getBestBackcrawlTime() + ",");
                output2.write(((CompetetiveMember) member).getBestBreastTime() + ",");
                output2.write(((CompetetiveMember) member).getCompetitionCrawlTime() + ",");
                output2.write(((CompetetiveMember) member).getCompetitionButterflyTime() + ",");
                output2.write(((CompetetiveMember) member).getCompetitionBackcrawlTime() + ",");
                output2.write(((CompetetiveMember) member).getCompetitionBreastTime() + ",");
                output2.write(((CompetetiveMember) member).getDateCrawl() + ",");
                output2.write(((CompetetiveMember) member).getDateButterfly() + ",");
                output2.write(((CompetetiveMember) member).getDateBackcrawl() + ",");
                output2.write(((CompetetiveMember) member).getDateBreast() + ",");
                output2.write(((CompetetiveMember) member).getDateCrawlCompetetive() + ",");
                output2.write(((CompetetiveMember) member).getDateButterflyCompetetive() + ",");
                output2.write(((CompetetiveMember) member).getDateBackcrawlCompetetive() + ",");
                output2.write(((CompetetiveMember) member).getDateBreastCompetetive() + ",");
                output2.write(((CompetetiveMember) member).getPlaceCrawl() + ",");
                output2.write(((CompetetiveMember) member).getPlaceButterfly() + ",");
                output2.write(((CompetetiveMember) member).getPlaceBackcrawl() + ",");
                output2.write(((CompetetiveMember) member).getPlaceBreast() + ",");
                output2.newLine();
                //Prints member obj's to file.
            }else {
                output.write(member.getName() + ",");
                output.write(member.getAge() + ",");
                output.write(member.getId() + ",");
                output.write(member.isStatus() + ",");
                output.write(member.isAgeGroup() + ",");
                output.write(member.isDebt() + ",");
                output.write(member.getDebtAmount() + ",");
                output.newLine();
            }
        }
        output2.close();
        output.close();
    }
}
