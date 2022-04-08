import java.sql.*;
class Update
 {
    public static void main(String args[])
  {
     try
       {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Loaded");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC84","IPC84");
        System.out.println("Established");
        Statement s=con.createStatement();
        String sql="update student set Name='neha' where Rollno=1";
        s.executeUpdate(sql);
      System.out.println("successfull");
      }
  catch(Exception e)
 {
    System.out.println(e);
 }
}
}
