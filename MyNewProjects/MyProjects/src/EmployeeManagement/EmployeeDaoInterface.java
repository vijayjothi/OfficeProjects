package EmployeeManagement;

public interface EmployeeDaoInterface {

    void createEmployee(Employee emp);
    void showAllEmployees();
    void showEmployeeBasedOnId(int id);
    void updateEmployee(int id,String name);
    void deleteEmployee(int id);
}
