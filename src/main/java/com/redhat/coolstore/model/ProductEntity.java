package com.redhat.coolstore.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_CATALOG", uniqueConstraints = @UniqueConstraint(columnNames = "itemId"))
public class ProductEntity implements Serializable {

	private static final long serialVersionUID = -7304814269819778382L;
	
	@Id
	private String itemId;
	
	private String name;
	
	@Lob
	@Column(name="description")
	private String desc;
	
	private double price;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itemId")
	private Inventory inventory;

	public ProductEntity() {

	}

	public ProductEntity(String itemId, String name, String desc, double price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}



	@Override
	public String toString() {
		return "Product [itemId=" + itemId + ", name=" + name + ", desc="
				+ desc + ", price=" + price + "]";
	}



}
