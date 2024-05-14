public class Debt {

    public static void checkDebt() {
        for (Member member : Main.members) {
            if (member.isDebt()) {
                System.out.println("Name: " + member.getName() +"\n" + "ID: " + member.getId() + "\nDebt amount: " + member.getDebtAmount());
                System.out.println();
            } else {

            }
        }
    }
}