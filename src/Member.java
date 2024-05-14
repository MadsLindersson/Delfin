public class Member {
    private String name;

    private int age;

    private int id;

    private boolean status;

    private boolean ageGroup;

    private boolean debt;

    private double debtAmount;

    public Member(String name, int age, int id, boolean status, boolean ageGroup, boolean debt, double debtAmount) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.status = status;
        this.ageGroup = ageGroup;
        this.debt = debt;
        this.debtAmount = debtAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(boolean ageGroup) {
        this.ageGroup = ageGroup;
    }

    public boolean isDebt() {
        return debt;
    }

    public void setDebt(boolean debt) {
        this.debt = debt;
    }

    public double getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(double debtAmount) {
        this.debtAmount = debtAmount;
    }

}

