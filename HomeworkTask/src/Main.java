public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmploye(new Person("Anna", "wanna", "Alpha"));
        employeeList.addEmploye(new Person("Marek", "Jan", "Beta"));

        employeeList.employeeAlphaProject();
        employeeList.uniqueProject();
    }
}