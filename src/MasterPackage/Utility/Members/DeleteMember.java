package MasterPackage.Utility.Members;

import MasterPackage.Controller.Main;
import MasterPackage.Object.Member;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteMember {
    public static void deleteMember() {
        Scanner scanner = new Scanner(System.in);
        try {
            for (Member member : Main.members) {
                System.out.println(member.getName() + " - Member ID: " + member.getId());
            }
            System.out.print("Enter the member's ID you want to delete: ");
            int idNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            // Find the member
            Member memberToRemove = null;
            for (Member member : Main.members) {
                if (member.getId() == idNumber) {
                    memberToRemove = member;
                    break;
                }
            }

            if (memberToRemove == null) {
                System.out.println("Member with ID " + idNumber + " not found.");
            } else {
                // Remove the member from the list of members.
                Main.members.remove(memberToRemove);
                System.out.println("Member with ID " + idNumber + " has been removed.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid ID number.");
            scanner.nextLine(); // Clear the buffer
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
