package com.example;
import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
//Class.forName("com.mysql.jdbc.Driver");  
;  
Connection con = DriverManager.getConnection("jdbc:mySQL://localhost:3306/hr","root","welcome");

Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from employees");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}
catch(Exception e)
{ 
	System.out.println(e);
} 
           
}  
}  