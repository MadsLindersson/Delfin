import java.util.Scanner;

public class DeleteMember {
    public static void deleteMember() {
        Scanner scanner = new Scanner(System.in);
        for (Member member : Main.members) {
            System.out.println(member.getName() + " - Member ID: " + member.getId());
        }
        System.out.print("Enter the members ID you want to delete: ");
        int idNumber = scanner.nextInt();

        // Find the member
        Member memberToRemove = null;
        for (Member member : Main.members) {
            if (member.getId() == idNumber) {
                memberToRemove = member;
                break;
            }
        }

        if (memberToRemove == null) {
            System.out.println("Member with " + idNumber + "not found.");
            return;
        }

        // Remove the member for list of members.
        Main.members.remove(memberToRemove);
    }
}
