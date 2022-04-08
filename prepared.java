//WRITE JDBC PROGRAM TO INSERT VALUES INTO TABLE USING PREPARED STATEMENT OBJECT.
import java.sql.*;
import java.util.*;
class Prepared
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC84","IPC84");
System.out.println("Established");

//prepared statement
PreparedStatement ps=con.prepareStatement("delete from employee where empid=?");

ps.setInt(2,3);

int i=ps.executeUpdate();  
System.out.println(i+" records inserted");  
}
catch(Exception e)
{ System.out.println(e);}  
  
}  
} 






