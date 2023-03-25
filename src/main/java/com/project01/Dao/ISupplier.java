package com.project01.Dao;

import java.sql.SQLException;
import java.util.List;

public interface ISupplier<T> {
	List <T> findAll()throws SQLException;
	T findOneById (double id) throws SQLException;
	T findOneByName (String name) throws SQLException;
	T findOneByCompany (String company_name)throws SQLException;
//	T findOneByEmail (String email)throws SQLException;
	
}
