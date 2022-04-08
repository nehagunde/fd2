import java.sql.*;
import java.util.*;
class User
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC84","IPC84");
System.out.println("Established");

//read Name from the user
Scanner s=new Scanner(System.in);
System.out.println("enter the employee idy");
int empid=s.nextInt();
Statement sct=con.createStatement();
String sql="select *from employee";
ResultSet rs=sct.executeQuery(sql);
boolean result=false;

while(rs.next())
{
//chech the rows line by line until all the records are comple

//verify input with ROLLNO with first column of your table
if(empid==rs.getInt(2))
{
System.out.println("You are valid user");
System.out.println("hello"+rs.getString(1));
result=true;
break;
}
}
if(result==false)
{
System.out.println("invalid user");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}



