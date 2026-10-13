import java.sql.*;
public class Test{
public static void main(String s[])throws Exception
{  
Connection con;
PreparedStatement ps;
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LohaBarani","root","");
ps=con.prepareStatement("insert into LohaBarani values(111,'LohaBarani','BE(ECE)',8.35)");
ps.executeUpdate();
ps.close();
System.out.println("Student Record Inserted");
}
}
 
