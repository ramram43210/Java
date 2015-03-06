import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao
{
		@Override
		public List<Employee> getAllEmployees()
		{
				DataSource dataSource = new DataSource();
				Connection con = dataSource.createConnection();
				Statement stmt = null;
				ResultSet rs = null;
				List<Employee> employeeList = new ArrayList<Employee>();
				try
				{
						String query = "SELECT * FROM employee";
						stmt = con.createStatement();
						rs = stmt.executeQuery(query);
						while( rs.next() )
						{
								Employee employee = new Employee();
								employee.setEmployeeId(rs.getInt("Employee_Id"));
								employee.setName(rs.getString("Name"));
								employee.setAge(rs.getInt("age"));
								employeeList.add(employee);
						}
				}
				catch( SQLException e )
				{
						e.printStackTrace();
				}

				finally
				{
						try
						{
								if( con != null )
								{
										con.close();
								}
								if( stmt != null )
								{
										stmt.close();
								}
								if( rs != null )
								{
										rs.close();
								}
						}
						catch( Exception exe )
						{
								exe.printStackTrace();
						}

				}
				return employeeList;
		}

		@Override
		public void addEmployee( Employee employee )
		{
				Connection dbConnection = null;
				Statement statement = null;

				String sql = "insert into employee values(" + employee.getEmployeeId() + "," + "'" + employee.getName()
				                + "'" + "," + employee.getAge() + ")";

				try
				{
						DataSource dataSource = new DataSource();
						dbConnection = dataSource.createConnection();
						statement = dbConnection.prepareStatement(sql);
						statement.executeUpdate(sql);

						System.out.println("Record is inserted into Employee table for Employee : " + employee.getName());

				}
				catch( SQLException e )
				{

						e.printStackTrace();

				}
				finally
				{

						if( statement != null )
						{
								try
								{
										statement.close();
								}
								catch( SQLException e )
								{
										e.printStackTrace();
								}
						}

						if( dbConnection != null )
						{
								try
								{
										dbConnection.close();
								}
								catch( SQLException e )
								{
										e.printStackTrace();
								}
						}

				}

		}

		@Override
		public Employee getEmployee( int employeeId )
		{
				DataSource dataSource = new DataSource();
				Connection con = dataSource.createConnection();
				Statement stmt = null;
				ResultSet rs = null;
				try
				{
						String query = "SELECT * FROM employee where employee_id="+employeeId;
						stmt = con.createStatement();
						rs = stmt.executeQuery(query);
						while( rs.next() )
						{
								Employee employee = new Employee();
								employee.setEmployeeId(rs.getInt("Employee_Id"));
								employee.setName(rs.getString("Name"));
								employee.setAge(rs.getInt("age"));
								return employee;
						}
				}
				catch( SQLException e )
				{
						e.printStackTrace();
				}

				finally
				{
						try
						{
								if( con != null )
								{
										con.close();
								}
								if( stmt != null )
								{
										stmt.close();
								}
								if( rs != null )
								{
										rs.close();
								}
						}
						catch( Exception exe )
						{
								exe.printStackTrace();
						}

				}
				return null;
		}

		@Override
		public void updateEmployee( Employee employee )
		{
				Connection dbConnection = null;
				Statement statement = null;

				String sql = "update employee set name=" + "'" + employee.getName() + "'" + "where employee_id="
				                + employee.getEmployeeId();

				try
				{
						DataSource dataSource = new DataSource();
						dbConnection = dataSource.createConnection();
						statement = dbConnection.prepareStatement(sql);
						statement.executeUpdate(sql);

						System.out.println("Record is updated into Employee table for Employee id : "
						                + employee.getEmployeeId());

				}
				catch( SQLException e )
				{

						e.printStackTrace();

				}
				finally
				{

						if( statement != null )
						{
								try
								{
										statement.close();
								}
								catch( SQLException e )
								{
										e.printStackTrace();
								}
						}

						if( dbConnection != null )
						{
								try
								{
										dbConnection.close();
								}
								catch( SQLException e )
								{
										e.printStackTrace();
								}
						}

				}
		}

		@Override
		public void deleteEmployee( int  employeeId )
		{
				Connection dbConnection = null;
				Statement statement = null;

				String sql = "delete from employee where employee_Id="+ employeeId;

				try
				{
						DataSource dataSource = new DataSource();
						dbConnection = dataSource.createConnection();
						statement = dbConnection.prepareStatement(sql);
						statement.executeUpdate(sql);

						System.out.println("Record is deleted from Employee table for Employee id : "
						                + employeeId);

				}
				catch( SQLException e )
				{

						e.printStackTrace();

				}
				finally
				{

						if( statement != null )
						{
								try
								{
										statement.close();
								}
								catch( SQLException e )
								{
										e.printStackTrace();
								}
						}

						if( dbConnection != null )
						{
								try
								{
										dbConnection.close();
								}
								catch( SQLException e )
								{
										e.printStackTrace();
								}
						}

				}
		}

}
