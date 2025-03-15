abstract class Employee {
    public String name;
    public int employeeId;
    public double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }

    public abstract void displayInfo();

}

class FullTimeEmployee extends Employee {
   public double bonus;

   FullTimeEmployee(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }

}

class PartTimeEmployee extends Employee {
    public int hoursWorked;

    PartTimeEmployee(String name, int employeeId, double salary, int hoursWorked) {
        super(name, employeeId, salary);
        this.hoursWorked = hoursWorked;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Hours Worked: " + hoursWorked);
    }
}


class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("John", 101, 50000, 5000);
        employees[1] = new PartTimeEmployee("Mike", 102, 20000, 40);

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}
