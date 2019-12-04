package crude;

import java.sql.SQLException;
import java.util.Scanner;

public class Casestudy1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
	   Casestudy1 Case= new Casestudy1();
	   Case.choice();

	}
	public void choice() throws SQLException, ClassNotFoundException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1)insert\n2)view\n3)update\n4)delete\n5)login\n6)exit");
		System.out.println("enter the choice");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			Insert insert=new Insert();
			insert.insertData();
		break;
		case 2:
			View view=new View();
			view.viewData();
		break;
		case 3:
			Update update=new Update();
			update.updateData();
		break;
		case 4:
			Delete delete=new Delete();
			delete.deleteData();
		break;
		case 5:
			Login login=new Login();
			login.loginData();
		case 6:
			System.out.println("exit");
		break;
		}
	}

}
