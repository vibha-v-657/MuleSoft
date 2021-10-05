package mulesoft;

import java.sql.*;

public class mulesoft {

	public static void main(String[] args) 
	{
		try{  
			   
				Class.forName("oracle.jdbc.driver.OracleDriver");  
		       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl657","scott","bantu");  
			   Statement stmt=con.createStatement(); 
			   
			   
			   String c_table="CREATE TABLE  MOVIE1(M_NAME VARCHAR(255), ACTOR VARCHAR(255), ACTRESS VARCHAR(255), DIRECTOR VARCHAR(255), YEAR NUMBER(4), PRIMARY KEY(M_NAME,YEAR))";
			   ResultSet rs1=stmt.executeQuery(c_table);
			   
			   
			     String ins1="INSERT INTO MOVIE1 VALUES('STUDENT OF THE YEAR','SIDHARTH MALHOTRA','ALIA BHATT','KARAN JOHAR',2012)";
			     String ins2="INSERT INTO MOVIE1 VALUES('KALANK','VARUN DHAWAN','ALIA BHATT','ABHISHEK VARMAN',2019)";
				 ResultSet rs2=stmt.executeQuery(ins1);
				 ResultSet rs3=stmt.executeQuery(ins2);
				 
				 
				 String sel1="SELECT * FROM MOVIE1";
				 System.out.println("MOVIE TABLE CONTAINS: ");
				 ResultSet rs4=stmt.executeQuery(sel1);
				   while(rs4.next())  
					   	   System.out.println(rs4.getString(1)+"  "+rs4.getString(2)+"  "+rs4.getString(3)+" "+rs4.getString(4)+" "+rs4.getInt(5));
				 System.out.println();
				 
				 
				 String sel2="SELECT ACTOR FROM MOVIE1 WHERE M_NAME='KALANK'";
				 ResultSet rs5=stmt.executeQuery(sel2);
				 System.out.println("ACTOR OF MOVIE KALANK IS: ");
				 while(rs5.next())  
				   	   System.out.println(rs5.getString(1));
			 System.out.println();
			 con.close();  
				  
				  }catch(Exception e){ 
				   System.out.println(e);}

	}

}
