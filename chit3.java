//~Design and develop inheritance for a given case study, identify objects and relationships and implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address, Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net salary.

class Employee {
    private String empName;
    private String empId;
    private String address;
    private String mailId;
    private String mobileNo;

    public Employee(String empName, String empId, String address, String mailId, String mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getAddress() {
        return address;
    }

    public String getMailId() {
        return mailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }
}

class Programmer extends Employee {
    private double basicPay;

    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public double getDA() {
        return basicPay * 0.97;
    }

    public double getHRA() {
        return basicPay * 0.10;
    }

    public double getPF() {
        return basicPay * 0.12;
    }

    public double getStaffClubFund() {
        return basicPay * 0.001;
    }

    public double getGrossSalary() {
        return basicPay + getDA() + getHRA();
    }

    public double getNetSalary() {
        return getGrossSalary() - getPF() - getStaffClubFund();
    }

    public void generatePaySlip() {
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Employee ID: " + getEmpId());
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("Net Salary: " + getNetSalary());
    }
}

class TeamLead extends Programmer {
    public TeamLead(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssistantProjectManager extends Programmer {
    public AssistantProjectManager(String empName, String empId, String address, String mailId, String mobileNo,
            double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class ProjectManager extends Programmer {
    public ProjectManager(String empName, String empId, String address, String mailId, String mobileNo,
            double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

public class chit3 {
    public static void main(String[] args) {
        //Employee emp1 = new Employee("Vaibhav sapate", "E001", "99 Vaishnavi sadan kewad", "vaibhav@example.com", "555-555-1212");
        Programmer emp2 = new Programmer("Moneysh Ambuse", "E002", "456 Main road Dharashiv", "jane.Money@example.com", "555-555-1213", 10000.00);
        TeamLead emp3 = new TeamLead("Prathmesh", "E003", "789 Industrial Boulevard", "pra.thmesh@example.com",
                "555-555-1214", 12000.00);
        AssistantProjectManager emp4 = new AssistantProjectManager("Aniket Tiwari", "E004", "321 Tech Road",
                "anni.tiwari@example.com", "555-555-1215", 14000.00);
        ProjectManager emp5 = new ProjectManager("Saiee", "E005", "159 Business Park",
                "saiee.k@example.com", "555-555-1216", 16000.00);

        emp2.generatePaySlip();
        emp3.generatePaySlip();
        emp4.generatePaySlip();
        emp5.generatePaySlip();
    }
}
