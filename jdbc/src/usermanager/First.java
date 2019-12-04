package usermanager;

import java.sql.SQLException;
import java.util.Scanner;

import crude.Insert;
import crude.Login;

public class First {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		First first=new First();
		first.add();
	}

	public void add() throws ClassNotFoundException, SQLException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1)insert\n2)login\n3)exit");
		System.out.println("enter the choice");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			Inserts insert=new Inserts();
			insert.insertData();
		break;
		case 2:
			Logins login=new Logins();
			login.loginData();
		break;
		case 3:
			System.out.println("exit");
		break;
		}
	}

}
