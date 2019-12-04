package crude;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login
{
	Connectionmanager con=new Connectionmanager();

	public void loginData() throws ClassNotFoundException, SQLException 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the username");
		String d=s.next();
		System.out.println("enter the password");
		String pw=s.next();
		Statement st=con.getConnection().createStatement();//callable statemnt to get some data
		ResultSet rs=st.executeQuery("select * from student where Reg_no=231");//result set 
		while(rs.next())
		{
			
			if(rs.getString(6).equals(d)&&rs.getString(7).equals(pw))
			{
				System.out.println("login verified");
			}
			else
				System.out.println("invalid");
		}
		con.getConnection().close();
	}

}
