package design;

public abstract class MyEmployeeClass implements Employee {

    public int employeeId() {
        System.out.println("001");
        return 0;
    }


    public String employeeName() {
        System.out.println("jack");
        return null;
    }


    public void assignDepartment() {
        System.out.println("Finance");


    }


    public int calculateSalary() {
        System.out.println("100k");
        return 0;
    }


    public void benefitLayout() {
        System.out.println("No benefits");

    }


    public void companyName() {

    }

}
