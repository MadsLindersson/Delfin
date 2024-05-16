import java.util.ArrayList;

public class ShowCompMembers {
    public ShowCompMembers() {
        ArrayList<CompetetiveMember> crawlList = new ArrayList<>();
        ArrayList<CompetetiveMember> butterflyList = new ArrayList<>();
        ArrayList<CompetetiveMember> backcrawlList = new ArrayList<>();
        ArrayList<CompetetiveMember> breastList = new ArrayList<>();

        for(Member compMember : Main.members){
            if (compMember instanceof CompetetiveMember) {
                if (((CompetetiveMember) compMember).isCrawl()){
                    crawlList.add((CompetetiveMember) compMember);
                }else if (((CompetetiveMember) compMember).isButterfly()){
                    butterflyList.add((CompetetiveMember) compMember);
                }else if (((CompetetiveMember) compMember).isBackcrawl()){
                    backcrawlList.add((CompetetiveMember) compMember);
                }else if (((CompetetiveMember) compMember).isBreast()){
                    breastList.add((CompetetiveMember) compMember);
                }
            }
        }
    }
}
