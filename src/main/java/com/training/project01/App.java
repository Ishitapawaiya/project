package com.training.project01;

import com.project01.Dao.Shipped_orderDao;
import com.project01.Dao.SupplierDao;
import com.project01.model.Shipped_order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        final SupplierDao supplier;
        try {
			System.out.println("####################################### Hello World!");
			 final SupplierDao supplier1 = new SupplierDao();
			 final Shipped_orderDao shipped=new Shipped_orderDao();
			 
			 System.out.println("List of Products ");
				shipped.findAll().stream().forEach(System.out::println);
//				
//
//			System.out.println("List of Products ");
//			supplier1.findAll().stream().forEach(System.out::println);
//			
//			System.out.println("supplier By supplier_Id= 1 ");
//			System.out.println(supplier1.findOneById(1));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

    }
}
