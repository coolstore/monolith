package com.redhat.coolstore.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
public class Product implements Serializable {

	private static final long serialVersionUID = -123423423141232L;
	
	@XmlElement
	private String itemId;
	
	@XmlElement
	private String name;
	
	@XmlElement
	private String desc;
	
	@XmlElement
	private double price;

	@XmlElement
    private String location;


    @XmlElement
    private int quantity;

    @XmlElement
    private String link;


	public Product() {

	}

	public Product(ProductEntity prod) {
		super();
		this.itemId = prod.getItemId();
		this.name = prod.getName();
		this.desc = prod.getDesc();
		this.price = prod.getPrice();
		Inventory invent = prod.getInventory();
		this.location = invent.getLocation();
		this.link = invent.getLink();
		this.quantity = invent.getQuantity();

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}


	@Override
	public String toString() {
		return "Product [itemId=" + itemId + ", name=" + name + ", desc="
				+ desc + ", price=" + price + ", quantity=" + quantity+ "]";
	}



}
