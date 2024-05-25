package java_9_features.try_with_resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TryWithResourceTest {

	public static void main(String[] args) throws Exception {
		
		//Load the driver.
				//Oracle -> OJDBC.jar->OracleDriver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//get the connection
				String url = "jdbc:oracle:thin:@localhost:1524:xe"; 
				String userName="demo_db";
				String pwd="demo_db";
				String query="select * from emp_data where emp_name='"+userName+"' and emp_password='"+pwd+"'";
				Connection con=null;
				Statement stmt=null;
				ResultSet rs=null;
				//List<Employee> l= null;
				try {
					con=DriverManager.getConnection(url, userName, pwd);
					System.out.println("connection is successful");
					 stmt=con.createStatement();
					 rs=stmt.executeQuery(query);
					//l=new ArrayList<Employee>();
					while(rs.next()) {
						//Employee e= new Employee();
						String empName=rs.getString("EMP_NAME");
						long empId=rs.getInt("EMP_ID");
						long empMobile=rs.getInt("EMP_MOBILE");
						long empadhar=rs.getLong("ADHAR_NUMBER");
						
						System.out.println("Emp Name is "+empName+" Emp Id is "+empId+" empMobile "+empMobile+" emp Adhar is "+empadhar);
						//e.setEmpName(empName);
						//e.setEmpId(empId);
						//e.setEmpMobile(empMobile);
						//e.setAdharNumber(empadhar);
						//l.add(e);
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if(con!=null) {
						con.close();
					}
					if(stmt!=null) {
						stmt.close();
					}
					if(rs!=null) {
						rs.close();
					}
				}
				//return l;
				
	}
}
