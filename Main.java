package Company;


public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        hireEmployees(company);
        fireHalfEmployees(company);
    }

    private static void fireHalfEmployees(Company company){
        int countEmployees = company.countEmployee();
        for (int i = 0; i < countEmployees / 2; i++) {
            int index = (int) (Math.random() * company.countEmployee());
            Employee loser = company.getEmployees().get(index);
            company.fire(loser);
        }
        System.out.println("Уволено " + countEmployees / 2 + " сотрудников");

    }

    private static void hireEmployees(Company company) {

        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator();
            company.hire(operator);
        }

        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager();
            company.hire(manager);
        }

        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager();
            company.hire(topManager);
        }

        System.out.println("Добавлено сотрудников: " + company.countEmployee());
    }
}