package goi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Process_Refrigerator {
	private Connection con;
	
	public Connection getCon()
	{
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_refrigerator", "root", "admin");
		} catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return con;
	}
	
	public boolean insertRefrigerator(String ID, String Name, String Company, Double Price, Double Amount)
	{
		String sql = "insert tb_refrigerator(id, name, company, price, amount) values(?, ?, ?, ?, ?)";
		try
		{
			con = getCon();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ID);
			ps.setString(2, Name);
			ps.setString(3, Company);
			ps.setDouble(4, Price);
			ps.setDouble(5, Amount);
			
			int e = ps.executeUpdate();
			return e > 0;
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}
