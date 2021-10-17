package viscositydb;
import java.sql.*;

public class Database {
	
	private Connection con;
	
	Database() {
		
		openConnection();
		
		makeTable(con);
	}
	
	public Connection getMyConnection () {
		
		return con;
	}
	public void openConnection() {
		
		String url = "jdbc:derby:ViscosityDB;create=true";
		
		try {
			
			this.con = DriverManager.getConnection(url);
			
			System.out.println("Connection successful");
						
						

		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
	public void closeConnection (Connection c) throws SQLException {
		
		c.close();
	}
	
	public void makeTable (Connection c) {
		
		try {
			
			Statement stm = c.createStatement();
			
			String sql = "CREATE TABLE Cars (Model_Year INTEGER, Make CHAR(25), Model CHAR(25), Viscosity CHAR(25))";
			
			stm.execute(sql);
			
	        stm.execute("INSERT INTO Cars VALUES (2016, 'Ford', 'Fiesta', '5W-20')");
			
			stm.execute("INSERT INTO Cars VALUES (2012, 'Honda', 'Accord', '0W-20')");
			
			stm.execute("INSERT INTO Cars VALUES (2010, 'Ford', 'Escape', '5W-20')");
			
			stm.execute("INSERT INTO Cars VALUES (2016, 'Ford', 'Fiesta', '5W-20')");
			
			stm.execute("INSERT INTO Cars VALUES (2018, 'Jeep', 'Cherokee', '0W-20')");
			
			System.out.println("Table Created");
			

		} catch (Exception e) {
			
			System.out.println(e.getMessage());

		}
	}
	
	public void dropTable(Connection c) {
		
		try {
			Statement stm = c.createStatement();
			String sql = "DROP TABLE Cars";
			stm.execute(sql);
			System.out.println("Table dropped");
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	public void populateValue(Connection c, int year, String make, String model, String visc) throws SQLException {
		
		String sql = String.format("INSERT INTO Cars VALUES (%d, '%s', '%s', '%s')", year, make, model, visc);
		
		Statement stm = c.createStatement();
		
		stm.execute(sql);
		
		System.out.println("Record Added");
		
	}
	
	public void deleteValue(Connection c, int year, String make, String model) throws SQLException {
		
		String sql = String.format("DELETE from Cars WHERE Model_year = %d AND Make = '%s' AND Model = '%s'", year, make, model);
		
		Statement stm = c.createStatement();
		
		stm.execute(sql);
		
		System.out.println("Record Deleted");
		
	}
	
	public String makeQuery(Connection con, int year, String make, String model) throws SQLException {
		
		String s;
		String sql = String.format("SELECT Viscosity FROM Cars WHERE Model_Year = %d AND Make = '%s' AND Model = '%s'",
				year, make, model);
		
		Statement stm = con.createStatement();
		
		ResultSet result = stm.executeQuery(sql);
		
		result.next();
		s = result.getString("Viscosity");
		
		System.out.printf("Querying for %d %s %s:\n", year, make, model);

		return s;
	}

}
