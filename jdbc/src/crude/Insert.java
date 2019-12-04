package crude;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.jdbc.PreparedStatement;

public class Insert {
	Connectionmanager con=new Connectionmanager();

	public void insertData() throws ClassNotFoundException, SQLException
	{
		Scanner s=new Scanner(System.in);
		
		Pattern use=Pattern.compile("(^[A-Z]+[a-z]*)");//username
		Pattern pswd=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");//password
		System.out.println("enter the name");
		String name=s.next();
		System.out.println("enter the reg no");
		int reg=s.nextInt();
		System.out.println("enter the department");
		String dep=s.next();
		System.out.println("enter the year");
		int y=s.nextInt();
		System.out.println("enter the address");
		String add=s.next();
		System.out.println("enter the username");
		String user=s.next();
		Matcher nm=use.matcher(user);
		System.out.println("enter the password");
		String pwd=s.next();
		Matcher pd=pswd.matcher(pwd);
		if(nm.matches()&&pd.matches())
		{
		 PreparedStatement ps=(PreparedStatement)con.getConnection().prepareStatement("insert into student(Name,Reg_no,Department,Year,Address,Username,Password)values(?,?,?,?,?,?,?)");//insert statement
		 ps.setString(1,name);
		 ps.setInt(2,reg);
		 ps.setString(3,dep);
		 ps.setInt(4,y);
		 ps.setString(5,add);
		 ps.setString(6,user);
		 ps.setString(7,pwd);
		 ps.executeUpdate();
		con.getConnection().close();
		System.out.println("successfull");
		}
		else 
		{
			if(!nm.matches())
				System.out.println("invalid user name");
			if(!pd.matches())
				System.out.println("invalid password");
			
			}
			
		Casestudy1 Case= new Casestudy1();
		Case.choice();
						
	}

}
