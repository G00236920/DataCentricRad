package com.geog.DAO;

import java.sql.*;
import java.util.*;

import com.geog.Model.Country;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class CountryDAO {
	
	private static Statement st 	= null;	    
	private static Connection conn 	= null;
	private static ResultSet rs 	= null;
	private static MysqlDataSource mysqlDS = new MysqlDataSource();
	
	public static List<Country> getCountries(){
		
		
		List <Country> countries =  new ArrayList <Country>();
		
		   try {

			   mysqlDS.setURL("jdbc:mysql://localhost:3306/geography");

			   mysqlDS.setUser("root");

			   mysqlDS.setPassword("root");
			   
			   conn = mysqlDS.getConnection();


			   st = conn.createStatement();
			   
			   rs = st.executeQuery("select * from country;");
				
				while (rs.next()) {
					
	                Country c = new Country();
	                
	                c.setCo_code(rs.getString("co_code"));
	                c.setCo_name(rs.getString("co_name"));
	                c.setCo_details(rs.getString("co_details"));
	                
	                countries.add(c);
				}

			} catch (SQLException e) {

				e.printStackTrace();
				System.out.println("Countries Failed to Connect");
			}
				
		return countries;
		
	}
	
	public static void add(){
		
	}
	
	public static void delete(){
		
	}
	
	public static void update(){
		
	}
}