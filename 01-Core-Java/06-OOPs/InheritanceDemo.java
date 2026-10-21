class Employee {
    int id;
    String name;
    double baseSalary;

    Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: Rs. " + baseSalary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(int id, String name, double baseSalary, String programmingLanguage) {
        super(id, name, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayRole() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Language: " + programmingLanguage);
    }
}

class SeniorDeveloper extends Developer {
    int teamSize;

    SeniorDeveloper(int id, String name, double baseSalary, String programmingLanguage, int teamSize) {
        super(id, name, baseSalary, programmingLanguage);
        this.teamSize = teamSize;
    }

    void displayLeadInfo() {
        displayRole();
        System.out.println("Team Size Managed: " + teamSize);
    }
}

class Manager extends Employee {
    String department;

    Manager(int id, String name, double baseSalary, String department) {
        super(id, name, baseSalary);
        this.department = department;
    }

    void displayManager() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Department: " + department);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance (Developer) ---");
        Developer dev = new Developer(201, "Aman", 65000, "Java");
        dev.displayRole();

        System.out.println("\n--- Multilevel Inheritance (SeniorDeveloper) ---");
        SeniorDeveloper srDev = new SeniorDeveloper(202, "Rohan", 120000, "Java & Spring", 8);
        srDev.displayLeadInfo();

        System.out.println("\n--- Hierarchical Inheritance (Manager) ---");
        Manager mgr = new Manager(101, "Neha", 95000, "Operations");
        mgr.displayManager();
    }
}
