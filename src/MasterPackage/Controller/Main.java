package MasterPackage.Controller;

import MasterPackage.LoadAndSave.LoadData;
import MasterPackage.Object.Member;
import MasterPackage.Utility.Members.ShowCompMembers;
import MasterPackage.Utility.Results.SortCompetitiveMembers;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        LoadData.loadDataFromFiles();
        LoadData.readSubscriptionRatesFromFile();
        ShowCompMembers.sortCompMembers();
        SortCompetitiveMembers.sortDisciplineTimes();
        MainMenu.menu();
    }
}