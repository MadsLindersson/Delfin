import java.util.ArrayList;
import java.util.Scanner;

public class CreateMember {

    public static void createMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Member");
        System.out.println("2. Competetive Member");
        int answer = scanner.nextInt();
        scanner.nextLine();
        if(answer == 1) {
            System.out.println("Enter member details:");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Age: ");
            int age = scanner.nextInt();
            System.out.println("Post number: ");
            boolean status = scanner.nextBoolean();
            System.out.println("Agegroup (True for senior): ");
            boolean ageGroup = scanner.nextBoolean();
            System.out.println("Debt: ");
            boolean debt = scanner.nextBoolean();
            System.out.println("Debt amount: ");
            double debtAmount = scanner.nextDouble();
            Member members = new Member(name, address, postNumber,
                    city,mobilePhone,email,licensenumber,driverSinceDate);
            Main.customers.add(customer);
        } if (answer == 2) {
            System.out.println("Enter customer details:");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Address: ");
            String address = scanner.nextLine();
            System.out.println("Post number: ");
            String postNumber = scanner.nextLine();
            System.out.println("City: ");
            String city = scanner.nextLine();
            System.out.println("Mobile phone: ");
            String mobilePhone = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();
            System.out.println("Company name: ");
            String companyName = scanner.nextLine();
            System.out.println("Company address: ");
            String companyAddress = scanner.nextLine();
            System.out.println("Company phone number: ");
            int companyPhoneNumber = scanner.nextInt();
            System.out.println("CRN: ");
            int CRN = scanner.nextInt();
            CompanyCustomerSub customer = new CompanyCustomerSub(name, address, postNumber,
                    city,mobilePhone,email,companyName,companyAddress, companyPhoneNumber, CRN);
            Main.customers.add(customer);
        } if(answer != 1 && answer != 2)  {
            System.out.println("Wrong input");
        }

}
