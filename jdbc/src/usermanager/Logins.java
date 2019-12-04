package usermanager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Logins {

	ConnectionManager con=new ConnectionManager();
	public void loginData() throws ClassNotFoundException, SQLException 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the user name");
		String newuser=s.next();
		System.out.println("enter the password");
		String newpwd=s.next();
		Statement st=con.getConnection().createStatement();
		ResultSet rs=st.executeQuery("select * from students");
		while(rs.next())
		{
			if(rs.getString(2).equals(newuser)&&rs.getString(3).equals(newpwd))
			{
				System.out.println("welcome to students");
			}
		}
		Statement st1=con.getConnection().createStatement();
		ResultSet rst=st.executeQuery("select * from admin");
		while(rst.next())
		{
			if(rst.getString(2).equals(newuser)&&rst.getString(3).equals(newpwd))
			{
				System.out.println("welcome to admin");
			}
		}
		First first=new First();
		first.add();

}
}