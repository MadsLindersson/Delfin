import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        LoadData.loadDataFromFiles();
        LoadData.readSubscriptionRatesFromFile();
        ShowCompMembers.sortCompMembers();
        //SortCompetitiveMembers.sortCrawlTime();
        //SortCompetitiveMembers.sortBackcrawlTime();
        //SortCompetitiveMembers.sortBreastTime();
        SortCompetitiveMembers.sortButterflyTime();
        MainMenu.menu();


    }
}