package homeworks.employeemanagement;

import java.util.Scanner;

public class EmployeeManagementMain {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();


    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    adCompany();
                    break;
                case "2":
                    addEmployee();
                    break;
                case "3":
                    companyStorage.print();
                    break;
                case "4":
                    employeeStorage.print();
                    break;
                case "5":
                    searchEmployeeById();
                    break;
                case "6":
                    searchCompanyById();
                    break;
                case "7":
                    deleteEmployee();
                    break;
                case "8":
                    deleteCompany();
                    break;
                case "9":
                    changeCompany();
                    break;
                case "10":
                    changeEmployee();
                    break;
                default:
                    System.out.println("Invalid command. Try again!");
            }
        }
    }

    private static void changeEmployee() {
        System.out.println("Please chose company");
        employeeStorage.print();
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyID);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyID + " does not exists!");
            return;
        }
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employeeFromeStorage = employeeStorage.getById(employeeId);
        if (employeeFromeStorage != null) {
            System.out.println("Employee with " + employeeId + " id already exists!");
            return;
        }
        System.out.println("Please input employee name");
        String employeeName = scanner.nextLine();
        System.out.println("Please input employee surname");
        String employeeSurname = scanner.nextLine();
        System.out.println("PLease input employee phone");
        String employeePhone = scanner.next();
        System.out.println("Please input employee salary AMD");
        double employeeSalary = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input employee position");
        String employeePosition = scanner.nextLine();
        employeeFromeStorage.setName(employeeName);
        employeeFromeStorage.setSurname(employeeSurname);
        employeeFromeStorage.setPhone(employeePhone);
        employeeFromeStorage.setSalary(employeeSalary);
        employeeFromeStorage.setPosition(employeePosition);
        System.out.println("Employee updated!");
    }

    private static void changeCompany() {
        System.out.println("Please input company id");
        scanner.nextLine();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage != null) {
            System.out.println("Company with " + companyId + " does not exists!");
            return;
        }
        System.out.println("Please input new company name");
        String companyName = scanner.nextLine();
        System.out.println("Please input new company address");
        String companyAddress = scanner.nextLine();
        companyFromStorage.setName(companyName);
        companyFromStorage.setAddress(companyAddress);
        System.out.println("Company updating");
    }

    private static void deleteCompany() {
        System.out.println("Please chose company id");
        employeeStorage.print();
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyID);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyID + " does not exists!");
            return;
        }
        companyStorage.deleteById(companyID);
    }

    private static void deleteEmployee() {
        System.out.println("Please chose company id");
        employeeStorage.print();
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyID);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyID + " does not exists!");
            return;
        }
        employeeStorage.searchEmployeesByCompany(companyFromStorage);
        System.out.println();
        System.out.println("Please input employee by id");
        String employeeId = scanner.next();
        Employee employeeFromStorage = employeeStorage.getById(employeeId);
        if (employeeFromStorage == null) {
            System.out.println("Employee does not exists!");
            return;
        }
        if (!employeeFromStorage.getCompany().equals(companyFromStorage)) {
            System.out.println("Wrong employee id");
            return;
        }
        employeeStorage.deleteById(employeeId);
    }

    private static void searchCompanyById() {
        System.out.println("Please chose company id");
        employeeStorage.print();
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyID);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyID + " does not exists!");
            return;
        }
        employeeStorage.searchEmployeesByCompany(companyFromStorage);
    }

    private static void searchEmployeeById() {
        System.out.println("Please input employee by id");
        String employeeId = scanner.next();
        Employee byId = employeeStorage.getById(employeeId);
        if (byId == null) {
            System.out.println("Employee does not exists!");
        } else
            System.out.println(byId);
    }

    private static void addEmployee() {
        System.out.println("Please chose company id");
        companyStorage.print();
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyID);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyID + " does not exists!");
            return;
        }
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employeeFromeStorage = employeeStorage.getById(employeeId);
        if (employeeFromeStorage != null) {
            System.out.println("Employee with " + employeeId + " id already exists!");
            return;
        }
        System.out.println("Please input employee name");
        String employeeName = scanner.nextLine();
        System.out.println("Please input employee surname");
        String employeeSurname = scanner.nextLine();
        System.out.println("PLease input employee phone");
        String employeePhone = scanner.next();
        System.out.println("Please input employee position");
        String employeePosition = scanner.nextLine();
        System.out.println("Please input employee salary AMD");
        double employeeSalary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(employeeId, employeeName, employeeSurname, employeePhone, companyFromStorage, employeeSalary, employeePosition);
        employeeStorage.add(employee);
        System.out.println("Employee registered!");
    }

    private static void adCompany() {
        System.out.println("Please input company id");
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage != null) {
            System.out.println("Company with " + companyId + " already exists!");
            return;
        }
        System.out.println("Please input company name");
        String companyName = scanner.nextLine();
        System.out.println("Please input company address");
        String companyAddress = scanner.nextLine();
        Company company = new Company(companyId, companyName, companyAddress);
        companyStorage.add(company);
        System.out.println("Company registered");
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input |1| for ADD_COMPANY");
        System.out.println("Please input |2| for ADD_EMPLOYEE");
        System.out.println("Please input |3| for PRINT_ALL_COMPANIES");
        System.out.println("Please input |4| for PRINT_ALL_EMPLOYEES");
        System.out.println("Please input |5| for SEARCH_EMPLOYEE_BY_ID");
        System.out.println("Please input |6| for SEARCH_EMPLOYEE_BY_COMPANY");
        System.out.println("Please input |7| for DELETE_COMPANY");
        System.out.println("Please input |8| for DELETE_EMPLOYEE");
        System.out.println("Please input |9| for CHANGE_COMPANY");
        System.out.println("Please input |10| for CHANGE_EMPLOYEE");
    }
}