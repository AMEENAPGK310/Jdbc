package jdbc;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connectionmanager {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");//register the drive
		Connection con=null;//create connection object
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Connection","root","");//create a connection
		                                //(API:database://server name:port number/database name/username/password)
		if(con!=null)//connection checking
			System.out.println("connection successfull");
		else
			System.out.println("check connection");
		con.close();//connection close
		
	}

}
