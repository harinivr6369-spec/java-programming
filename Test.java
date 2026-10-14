import java.sql.*;
public class Test
{
public static void main(String s[])throws Exception
{
Connection con;
PreparedStatement ps;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harini","root","");
ps=con.prepareStatement("insert into student values(101,'harini','Msc(CS)',9.35)");
ps.executeUpdate();
System.out.println("Insert Successfully");
ps=con.prepareStatement("UPDATE `student` SET `dept`='CSE' WHERE `rollno`=101");
ps.executeUpdate();
System.out.println("Updated Successfully ");
ps=con.prepareStatement("SELECT * FROM `student` ");
System.out.println("Student Records");
ResultSet rs=ps.executeQuery();
while(rs.next())
{System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));}
ps=con.prepareStatement("DELETE FROM `student` WHERE `rollno`=101 ");
ps.executeUpdate();
System.out.println("Deleted Successfully ");
}
}
