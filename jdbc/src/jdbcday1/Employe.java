package jdbcday1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employe {

	private static Connection connection;
	static Scanner scanner=new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		Employe emp=new Employe();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String url="jdbc:mysql://localhost:3306/jdbc";
			String user="root";
			String pass="Sa123";
			Connection Connection=DriverManager.getConnection(url,user,pass);
			String query ="insert into studentdb(empid,empname,empsal,depname) values(?,?,?,?)";
			System.out.println("enter  one number");
			System.out.println("enter 1 for enter  empid");
			System.out.println("enter 2 for enter  empname");
			System.out.println("enter 3 for enter  empsal");
			System.out.println("enter 4 for enter  depname");
			int choice=scanner.nextInt();
					switch(choice) {
					case 1: emp.insertEmploye();
					break;
					
					case 2: emp.selectEmployeById();
					break;
					
					case 3:emp.selectAllEmploye();
					break;
					
					case 4: emp.updateEmploye();
					break;
					
					case 5:emp.deleteEmploye();
					break;
					default :
						System.out.println();
					}
		}
		
			
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}
	 public static void insertEmploye() throws SQLException {
	        System.out.println("Enter Employee ID:");
	        int id = scanner.nextInt();
	        System.out.println("Enter Employee Name:");
	        String name = scanner.next();
	        System.out.println("Enter Employee Salary:");
	        double salary = scanner.nextDouble();
	        System.out.println("Enter Employee Department:");
	        String department = scanner.next();

	        String sql = "INSERT INTO employe (ID, Name, Salary, Department) VALUES (?, ?, ?, ?)";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setInt(1, id);
	        statement.setString(2, name);
	        statement.setDouble(3, salary);
	        statement.setString(4, department);

	        int rowsInserted = statement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("A new employee was inserted successfully!");
	        }
	    }
	 public static void selectEmployeById() throws SQLException {
	        System.out.println("Enter Employee ID:");
	        int id = scanner.nextInt();
	        String sql = "SELECT * FROM employees WHERE ID = ?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setInt(1, id);
	        ResultSet result = statement.executeQuery();

	        if (result.next()) {
	            System.out.println("ID: " + result.getInt("ID"));
	            System.out.println("Name: " + result.getString("Name"));
	            System.out.println("Salary: " + result.getDouble("Salary"));
	            System.out.println("Department: " + result.getString("Department"));
	        } else {
	            System.out.println("No employee found with ID: " + id);
	        }
	    }
		
	 public static void selectAllEmploye() throws SQLException {
	        String sql = "SELECT * FROM employees";
	        Statement statement = connection.createStatement();
	        ResultSet result = statement.executeQuery(sql);

	        while (result.next()) {
	            System.out.println("ID: " + result.getInt("ID"));
	            System.out.println("Name: " + result.getString("Name"));
	            System.out.println("Salary: " + result.getDouble("Salary"));
	            System.out.println("Department: " + result.getString("Department"));
	            System.out.println("----------------------");
	        }
	    }
	 
	 
	    public static void updateEmploye() throws SQLException {
	        System.out.println("Enter Employee ID:");
	        int id = scanner.nextInt();
	        System.out.println("Enter new Salary:");
	        double salary = scanner.nextDouble();
	        
	        String sql = "UPDATE employees SET Salary = ? WHERE ID = ?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setDouble(1, salary);
	        statement.setInt(2, id);

	        int rowsUpdated = statement.executeUpdate();
	        if (rowsUpdated > 0) {
	            System.out.println("Employee details updated !");
	        } else {
	            System.out.println("No employee found with ID: " + id);
	        }
	    }

	    public static void deleteEmploye() throws SQLException {
	        System.out.println("Enter Employee ID:");
	        int id = scanner.nextInt();
	        
	        String sql = "DELETE FROM employees WHERE ID = ?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setInt(1, id);

	        int rowsDeleted = statement.executeUpdate();
	        if (rowsDeleted > 0) {
	            System.out.println("Employee deleted successfully!");
	        } else {
	            System.out.println("No employee found with ID: " + id);
	        }
	    }
}




		
		
		