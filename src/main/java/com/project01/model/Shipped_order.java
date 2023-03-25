package com.project01.model;

import java.util.Objects;

public class Shipped_order
{
	private int Shipped_order_id;
	private String status;
	private int order_id ;
	private int person_id;
	public Shipped_order() {
		super();
	}
	
	
	public Shipped_order(int shipped_order_id, String status, int order_id, int person_id) {
		super();
		Shipped_order_id = shipped_order_id;
		this.status = status;
		this.order_id = order_id;
		this.person_id = person_id;
	}

	public int getShipped_order_id() {
		return Shipped_order_id;
	}
	public void setShipped_order_id(int shipped_order_id) {
		Shipped_order_id = shipped_order_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(Shipped_order_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shipped_order other = (Shipped_order) obj;
		return Shipped_order_id == other.Shipped_order_id;
	}
	@Override
	public String toString() {
		return "Shipped_order [Shipped_order_id=" + Shipped_order_id + ", status=" + status + ", order_id=" + order_id
				+ ", person_id=" + person_id + "]";
	}
    

}
