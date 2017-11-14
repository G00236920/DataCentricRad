package com.geog.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.geog.Model.Region;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class RegionDAO {
	
	private static Statement st 	= null;	    
	private static Connection conn 	= null;
	private static ResultSet rs 	= null;
	private static MysqlDataSource mysqlDS = new MysqlDataSource();

	
	public static List<Region> getRegions() {
		
		ArrayList<Region> regions = new ArrayList <Region>();
		

		   try {
	
			   mysqlDS.setURL("jdbc:mysql://localhost:3306/geography");
	
			   mysqlDS.setUser("root");
	
			   mysqlDS.setPassword("root");
			   			   
			   conn = mysqlDS.getConnection();
	
	
			   st = conn.createStatement();
			   
			   rs = st.executeQuery("select * from region;");
	        
			while (rs.next()) {
				
				Region r = new Region();
				
		        r.setCo_code(rs.getString("co_code"));
		        r.setReg_code(rs.getString("reg_code"));
		        r.setReg_name(rs.getString("reg_name"));
		        r.setReg_desc(rs.getString("reg_desc"));
	        
		        regions.add(r);
		        
			}
	
		}
		catch (SQLException e) {
	
			e.printStackTrace();
			System.out.println("Regions Failed to Connect");
		}
		
		return regions;
		
	}
	
	public static void add(){
		
	}
	
	public static void delete(){
		
	}
	
	public static void update(){
		
	}

}