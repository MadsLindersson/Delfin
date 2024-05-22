package MasterPackage.Controller;

import MasterPackage.LoadAndSave.SaveData;
import MasterPackage.Utility.Accounting.Debt;
import MasterPackage.Utility.Accounting.Subscription;
import MasterPackage.Utility.Members.*;
import MasterPackage.Utility.Results.*;

import java.io.IOException;
import java.util.Scanner;

public final class MainMenu {
    //public static Scanner input = new Scanner(System.in);

    //Empty contructer - Private to ensure no instances of the class can be made.
    private MainMenu () {}

    public static void menu () throws IOException {
        Scanner input = new Scanner(System.in);
        int answer = 1;

        while (answer != 0) {
            System.out.println("""
                    1. Member options.
                    2. Competitive swimmer options.
                    3. Subscription options.
                    0.  Exit program.""");

            answer = input.nextInt();
            switch (answer) {
                case 1:
                    boolean bitchass = true;
                    while (bitchass) {
                        System.out.println("""
                                1. Create new member.
                                2. Edit member.
                                3. Show all members.
                                4. Delete member.
                                0. Go back.""");

                        int answer1 = input.nextInt();

                        switch (answer1) {
                            case 1:
                                CreateMember.createMember();
                                SaveData.saveDataInFile();
                                break;
                            case 2:
                                EditMember.editMember();
                                SaveData.saveDataInFile();
                                break;
                            case 3:
                                ShowMembers.showMembers();
                                SaveData.saveDataInFile();
                                break;
                            case 4:
                                DeleteMember.deleteMember();
                                SaveData.saveDataInFile();
                                break;
                            case 0:
                                bitchass = false;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    int answer2 = 1;
                    while (answer2 != 0) {
                        System.out.println("""
                                1. Show top 5 swimmers.
                                2. Register training results.
                                3. Register competition results.
                                4. Show training results for all swimmers.
                                5. Show competition results for all swimmers.
                                6. Show all competetitive swimmers.
                                0. Go back.""");

                        answer2 = input.nextInt();

                        switch (answer2) {
                            case 1:
                                Top5.printTopFiveCompMembers();
                                break;
                            case 2:
                                RegisterTrainingResults.registerTrainingResults();
                                break;
                            case 3:
                                RegisterCompetitionResults.registerCompetitionResults();
                                break;
                            case 4:
                                BestToWorstTrainingTimes.printBestToWorstTimes();
                                break;
                            case 5:
                                BestToWorstCompetitiveTimes.printBestToWorstCompetitiveTimes();
                                break;
                            case 6:
                                ShowCompMembers.listOfCompetetiveMembers();
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    int answer3 = 1;
                    while (answer3 != 0) {
                        System.out.println("""
                                1. Show subscription rates.
                                2. Show current yearly income.
                                3. Show a members subscription
                                4. Show members in debt.
                                5. Change subscription rates.
                                0. Go back.""");

                        answer3 = input.nextInt();

                        switch (answer3) {
                            case 1:
                                Subscription.showSubscriptionRates();
                                break;
                            case 2:
                                Subscription.showYearlySum();
                                break;
                            case 3:
                                double subscribtionFee = Subscription.calculateMembersSubscription();
                                if(subscribtionFee != 0) {
                                    System.out.printf("The members annual subscription fee is: %2.2f DKK. %n %n", subscribtionFee);
                                }else {
                                    System.out.println("Member not found");
                                }
                                break;
                            case 4:
                                Debt.checkDebt();
                                break;
                            case 5:
                                Subscription.editSubscriptionRates();
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;


            }
        }
    }
}