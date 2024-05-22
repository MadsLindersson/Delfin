public final class SortCompetitiveMembers {

    private SortCompetitiveMembers ()   {}

    public static void sortDisciplineTimes()  {
        boolean swapped;
        //Sorts juniorButterflyList in best time
        for(int i = 0; i < ShowCompMembers.juniorButterflyList.size() - 1; i++)  {
            swapped = false;
            for(int j = 0; j < ShowCompMembers.juniorButterflyList.size()-1; j++)   {
                if(ShowCompMembers.juniorButterflyList.get(j).getBestButterflyTime() > ShowCompMembers.juniorButterflyList.get(j+1).getBestButterflyTime()) {
                    CompetetiveMember temp = ShowCompMembers.juniorButterflyList.get(j);
                    ShowCompMembers.juniorButterflyList.set(j, ShowCompMembers.juniorButterflyList.get(j + 1));
                    ShowCompMembers.juniorButterflyList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        //Sorts seniorButterflyList in best time
        for(int i = 0; i < ShowCompMembers.seniorButterflyList.size() - 1; i++)  {
            swapped = false;
            for(int j = 0; j < ShowCompMembers.seniorButterflyList.size()-1; j++)   {
                if(ShowCompMembers.seniorButterflyList.get(j).getBestButterflyTime() > ShowCompMembers.seniorButterflyList.get(j+1).getBestButterflyTime()) {
                    CompetetiveMember temp = ShowCompMembers.seniorButterflyList.get(j);
                    ShowCompMembers.seniorButterflyList.set(j, ShowCompMembers.seniorButterflyList.get(j + 1));
                    ShowCompMembers.seniorButterflyList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        //Sorts juniorCrawlList in best time
        for(int i = 0; i < ShowCompMembers.juniorCrawlList.size() - 1; i++)  {
            swapped = false;
            for(int j = 0; j < ShowCompMembers.juniorCrawlList.size()-1; j++)   {
                if(ShowCompMembers.juniorCrawlList.get(j).getBestButterflyTime() > ShowCompMembers.juniorCrawlList.get(j+1).getBestButterflyTime()) {
                    CompetetiveMember temp = ShowCompMembers.juniorCrawlList.get(j);
                    ShowCompMembers.juniorCrawlList.set(j, ShowCompMembers.juniorCrawlList.get(j + 1));
                    ShowCompMembers.juniorCrawlList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        //Sorts seniorCrawlList in best time
        for(int i = 0; i < ShowCompMembers.seniorCrawlList.size() - 1; i++)  {
            swapped = false;
            for(int j = 0; j < ShowCompMembers.seniorCrawlList.size()-1; j++)   {
                if(ShowCompMembers.seniorCrawlList.get(j).getBestButterflyTime() > ShowCompMembers.seniorCrawlList.get(j+1).getBestButterflyTime()) {
                    CompetetiveMember temp = ShowCompMembers.seniorCrawlList.get(j);
                    ShowCompMembers.seniorCrawlList.set(j, ShowCompMembers.seniorCrawlList.get(j + 1));
                    ShowCompMembers.seniorCrawlList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        //Sorts juniorBackcrawlList in best time
        for(int i = 0; i < ShowCompMembers.juniorBackcrawlList.size() - 1; i++)  {
            swapped = false;
            for(int j = 0; j < ShowCompMembers.juniorBackcrawlList.size()-1; j++)   {
                if(ShowCompMembers.juniorBackcrawlList.get(j).getBestButterflyTime() > ShowCompMembers.juniorBackcrawlList.get(j+1).getBestButterflyTime()) {
                    CompetetiveMember temp = ShowCompMembers.juniorBackcrawlList.get(j);
                    ShowCompMembers.juniorBackcrawlList.set(j, ShowCompMembers.juniorBackcrawlList.get(j + 1));
                    ShowCompMembers.juniorBackcrawlList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        //Sorts seniorBackcrawlList in best time
        for(int i = 0; i < ShowCompMembers.seniorBackcrawlList.size() - 1; i++)  {
            swapped = false;
            for(int j = 0; j < ShowCompMembers.seniorBackcrawlList.size()-1; j++)   {
                if(ShowCompMembers.seniorBackcrawlList.get(j).getBestButterflyTime() > ShowCompMembers.seniorBackcrawlList.get(j+1).getBestButterflyTime()) {
                    CompetetiveMember temp = ShowCompMembers.seniorBackcrawlList.get(j);
                    ShowCompMembers.seniorBackcrawlList.set(j, ShowCompMembers.seniorBackcrawlList.get(j + 1));
                    ShowCompMembers.seniorBackcrawlList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        //Sorts juniorBreastList in best time
        for(int i = 0; i < ShowCompMembers.juniorBreastList.size() - 1; i++)  {
            swapped = false;
            for(int j = 0; j < ShowCompMembers.juniorBreastList.size()-1; j++)   {
                if(ShowCompMembers.juniorBreastList.get(j).getBestButterflyTime() > ShowCompMembers.juniorBreastList.get(j+1).getBestButterflyTime()) {
                    CompetetiveMember temp = ShowCompMembers.juniorBreastList.get(j);
                    ShowCompMembers.juniorBreastList.set(j, ShowCompMembers.juniorBreastList.get(j + 1));
                    ShowCompMembers.juniorBreastList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        //Sorts seniorBreastList in best time
        for(int i = 0; i < ShowCompMembers.seniorBreastList.size() - 1; i++)  {
            swapped = false;
            for(int j = 0; j < ShowCompMembers.seniorBreastList.size()-1; j++)   {
                if(ShowCompMembers.seniorBreastList.get(j).getBestButterflyTime() > ShowCompMembers.seniorBreastList.get(j+1).getBestButterflyTime()) {
                    CompetetiveMember temp = ShowCompMembers.seniorBreastList.get(j);
                    ShowCompMembers.seniorBreastList.set(j, ShowCompMembers.seniorBreastList.get(j + 1));
                    ShowCompMembers.seniorBreastList.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
