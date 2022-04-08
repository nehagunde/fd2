import java.sql.*;
import java.util.*;
class UserDemo
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
System.out.println("enter the student number");
int stuno=s.nextInt();
Statement sct=con.createStatement();
String sql="select *from student where rollno="+stuno;
ResultSet rs=sct.executeQuery(sql);
boolean result=false;

while(rs.next())
{
//chech the rows line by line until all the records are comple

//verify input with ROLLNO with first column of your table

System.out.println("You are valid user");
System.out.println("hello"+rs.getString(1));
result=true;
break;

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



