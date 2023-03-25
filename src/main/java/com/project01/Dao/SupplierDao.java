package com.project01.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project01.model.Supplier;
import com.project01.util.DBConnection;

public class SupplierDao implements  ISupplier<Supplier>  {

	@Override
	public List<Supplier> findAll() throws SQLException {
		final List<Supplier> SupplierList=new ArrayList<>();
				
	   final Connection connection=DBConnection.getConnection();
	   final Statement sellectAllSupplier= connection.createStatement();
	   final String select="select supplier_id,supplier_name,company_name,email from supplier";
	   final ResultSet resultSet=sellectAllSupplier.executeQuery(select);
	   while (resultSet.next()) {
		   Supplier s=new Supplier
				   (resultSet.getDouble("supplier_id"),
	                resultSet.getString("supplier_name"),
	                resultSet.getString("company_name"),
	                resultSet.getString("email")
	                );
	                
		   SupplierList.add(s);
	   }
	  resultSet.close();
	  sellectAllSupplier.close();
	  connection.close();
	  return SupplierList;
	}

	@Override
	public Supplier findOneById(double id) throws SQLException {
		Supplier supplier=null;
		final Connection connection=DBConnection .getConnection();
		
		final String select="select supplier_id, supplier_name, company_name,email from supplier" + "where supplier_id=? ";
		
		final PreparedStatement preparedStatement=connection.prepareStatement(select);
		preparedStatement.setDouble(1, id);
		
		final ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			supplier=new Supplier(
					resultSet.getDouble("supplier_id"),
					resultSet.getString("supplier_name"),
					resultSet.getString("company_name"),
					resultSet.getString("email")
					
					);			}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return supplier;
		}
	@Override
	public Supplier findOneByName(String name) throws SQLException {
		Supplier supplier=null;
		final Connection connection=DBConnection.getConnection();
		
		final String select="select supplier_id,supplier_name,company_name,email from supplier"
				+ " where supplier_name=?";
		final PreparedStatement preparedStatement=connection.prepareStatement(select);
		preparedStatement.setString(1, name);
		
		final ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			supplier=new Supplier(
					resultSet.getDouble("supplier_id"),
					resultSet.getString("supplier_name"),
					resultSet.getString("company_name"),
					resultSet.getString("email")
					
					);			}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return supplier;

	}



	@Override
	public Supplier findOneByCompany(String company_name) throws SQLException {
		Supplier supplier=null;
		final Connection connection=DBConnection.getConnection();
		
		final String select="select supplier_id,supplier_name,company_name,email from supplier"
				+ " where company_name=?";
		final PreparedStatement preparedStatement=connection.prepareStatement(select);
		preparedStatement.setString(1, company_name);
		
		final ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			supplier=new Supplier(
					resultSet.getDouble("supplier_id"),
					resultSet.getString("supplier_name"),
					resultSet.getString("company_name"),
					resultSet.getString("email")
					
					);			}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return supplier;
	}


		}