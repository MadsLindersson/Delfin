import java.util.InputMismatchException;
import java.util.Scanner;

public class EditMember {
    public static void editMember() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the ID of the member you want to edit: ");
            int memberID = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            Member memberToEdit = null;
            for (Member member : Main.members) {
                if (member.getId() == memberID) {
                    memberToEdit = member;
                    break;
                }
            }

            if (memberToEdit != null) {
                System.out.println(memberToEdit);
                boolean continueEdit = true;

                while (continueEdit) {
                    System.out.println("Choose the information to update:");
                    System.out.println("1. Name");
                    System.out.println("2. Age");
                    System.out.println("3. ID");
                    System.out.println("4. Activity status");
                    System.out.println("5. Age group");
                    System.out.println("6. Debt");
                    System.out.println("7. Debt amount");
                    System.out.println("0. Return to menu");

                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over

                    switch (choice) {
                        case 1:
                            System.out.print("Enter new name: ");
                            String newName = scanner.nextLine();
                            memberToEdit.setName(newName);
                            break;
                        case 2:
                            System.out.print("Enter new age: ");
                            int newAge = scanner.nextInt();
                            memberToEdit.setAge(newAge);
                            break;
                        case 3:
                            System.out.print("Enter new ID: ");
                            int newId = scanner.nextInt();
                            memberToEdit.setId(newId);
                            break;
                        case 4:
                            System.out.print("Enter new activity status (true for active, false for inactive): ");
                            boolean newStatus = scanner.nextBoolean();
                            memberToEdit.setStatus(newStatus);
                            break;
                        case 5:
                            System.out.print("Enter new age group (true for over 18, false for under 18): ");
                            boolean newAgeGroup = scanner.nextBoolean();
                            memberToEdit.setAgeGroup(newAgeGroup);
                            break;
                        case 6:
                            System.out.print("Enter the member's debt status (true for has debt, false for no debt): ");
                            boolean newDebtStatus = scanner.nextBoolean();
                            memberToEdit.setDebt(newDebtStatus);
                            break;
                        case 7:
                            System.out.print("Enter the member's debt amount: ");
                            double newDebtAmount = scanner.nextDouble();
                            memberToEdit.setDebtAmount(newDebtAmount);
                            break;
                        case 0:
                            continueEdit = false;
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    System.out.println("Member information updated successfully");
                }
            } else {
                System.out.println("Member with ID " + memberID + " not found.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type.");
            scanner.nextLine(); // Clear the buffer
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}