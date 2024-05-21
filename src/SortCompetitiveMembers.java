import java.util.ArrayList;

public final class SortCompetitiveMembers {

    private SortCompetitiveMembers ()   {}

    public static void sortButterflyTime ()  {
        boolean swapped;

        for(int i = 0; i < ShowCompMembers.juniorButterflyList.size() - 1; i++)  {
            swapped = false;
            for(int j = 0; j < ShowCompMembers.juniorButterflyList.size()-1; i++)   {
                if(ShowCompMembers.juniorButterflyList.get(j).getBestButterflyTime() > ShowCompMembers.juniorButterflyList.get(j+1).getBestButterflyTime()) {
                    CompetetiveMember temp = ShowCompMembers.juniorButterflyList.get(j);
                    ShowCompMembers.juniorButterflyList.set(j, ShowCompMembers.juniorButterflyList.get(j + 1));
                    ShowCompMembers.juniorButterflyList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void sortBreastTime ()  {

    }

    public static void sortBackcrawlTime ()  {

    }

    public static void sortCrawlTime ()  {

    }
}
