package crude;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.mysql.jdbc.PreparedStatement;

public class Delete
{
	Connectionmanager con=new Connectionmanager();
	public void deleteData() throws SQLException, ClassNotFoundException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the regno");
		int id=s.nextInt();
		PreparedStatement ps=(PreparedStatement)con.getConnection().prepareStatement("delete from student where reg_no=?");//delete statement
		ps.setInt(1,id);
		ps.executeUpdate();
		System.out.println("deleted successfully");
	    con.getConnection().close();
	    Casestudy1 Case= new Casestudy1();
		Case.choice();
						

		
	}

}
