package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Oct 13, 2021
 */
@Entity
@Table(name="store")
public class Store {
	@Id
	@GeneratedValue
	private int id;
	private String storeName;
	
	public Store() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	public Store(int id, String storeName) {
		super();
		this.id = id;
		this.storeName = storeName;
	}
	//This constructor allows us to just create a shopper and allow for auto-generation of id
	public Store(String storeName) {
		super();
		this.storeName = storeName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getShopperName() {
		return storeName;
	}
	
	public void setShopperName(String shopperName) {
		this.storeName = shopperName;
	}
	
	@Override
	public String toString() {
		return "Store [id=" + id + ", storeName=" + storeName + "]";
	}
}















