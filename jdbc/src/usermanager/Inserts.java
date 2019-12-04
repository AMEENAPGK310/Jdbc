package usermanager;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.jdbc.PreparedStatement;

public class Inserts
{
	ConnectionManager con=new ConnectionManager();
	public void insertData() throws ClassNotFoundException, SQLException 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1)Student\n2)Admin");
		System.out.println("enter the choice");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			Pattern em=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
			Pattern pwd=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
			System.out.println("enter the student id");
			int sid=s.nextInt();
			System.out.println("enter the username");
			String suser=s.next();
			Matcher nm=em.matcher(suser);
			System.out.println("enter the password");
			String spwd=s.next();
			Matcher pd=pwd.matcher(spwd);
			if(nm.matches()&&pd.matches())
			{
			 PreparedStatement ps=(PreparedStatement)con.getConnection().prepareStatement("insert into students(Id,Username,Password)values(?,?,?)");//insert statement
			 ps.setInt(1,sid);
			 ps.setString(2,suser);
			 ps.setString(3,spwd);
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
        break;
		case 2:
			Pattern am=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
			Pattern ad=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
			System.out.println("enter the admin id");
			int aid=s.nextInt();
			System.out.println("enter the username");
			String auser=s.next();
			Matcher m=am.matcher(auser);
			System.out.println("enter the password");
			String apwd=s.next();
			Matcher k=ad.matcher(apwd);
			if(m.matches()&&k.matches())
			{
			 PreparedStatement kl=(PreparedStatement)con.getConnection().prepareStatement("insert into admin(Id,Username,Password)values(?,?,?)");//insert statement
			 kl.setInt(1,aid);
			 kl.setString(2,auser);
			 kl.setString(3,apwd);
			 kl.executeUpdate();
			 con.getConnection().close();
			 System.out.println("successfull");
			}
			else 
				{
					if(!m.matches())
						System.out.println("invalid user name");
					if(!k.matches())
						System.out.println("invalid password");
				}
		}
			First first=new First();
			first.add();
		
		
	}

}