package jdbcday1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
 
public class StudentDb {

	public static void main(String[] args) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Scanner scanner=new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306/jdbc";
	String user="root";
	String pass="Sa123";
	
	Connection connection=DriverManager.getConnection(url,user,pass);
	String query ="insert into studentdb(id,name,percentage,address) values(?,?,?,?)";
	PreparedStatement preparedStatement =connection.prepareStatement(query);
	
	System.out.println("please enter the id");
	preparedStatement.setInt(1,scanner.nextInt());
	
	System.out.println("please enter the name");
	preparedStatement.setString(2,scanner.next());
	
	System.out.println("please enter the percentage");
	preparedStatement.setDouble(3,scanner.nextDouble());
	
	System.out.println("please enter the address");
	preparedStatement.setString(4,scanner.next());
	
	int execute = preparedStatement.executeUpdate();
	System.out.println(execute);
	connection.close();
	
//	Statement statement=connection.createStatement();
	
//	int executeUpdate=statement.executeUpdate(query);
	
	
//	System.out.println(executeUpdate);
	
	}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
