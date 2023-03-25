package com.project01.Dao;

import java.sql.SQLException;
import java.util.List;

public interface IShipped_order<T> {

		List <T> findAll()throws SQLException;
		T findOneById (int SHIPPED_ORDER_ID) throws SQLException;
		T findOneByStatus (String STATUS) throws SQLException;
		T findOneById1 (int ORDER_ID)throws SQLException;
		T findOneByid(int PERSON_ID) throws SQLException;
}

