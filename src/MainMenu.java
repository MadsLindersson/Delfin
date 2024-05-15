import java.io.IOException;
import java.util.Scanner;

public final class MainMenu {
    public static Scanner input = new Scanner(System.in);

    //Empty contructer - Private to ensure no instances of the class can be made.
    private MainMenu () {}

    public static void menu () throws IOException {
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
                    int answer1 = 1;
                    while (answer1 != 0) {
                        System.out.println("""
                                1. Create new member.
                                2. Edit member.
                                3. Show all members.
                                4. Delete member.
                                0. Go back.""");

                        answer1 = input.nextInt();

                        switch (answer1) {
                            case 1:
                                SaveData.saveDataInFile();
                                break;
                            case 2:
                                SaveData.saveDataInFile();
                                break;
                            case 3:
                                break;
                            case 4:
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
                                1. Show top 5 swimmers in each disciplin.
                                2. Show training results for all swimmers.
                                3. Show competition results.
                                4. Show all competetitive swimmers.
                                0. Go back.""");

                        answer2 = input.nextInt();

                        switch (answer2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
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
                                break;
                            case 2:
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
                                break;
                            case 5:
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