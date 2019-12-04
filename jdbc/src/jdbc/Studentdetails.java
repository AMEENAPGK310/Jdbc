package jdbc;
import java.util.*;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentdetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		if(con!=null)//connection checking
			System.out.println("connection successfull");
		else
			System.out.println("check connection");
		Scanner s=new Scanner(System.in);
		System.out.println("1)insert\n2)display");
		System.out.println("enter the operation");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
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
		PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into student(Name,Reg_no,Department,Year,Address)values(?,?,?,?,?)");//insert statement
		ps.setString(1,name);
		ps.setInt(2,reg);
		ps.setString(3,dep);
		ps.setInt(4,y);
		ps.setString(5,add);
		ps.executeUpdate();
		System.out.println("successfull");
		con.close();//connection close
		break;
		case 2:
			Statement st=con.createStatement();//callable statemnt to get some data
			ResultSet rs=st.executeQuery("select * from student");//result set 
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));//print value
			}
			con.close();
			}
		
			

	}

}
