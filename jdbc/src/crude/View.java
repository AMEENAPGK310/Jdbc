package crude;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View 
{
	Connectionmanager con=new Connectionmanager();
	public void viewData() throws ClassNotFoundException, SQLException 
	{
		Statement st=con.getConnection().createStatement();//callable statemnt to get some data
		ResultSet rs=st.executeQuery("select * from student");//result set 
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));//print value
		}
		con.getConnection().close();
		Casestudy1 Case= new Casestudy1();
		Case.choice();
						
	}
}