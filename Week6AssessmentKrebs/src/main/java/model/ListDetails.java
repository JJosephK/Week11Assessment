package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Oct 13, 2021
 */
@Entity
public class ListDetails {
	@Id
	@GeneratedValue
	
	private int id;
	private String listName;
	private LocalDate tripDate;
	@ManyToOne (cascade=CascadeType.PERSIST)
	private Store store;
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<groceryItem> listOfItems;
	
	public ListDetails() {
		super();
	}
	
	public ListDetails(int id, String listName, LocalDate tripDate,
			Store store, List<groceryItem> listOfItems) {
		this.id = id;
		this.listName = listName;
		this.tripDate = tripDate;
		this.store = store;
		this.listOfItems = listOfItems;
	}
	public ListDetails(String listName, LocalDate tripDate,
			Store store, List<groceryItem> listOfItems) {
		this.listName = listName;
		this.tripDate = tripDate;
		this.store = store;
		this.listOfItems = listOfItems;
	}
	public ListDetails(String listName, LocalDate tripDate,
			Store store) {
		this.listName = listName;
		this.tripDate = tripDate;
		this.store = store;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	public LocalDate getTripDate() {
		return tripDate;
	}
	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}
	public Store getShopper() {
		return store;
	}
	public void setShopper(Store store) {
		this.store = store;
	}
	public List<groceryItem> getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(List<groceryItem> listOfItems) {
		this.listOfItems = listOfItems;
	}
	@Override
	public String toString() {
		return "ListDetails [id=" + id + ", listName=" + listName + ", tripDate=" + tripDate + ", store=" + store
				+ ", listOfItems=" + listOfItems + "]";
	}
}
