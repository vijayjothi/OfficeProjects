package EmployeeManagement;

import java.sql.*;

public class EmployeeDaoImpl implements EmployeeDaoInterface{
    Connection con;
    @Override
    public void createEmployee(Employee emp) {
        con=DbConnection.createDBConnection();
        String query="insert into employee values(?,?,?,?)";
        try {
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,emp.getId());
            pstm.setString(2,emp.getName());
            pstm.setDouble(3,emp.getSalary());
            pstm.setInt(4,emp.getAge());
            int count=pstm.executeUpdate();
            if (count!=0){
                System.out.println("Employee has successfully updated");
            }
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }

    @Override
    public void showAllEmployees() {
        con=DbConnection.createDBConnection();
        String query="select * from employee";
        System.out.println("Employee Details");
        System.out.format("%s\t %s\t %s\t %s\n","ID","Name","Salary","Age");
        System.out.println("----------------------------------------------------");
        try {
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(query);
            while (result.next()){
                System.out.format("%d\t %s\t %d\t %d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getInt(4));
                System.out.println("----------------------------------------------------");
            }
        }catch (Exception ex){
            ex.getStackTrace();
        }

    }

    @Override
    public void showEmployeeBasedOnId(int id) {
        con=DbConnection.createDBConnection();
        String query="select * from employee where id="+id;
        try {
            Statement stmt=con.createStatement();
            ResultSet result=stmt.executeQuery(query);
            while (result.next()){
                System.out.format("%d\t %s\t %d\t %d\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getInt(3),
                        result.getInt(4));
            }
        }catch (Exception ex){
            ex.getStackTrace();
        }

    }

    @Override
    public void updateEmployee(int id, String name) {
        con=DbConnection.createDBConnection();
        String query="update employee set name=? where id=?";
        try {
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setString(1,name);
            pstm.setInt(2,id);
            int count=pstm.executeUpdate();
            if (count!=0){
                System.out.println("Employee Details updated successfully !!");
            }
        }catch (Exception ex){
            ex.getStackTrace();
        }

    }

    @Override
    public void deleteEmployee(int id) {
        con=DbConnection.createDBConnection();
        String query="delete from employee where id=?";
        try {
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,id);
            int count=pstm.executeUpdate();
            if (count!=0){
                System.out.println("Employee deleted successfully");
            }
        }catch (Exception ex){
            ex.getStackTrace();
        }

    }
}
