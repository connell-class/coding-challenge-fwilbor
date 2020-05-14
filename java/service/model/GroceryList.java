
package com.revature.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "groceryList")
public class GroceryList {

	@Id
	@Column(name = "grocery_list_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@OneToMany(mappedBy = "groceryList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<GroceryItem> groceryItems = new HashSet<GroceryItem>();

	public GroceryList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroceryList(int id, String name, Set<GroceryItem> groceryItems) {
		super();
		this.id = id;
		this.name = name;
		this.groceryItems = groceryItems;
	}
	

	public GroceryList(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<GroceryItem> getGroceryItems() {
		return groceryItems;
	}

	public void setGroceryItems(Set<GroceryItem> groceryItems) {
		this.groceryItems = groceryItems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groceryItems == null) ? 0 : groceryItems.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryList other = (GroceryList) obj;
		if (groceryItems == null) {
			if (other.groceryItems != null)
				return false;
		} else if (!groceryItems.equals(other.groceryItems))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroceryList [id=" + id + ", name=" + name + ", groceryItems=" + groceryItems + "]";
	}

}