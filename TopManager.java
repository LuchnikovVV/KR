package Company;

public class TopManager implements Employee{
    private static int FixSalary = 200000;

    public int getMonthSalary(){
        if(Company.getIncome() > 10000000)
            return FixSalary + (int)(FixSalary * 1.5);
        else return FixSalary;

    }
}
