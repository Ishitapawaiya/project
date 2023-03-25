package com.project01.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project01.model.Shipped_order;
import com.project01.util.DBConnection;

public class Shipped_orderDao implements  IShipped_order<Shipped_order>  {

	private static final int ORDER_ID = 0;  

	@Override
	public List<Shipped_order> findAll() throws SQLException {
		final List<Shipped_order> Shipped_orderList=new ArrayList<>();
				
	   final Connection connection=DBConnection.getConnection();
	   final Statement sellectAllShipped_order= connection.createStatement();
	   final String select="SELECT SHIPPED_ORDER_ID,STATUS,ORDER_ID,PERSON_ID FROM SHIPPED_ORDER";
	   final ResultSet resultSet=sellectAllShipped_order.executeQuery(select);
	   while (resultSet.next()) {
		   Shipped_order s= new Shipped_order(
				   resultSet.getInt("SHIPPED_ORDER_ID"),
				   resultSet.getString("STATUS"),
				   resultSet.getInt("ORDER_ID"),
				   resultSet.getInt("PERSON_ID"));
	               
				   Shipped_orderList.add(s);
	   }
	  resultSet.close();
	  sellectAllShipped_order.close();
	  connection.close();
	  return Shipped_orderList;
	}

	@Override
	public Shipped_order findOneById(int id) throws SQLException {
		Shipped_order Shipped_order=null;
		final Connection connection=DBConnection .getConnection();
		
	final String select="SELECT SHIPPED_ORDER_ID,STATUS,ORDER_ID,PERSON_ID FROM SHIPPED_ORDER" + "WHERE SHIPPED_ORDER_ID=? ";
		
		final PreparedStatement preparedStatement=connection.prepareStatement(select);
		preparedStatement.setDouble(1, id);
		
		final ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			Shipped_order=new Shipped_order(
					resultSet.getInt("SHIPPED_ORDER_ID"),
					resultSet.getString("STATUS"),
					resultSet.getInt("ORDER_ID"),
					resultSet.getInt("PERSON_ID")
					
	          );		
			}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return Shipped_order;
		}
	

	@Override
	public Shipped_order findOneByStatus(String STATUS) throws SQLException {
		
		Shipped_order shipped_order=null;
		final Connection connection=DBConnection.getConnection();
		
		final String select="SELECT SHIPPED_ORDER_ID,STATUS,ORDER_ID,PERSON_ID FROM SHIPPED_ORDER\" + \"WHERE STATUS=? ";
		final PreparedStatement preparedStatement=connection.prepareStatement(select);
		preparedStatement.setString(1, STATUS);
		
		final ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			shipped_order = new Shipped_order(
					resultSet.getInt("SHIPPED_ORDER_ID"),
					resultSet.getString("STATUS"),
					resultSet.getInt("ORDER_ID"),
					resultSet.getInt("PERSON_ID")
					
					);			}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return shipped_order ;
	}


	@Override
	public Shipped_order findOneById1(int ORDER_ID) throws SQLException {
		Shipped_order shipped_order=null;
		final Connection connection=DBConnection.getConnection();
		
		final String select="SELECT SHIPPED_ORDER_ID,STATUS,ORDER_ID,PERSON_ID FROM SHIPPED_ORDER\" + \"WHERE ORDER_ID=? ";
		final PreparedStatement preparedStatement=connection.prepareStatement(select);
		preparedStatement.setInt(1, ORDER_ID);
		
		final ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			shipped_order = new Shipped_order(
					resultSet.getInt("SHIPPED_ORDER_ID"),
					resultSet.getString("STATUS"),
					resultSet.getInt("ORDER_ID"),
					resultSet.getInt("PERSON_ID")
					
					);			}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return shipped_order ;
	}

	@Override
	public Shipped_order findOneByid(int PERSON_ID) throws SQLException {
		Shipped_order shipped_order=null;
		final Connection connection=DBConnection.getConnection();
		
		final String select="SELECT SHIPPED_ORDER_ID,STATUS,ORDER_ID,PERSON_ID FROM SHIPPED_ORDER\" + \"WHERE PERSON_ID=? ";
		final PreparedStatement preparedStatement=connection.prepareStatement(select);
		preparedStatement.setInt(1, PERSON_ID);
		
		final ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			shipped_order = new Shipped_order(
					resultSet.getInt("SHIPPED_ORDER_ID"),
					resultSet.getString("STATUS"),
					resultSet.getInt("ORDER_ID"),
					resultSet.getInt("PERSON_ID")
					
					);			}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return shipped_order ;
	}

	
}

	