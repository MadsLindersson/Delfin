import java.util.Scanner;

public final class MainMenu {
    Scanner input = new Scanner (System.in);

    //Empty contructer
    private MainMenu () {}

    public static void menu (Scanner input) {
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
                    //memberMenu(input);
                    int answer1 = 1;
                    while (answer1 != 0) {
                        System.out.println("""
                                1. Create new member.
                                2. Edit member.
                                3. Show all members.
                                0. Go back.""");

                        answer1 = input.nextInt();

                        switch (answer1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                break;

                        }
                    }
                    break;
                case 2:
                    //competetiveMenu(input);
                    int answer2 = 1;
                    while (answer2 != 0) {
                        System.out.println("""
                                1. Show top 5 swimmers in each disciplin.
                                2. Show training results for all swimmers.
                                3. Show competition results.
                                4. Show all swimmers.
                                0. Go back.""");                   //Sorteres i grupper

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
                    //subscriptionMenu(input);
                    int answer3 = 1;
                    while (answer3 != 0) {
                        System.out.println("""
                                1. Show subscription rates.
                                2. Show current yearly income.
                                3. Show members in debt.
                                0. Go back.""");

                        answer3 = input.nextInt();

                        switch (answer3) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
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