package Company;

public class Manager implements Employee {
    private static int FixSalary = 70000;
    private int profit;

    public Manager(){
        this.profit = (int) (Math.random() * 25000) + 150000;
    }

    public int getMonthSalary(){
        return FixSalary +  (int) (profit * 0.05);
    }

}
