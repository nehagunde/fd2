import java.sql.*;
class Example
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC84","IPC84");
System.out.println("Established");

Statement sct=con.createStatement();
String sql="insert into student values('abc',1)";
sct.executeUpdate(sql);
String sql="select *from student";
ResultSet r=s.executeQuery(sql);
while(r.next())
{
  System.out.println(r.getInt(1)+" "+r.getString(2));
}
s.executeUpdate(sql);
System.out.println("successfull");

}
}
